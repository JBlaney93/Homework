
from flask import render_template, request, redirect
from models.book import Book
from models.all_books import book_list, get_book, add_book, delete_book
from app import app

@app.route('/')
def index():
    return render_template('index.html')


@app.route('/books')
def books():
    return render_template('books.html', book_list=book_list)


@app.route('/books/<int:book_index>')
def book(book_index):
    book = get_book(book_index)
    return render_template('book.html', book=book)


@app.route('/books/new')
def new_book():
    return render_template('new_book.html')


@app.route('/books', methods=['POST'])
def save_book():
    form_data = request.form
    title = form_data['title']
    author = form_data['author']
    genre = form_data['genre']

    new_book = Book(title, author, genre)
    add_book(new_book)

    return redirect('/books')
    # return render_template('books.html', book_list=book_list)


@app.route('/books/delete/<title>', methods=['POST'])
def delete(title):
    delete_book(title)

    return redirect('/books') 