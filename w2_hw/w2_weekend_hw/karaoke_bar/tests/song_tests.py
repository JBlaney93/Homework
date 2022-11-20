import unittest

from modules.room import Room
from modules.guest import Guest
from modules.song import Song

class TestSong(unittest.TestCase):

    def setUp(self):
        self.song = Song("September")

    def test_song_has_name(self):
        self.assertEqual("September", self.song.title)