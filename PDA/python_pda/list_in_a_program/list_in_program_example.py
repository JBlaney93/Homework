#  WHAT IS A LIST?

# HOW DO WE USE A LIST IN A PROGRAM?

# WHAT ARE SOME THINGS WE CAN DO WITH A LIST?

# We can use a list to group and store objects such as strings or integers
# In python a list is declared by using square brackets [ ]
my_shopping = ["bananas", "porridge", "eggs", "oats", "peanutbutter"]
print(my_shopping)

# WE CAN INTERACT WITH OUR LIST BY USING METHODS SUCH AS:

# Using list.append() we can add an object to the end of the list
my_shopping.append("ice cream")
# print(my_shopping)

# We can use the index position of 0 to insert an item to the start of the list
my_shopping.insert(0, "cereal")
# print(my_shopping)


# Using sorted(list) method to sort alphabetically
my_shopping.sort()
# print(my_shopping)

# Reverse alphabetically
my_shopping.sort(reverse = True )
# print(my_shopping)


# We can also add one list to another
other_stuff = ["irn bru", "pizza", "chilli heatwave doritos"]
# print(my_shopping + other_stuff)

# we can print out our list by using a for loop:
for item in my_shopping:
    print(item)