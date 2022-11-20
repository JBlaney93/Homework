
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
        if self.sufficient_cash(guest) and len(self.guests) < self.capacity:
            self.guests.append(guest)

    def check_in_guests(self, guest):
        if len(self.guests) < self.capacity:
            self.guests.append(guest)
        else: 
            return 
    
    # def check_in_guests(self, guest):
    #     for guest in self.guests:
    #         if len(self.guests < self.capacity):
    #             self.guests.append(guest)
    #         else:
    #             return
        
# REALLY WANTED TO HAVE THIS LOOP, ADDING GUESTS UNTIL THE ROOM
# HITS CAPACITTY BUT FOR THE LIFE OF ME I COULD NOT GET IT TO WORK

    def check_out_guest(self, guest):
        self.guests.remove(guest)

    def max_capacity(self):
        return self.capacity

    def sufficient_cash(self, guest):
        if self.entry <= guest.cash:
            return True
        else:
            return False    

    

        

    