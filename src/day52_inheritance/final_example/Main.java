package day52_inheritance.final_example;

public class Main {
    public static void main(String[] args) {

     new Parent().walk(); // made an object and cal a method, did them without references.
     new Child().walk(); // classes were instanced, so they were called with creating ob first
    }
}


class Parent {

    public final void walk(){
        System.out.println("You are walking");
    }

}

class Child extends Parent{

//    @Override
//    public final void walk(){
//
//    } we cannot override final methods
}