package day21_04_26_2022.accessModifier;

public class AccessModifier {

    /*
    How many access modifiers we have?
   =====>  4
    - public      --> Always reachable
    - protected   --> Same package ot=r subclasses (inheritance) in different packages
    - default     --> Same package (Package - Private / another name)
    - private     --> Same class

    Note:
        - We can use access modifiers with variables / Constr / Methods
        - A top level class can have public or default
     */

    public static void main(String[] args) {

        Person person = new Person();

        // public
        person.name = "Mike";

        // private
//        person.age = 0; it is not visible

        // default -> in same package
        person.ID = 1;

        //protected

        // same package
        person.DoB = "06.06.2006";

        // inheritance -> there is no inheritance
        AccessModifier accessModifier = new AccessModifier();
//        accessModifier.DoB = ""; can't reach


    }
}
