import unittest
from src.card import Card
from src.card_game import CardGame

class TestCardGame(unittest.TestCase):
    def setUp(self):
        self.card1 = Card('hearts', 1)
        self.card2 = Card('diamonds', 10)

    def test_card_has_suit(self):
        self.assertEqual('hearts', self.card1.suit)

    def test_card_has_value(self):
        self.assertEqual(1, self.card1.value)

    def test_check_for_ace(self):
        card = self.card1
        actual = CardGame.check_for_ace(self, card)
        expected = True
        self.assertEqual(expected, actual)

    def test_highest_card(self):
        card1 = self.card1
        card2 = self.card2
        actual = CardGame.highest_card(self, card1, card2)
        expected = card2
        self.assertEqual(expected, actual)

    def test_cards_total(self):
        cards = [self.card1, self.card2]
        actual = CardGame.cards_total(self, cards)
        expected = "You have a total of 11"
        self.assertEqual(expected, actual)