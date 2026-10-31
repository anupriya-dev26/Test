package oopsconcepts;


//6. Differentiate between Method Overloading and Method Overriding.
//Method Overloading:
      //Same method name with different parameters.
      //It happens in the same class.
       //It is an example of compile-time polymorphism.
     //Example: add(int a, int b) and add(int a, int b, int c).
//Method Overriding:
      //Same method name with same parameters.
      //It happens between parent and child classes.
      //It is an example of runtime polymorphism.
//Example: Parent class has sound() method. Child class also has sound() method with its own implementation.


//7. Difference between Abstract Class and Interface.
       //An abstract class is declared using the abstract keyword, but an interface is declared using the interface keyword.
       //An abstract class can have both abstract and normal methods, but an interface can have abstract and default methods.
       //A class can extend only one abstract class, but it can implement multiple interfaces.

//8.Explain the Four Main OOP Principles.
      //1. Encapsulation:
      //Encapsulation means wrapping data and methods into a single unit. It protects data using private variables.
      //2. Inheritance:
      //Inheritance means one class can acquire the properties and methods of another class.
      //3. Polymorphism:
      //Polymorphism means one method can perform different tasks in different ways.
      //4. Abstraction:
      //Abstraction means hiding implementation details and showing only essential information to the user.


//9. Can a private method of a parent class be overridden by a child class?
       
       //No, a private method cannot be overridden by a child class.
       //Because private methods are accessible only within their own class. They are not inherited by the child class.
       //If the child class creates a method with the same name, it is considered a separate method, not method overriding.
