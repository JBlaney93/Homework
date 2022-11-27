
import unittest
from models.book import Book
from models.all_books import *

class TestBook(unittest.TestCase):
    def setUp(self):
        self.book = Book('1984', 'George Orwell', 'Dystopian Fiction')

        self.book1 = Book('Guards! Guards!', 'Terry Pratchett', 'Fantasy')
        self.book2 = Book('Levithan Wakes', 'James SA Corey', 'Science Fiction')
        self.book3 = Book('Shogun', 'James Clavell', 'Historical Fiction')

        self.new_book_list = [self.book1, self.book2, self.book3]

    def test_book_has_title(self):
        self.assertEqual('1984', self.book.title)

    def test_book_has_author(self):
        self.assertEqual('George Orwell', self.book.author)

    def test_book_has_genre(self):
        self.assertEqual('Dystopian Fiction', self.book.genre)

    # def test_book_index(self):
    #     self.assertEqual(self.book1, self.book_list[0])

    # def test_get_book(self):
    #     self.assertEqual(0, get_book(0))   

    # def test_book_added(self):
        
    #     add_book(self.book)
    #     self.assertEqual(4, len(book_list))
     