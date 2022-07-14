package day52_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
        //FinalExample.PLANET = "Mars"; can't reassign because it's final

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

//        obj.a=4; can't reassign because it's final
//        obj.b=20;
        //a never changes with all the objects , but b is getting assigned during object creation. by putting b as a parameter he allows java to assign the value to each object, but with a it is going to be the same for every object
        System.out.println("------------------");
        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b); // the only was to reassign is to create a new object



    }
}
