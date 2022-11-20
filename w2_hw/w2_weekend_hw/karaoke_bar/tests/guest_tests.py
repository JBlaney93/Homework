import unittest

from modules.room import Room
from modules.guest import Guest
from modules.song import Song

class TestGuest(unittest.TestCase):
    
    def setUp(self):
        self.guest = Guest("Big Shuggie", 20)

        self.room_rock = Room("Rock", 1, 10)
        self.room_power_ballads = Room("Power Ballads", 1, 50)

    def test_guest_has_name(self):
        self.assertEqual("Big Shuggie", self.guest.name)

    def test_guest_has_cash(self):
        self.assertEqual(20, self.guest.cash)

    def test_has_sufficient_cash__true_if_enough(self):
        self.assertEqual(True, self.guest.sufficient_cash(self.room_rock.entry))

    def test_has_sufficient_cash__false_if_not_enoguh(self):
        self.assertEqual(False, self.guest.sufficient_cash(self.room_power_ballads.entry))

    def test_guest_can_pay_entry_fee__decrease_money(self):
        self.guest.pay_entry(self.room_rock.entry)
        self.assertEqual(10, self.guest.cash)

