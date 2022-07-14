package day01_my_practice;

public class Book {
    static String author = "J.K";

    static {
        author = " S K";
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        b1.author = "C P";
        Book b2 = new Book();
        System.out.println(b1.author.equals(b2.author));
    }
}
