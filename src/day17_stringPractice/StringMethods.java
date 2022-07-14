package day17_stringPractice;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        // how to compare String values --> use .equals()
        System.out.println(name.equals("james"));

        System.out.println("cat".equals("dog"));

        System.out.println(name.equals("James"));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b)); // compares a object with b object
        System.out.println(a.equals("hello")); // compares a object with literal object
        System.out.println("-----------------");
        System.out.println(a.equals("java"));
    }
}
