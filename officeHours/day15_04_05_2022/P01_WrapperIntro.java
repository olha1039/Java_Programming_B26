package day15_04_05_2022;

public class P01_WrapperIntro {
    /*
    Why do we need wrapper classes?

    -Collection allows only OBJECTS (non-primitive)
    String,integer,Double

    -Collection -> ArrayList etc
    -Wrapper Classes has many useful methods

        -Character.isDigit()
        -Character.isUpperCase()
        -Character.isLowerCase()
        valueOf() vs parseInt()/parseDouble() etc

        -To convert primitive to OBJECTS

        -Autoboxing vs Unboxing

        Autoboxing --> Primitive to OBJECTS
        Unboxing   --> OBJECTS to primitive

         */
    public static void main(String[] args) {
        System.out.println("------------------");
        // Autoboxing --> Primitive to OBJECTS
        Integer a = new Integer(30);
        Integer b = 30;
        //these two are totally same
        System.out.println("--------------------");
        //Unboxing   --> OBJECTS to primitive
        Integer c = Integer.valueOf(30);
        int d = c; // unboxing
        //valueOf() vs parseInt()/parseDouble() etc

        //valueOf() --> returns Object (Wrapper Class)

        //parseMethods() --> returns primitives

        int e = Integer.parseInt("123"); // accepts String --> returns primitives
        Integer f = Integer.valueOf(123);

        System.out.println("=--------------------");

         // Wrapper Classes Methods

        System.out.println(Character.isDigit('a'));    // F
        System.out.println(Character.isUpperCase('a')); // F
        System.out.println(Character.isLowerCase('a')); // T

        System.out.println("------------------------");

        //Casting
        //Casting is not possible with wrapper classes
        Integer num = Integer.valueOf(123);
//        Double doub = num;




    }

}
