package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

        // Create obj = new Create(); can't make objects of inheritance

        Book obj = new Book(); // Book is a normal (non-abstract) class
        obj.read(); // Reading the book
        obj.write(); // Writing the book


    }
}
