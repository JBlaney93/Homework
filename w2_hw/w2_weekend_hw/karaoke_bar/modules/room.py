
class Room:
    def __init__(self, name, capacity, entry):
        self.name = name
        self.capacity = capacity
        self.entry = entry
        self.guests = []
        # self.guests = {}
        self.songs = []

    def list_songs(self):
        return len(self.songs)

    def add_song_to_room(self, song):
        self.songs.append(song)

    def list_guests(self):
        return len(self.guests)

    def check_in_guest(self, guest):
        if guest.sufficient_cash(self.entry) and (len(self.guests) < self.capacity):
            self.guests.append(guest)

    
    def check_in_guests(self, new_guests):
        for guest in new_guests:
            if len(self.guests) < self.capacity:
                self.guests.append(guest)
            else:
                return
        


    def check_out_guest(self, guest):
        self.guests.remove(guest)

    def max_capacity(self):
        return self.capacity

    def sufficient_cash(self, guest):
        if self.entry <= guest.cash:
            return True
        else:
            return False    

    

        

    