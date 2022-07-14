package day52_inheritance.hiding;

public class B extends A {

    @Override
    public void instanceMethodA(){
    staticMethod();
    }

   // @Override we cannot override the static methods, but we can declare this method and the StaticMethod from the parent class will become hidden
    public static void staticMethod(){
        System.out.println("Static method form the Child class");
    }
}
