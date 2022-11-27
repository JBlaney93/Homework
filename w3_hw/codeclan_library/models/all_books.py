
from models.book import Book

book1 = Book('Guards! Guards!', 'Terry Pratchett', 'Fantasy')
book2 = Book('Levithan Wakes', 'James SA Corey', 'Science Fiction')
book3 = Book('Shogun', 'James Clavell', 'Historical Fiction')
book4 = Book('Moneyland', 'Oliver Bullough', 'Non-Fiction')
book5 = Book('Dune', 'Frank Herbert', 'Science Fiction')
book6 = Book('Quitters Never Win', 'Michael Bisping', 'Autobiography')
book7 = Book('Foundation', 'Isaac Asimov', 'Science Fiction')

book_list = [book1, book2, book3, book4, book5, book6, book7]


def get_book(book_index):
    return book_list[book_index]


def add_book(new_book):
    book_list.append(new_book)
    print(len(book_list))


def delete_book(title):
    book_to_delete = None
    for book in book_list:
        if book.title == title:
            book_to_delete = book
            break

    book_list.remove(book_to_delete)
