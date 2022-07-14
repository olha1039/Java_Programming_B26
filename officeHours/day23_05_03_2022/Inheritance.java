package day23_05_03_2022;

public class Inheritance {

 /*
       Inheritance IS-A Relationship
       SuperClass - Parent - Base : the class whose features are inherited
       SubClass   - Child -  Derived :the class that inherits features from other class
       public class Parent{
       }
       public class Child extends Parent {
       }
       What is inherited ?
        - All public and protected variables and methods
        - All default varaibles and methods (if parent and child needs to be in same package ) (PACKAGE-PRIVATE)
       What is not inherited ?
        - Private variables and methods CAN NOT be inherited (Access them with GETTER / SETTER )
        - Constructors CAN NOT be inherited
       Constructor
         - The parent class constr alwasy executess before child constr
         1. Child class constr MUST call parent constr
         2. Parent class default constr is called by child class default constr implicitly
         3. If the parent class constr is NOT DEFAULT, child one needs to call EXPLICITLY (manually)
     super   : refers to parent class objects
     super() : refers to parent class constr
                - MUST be in the first line from CHILD class constr
                - We can not use this() and super() at the same constr
     OVERRIDING
        Why we need ?
            - Sometimes a subclass inherits a method from parent
            but the method is inadquate for child classes
                Shape --> area ()
                Rectangle --> area()
                Circle --> area()
                ...
                ..
                .
         RULES :
             - There MUST be IS A RelationShip.Do it in subclass
             - Parameters , Return Type , methodName (same method signature)
             - Access Modifiers needs to be SAME or MORE VISIBLE
                - public            public
                - protected         public / protected
                - default           public / protected / default
                - private           CAN NOT BE INHERITED
             - private, final and static ones CAN NOT BE OVERRIDEN
        Method OVERLOADING
           - Perform in SAME CLASS
           - Parameters MUST be DIFFERENT
           - Access Modifier can be change
           - private , final methods can be overloading
           - Return Type does not effect overloading
        Method OVERRIDING
           - Occurs in two class that have IS-A Relationship
           - Parameters MUST be SAME
           - Access Modifiers needs to be SAME or MORE VISIBLE
           - private, final and static ones CAN NOT BE OVERRIDEN
           - Return Type needs to be SAME
        Can we override static methods ?
            NO
        Hiding Static Methods
            - OVERRIDING +
            - They needs to static methods
     */
}
