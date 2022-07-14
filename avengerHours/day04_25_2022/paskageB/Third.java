package day04_25_2022.paskageB;

import day04_25_2022.packageA.First;

public class Third extends First {
    public static void main(String[] args) {
        First obj = new First();

        System.out.println(obj.a);
//        System.out.println(obj.b); protected, need to create an obj from the child class
//        System.out.println(obj.c); default, since it's a different package,can't access
//        System.out.println(obj.d); private

        System.out.println(First.e);

        Third obj2 = new Third();
        System.out.println(obj2.b);

    }
}
