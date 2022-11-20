import unittest

from modules.room import Room
from modules.guest import Guest
from modules.song import Song

class TestRoom(unittest.TestCase):

    def setUp(self):
        self.room_disco = Room("Disco", 4, 5)
        self.room_pop = Room("Pop", 2, 5)
        self.room_hiphop = Room("Hip Hop", 3, 10)

        self.disco_song_1 = Song("Never Too Much")
        self.pop_song_1 = Song("Toxic")
        self.hiphop_song_1 = Song("Passionfruit")

        self.guest_1 = Guest("Barry", 20)
        self.guest_2 = Guest("Wully", 30)
        self.guest_3 = Guest("Boaby", 40)
        self.guest_4 = Guest("Rab", 0)
        self.guest_5 = Guest("Gordy", 20)
        self.guest_6 = Guest("Jambo", 100)

        self.guests = [self.guest_1, self.guest_2, self.guest_3]


    def test_room_has_name(self):
        self.assertEqual("Disco", self.room_disco.name)


    def test_room_has_capacity(self):
        self.assertEqual(4, self.room_disco.capacity)

    def test_room_has_entry_fee(self):
        self.assertEqual(5, self.room_disco.entry)


    def test_room_has_0_songs(self):
        self.assertEqual(0, self.room_disco.list_songs())


    def test_add_song_to_room(self):
        self.room_disco.add_song_to_room(self.room_disco)
        self.assertEqual(1, self.room_disco.list_songs())


    def test_room_has_0_guests(self):
        self.assertEqual(0, self.room_disco.list_guests())


    def test_check_in_guest(self):
        self.room_disco.check_in_guest(self.guest_1)
        self.assertEqual(1, self.room_disco.list_guests())

    def test_check_in_guests(self):
        self.room_pop.check_in_guests(self.guest_1)
        self.room_pop.check_in_guests(self.guest_2)
        self.room_pop.check_in_guests(self.guest_3)
        self.assertEqual(2, self.room_pop.list_guests())


    def test_check_rooom_max_capacity(self):
        capacity = self.room_disco.max_capacity()
        self.assertEqual(4, capacity)

    
    def test_add_multiple_guests_to_room(self):
        self.room_disco.check_in_guests(self.guest_1)
        self.room_disco.check_in_guests(self.guest_2)
        self.room_disco.check_in_guests(self.guest_3)
        self.room_disco.check_in_guests(self.guest_4)
        self.assertEqual(4, self.room_disco.list_guests())

    def test_add_guest_to_room_and_remove_cash(self):
        self.guest_3.pay_entry(self.room_hiphop.entry)
        self.room_hiphop.check_in_guest(self.guest_3)
        self.assertEqual(30, self.guest_3.cash)
        self.assertEqual(1, self.room_hiphop.list_guests())
        

    def test_add_guest_to_room__not_enough_cash(self):
        self.room_hiphop.check_in_guest(self.guest_4)
        self.assertEqual(0, self.room_hiphop.list_guests())


    def test_remove_guest_from_room(self):
        self.room_disco.check_in_guest(self.guest_1)
        self.room_disco.check_in_guest(self.guest_2)
        self.room_disco.check_out_guest(self.guest_1)
        self.assertEqual("Wully", self.guest_2.name)





        
