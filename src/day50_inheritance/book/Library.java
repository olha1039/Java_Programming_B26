package day50_inheritance.book;

public class Library {
    public static void main(String[] args) {

        Book obj1 = new Book();
        // obj1 will have access to 6 instance variables

        AudioBook obj2 = new AudioBook();

        //obj2 has access to the 6 variables from the Book class and the 2 new variables in the AudioBook Class

        obj2.duration = 100;
        obj2.narrator = "Morgan Freeman";
        //obj2 has access to the instance method listen()
        obj2.title = "Java is fun";
        obj2.listen();

        EBook obj3 = new EBook();
        //obj3 has access to the 6 variables from the Book class and the 2 new variables in the Ebook Class

        obj3.size = 20.4;
        obj3.pages = 1004;
        obj3.title = "Soft skills is important";
        //obj3 has access to the instance method read()
        obj3.read();

        Book obj4 = new Book();
        obj4.author = new Author("JK Rowling", 40); //made an author object, it belongs to the Book obj4 object
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

        // Author author = new Author(); here you are making an Author object in the main method, it is local to the main method

        // but on the line 29 the obj is made with the reference coming from thr book object. THe Author object belongs to the Book object
    }
}
