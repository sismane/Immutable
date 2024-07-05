final classes can not be extended.
final variable can only be initialized and never be assigned later.

Creating an Immutable Class in Java

To create an immutable class in Java, you need to follow these general principles:

    Declare the class as final so it can’t be extended.
    Make all of the fields private so that direct access is not allowed.
    Don’t provide setter methods for variables.
    Make all mutable fields final so that a field’s value can be assigned only once.
    Initialize all fields using a constructor method performing deep copy.
    Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
