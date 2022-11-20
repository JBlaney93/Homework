
class Guest:
    def __init__(self, name, cash):
        self.name = name
        self.cash = cash

    def sufficient_cash(self, entry):
        if self.cash >= entry:
            return True
        else:
            return False

    def pay_entry(self, entry):
        self.cash -= entry