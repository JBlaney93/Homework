### Testing task 1:

# Carry out static testing on the code below.
# Comment on any errors that you see below.

Note that we are only looking for errors here.

**Not** any issues with, i.e.: 
Thinking that methods should be renamed or should be class level, or using string interpolation etc. 

These aren't errors but rather standards that vary from developer to developer. 

Only comment on errors that would stop the tests running.

```python

class CardGame:


  def check_for_ace(self, card):
    if card.value = 1:
      return True
    else
      return False
  # on line 21: the if satement should use == to check for equality, not single = for assignment  


  dif highest_card(self, card1 card2):
  if card1.value > card2.value:
    return card
  else:
    return card2
  # on line 28: this should be def highest card, not dif highest_card
  # on line 28: there is no comma between card1 and card2 when passing in parameters
  # on line 30: return card should be return card1, card is not defined


def cards_total(self, cards):
  total
  for card in cards:
    total += card.value
    return "You have a total of" + total
  # on line 39: total variable should be set to = 0  

```
