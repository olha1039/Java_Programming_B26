package day54_abstraction.creating;

public class Book implements Create {
// book is a concrete class, because it's the first class

    @Override
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}
