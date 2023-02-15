
1. What does the word 'polymorphism' mean?

‘Poly’ means many and ‘morph’ means changes. To say something is ‘Polymorphic’ is to say that it can have many forms.

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.

If we had an ArrayList<Cars> and an ArrayList<Motorbikes>
We could use an Interface <IVehicle> and implement this on both classes. We could then have one single ArrayList<Vehicle> instead of two separate lists.

3. What can we use to implement polymorphism in Java?

We can use inheritance or interfaces or abstract class to implement polymorphism in Java.

4. How many 'forms' can an object take when using polymorphism?

As many as is required?

5. Give an example of when you could use polymorphism.

Any time we want to share methods between different classes, we can use interfaces. This means our object is both of its original type and of the interface type.
E.g. <Customer> <Shop> might both have the <IBuy> interface with the buy() method.
We can also use polymorphism through inheritance, where an object is of its own type but also of the superclass type.
Car Class is of type car and also of type Vehicle, from which it inherits.


6. What do we mean by 'composition' in reference to object-oriented programming?

A design choice as opposed to using inheritance. 'has a'
Composition is when an object is part of another object. 
E.g. Engine is part of a Car

7. When would you use composition? Provide a simple example in Java.

Composition is useful in maintaining single responsibility in our programs.
E.g. We might have an Engine class as part of a Car. By doing it this way, the Engine class can contain all relevant methods for Engine, making it responsible for exactly what it needs. This is instead of having all the Engine methods and properties in Car. 

--  NOT QUITE --

If the engine does not exist outside of the car, it is composition. i.e. if the car is deleted the engine is also deleted.


8. Give a difference between composition and aggregation?

Composition is a specialised form of aggregation

In composition, the objects are more tightly coupled. A Roof cannot exist without a House
In aggregation, objects are more loosely coupled, they can exist independent of each other.
A School can contain Students, but both can exist without the other


9. What is/are the advantage(s) of using composition/aggregation?

Both composition and aggregation allow for more reusable code. Programs are easier to test and more robust when objects are broken down into smaller components. Can just put in the things we needs, as opposed to inhertiting everything.


10. When using composition, when an object is destroyed, what happens to all the objects it is composed of?

All other objects and behaviours are destroyed.


11. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?

The objects can exist independently of each other so the component objects remain intact.
