package day52_inheritance.hiding;

public class Game {

    public static void main(String[] args) {
        Sport.cheer(); // local is prioritising. the closest method is more important. it is hiding. static method are not override, it is hidden, but instance method we override.
        Soccer.cheer();

        // overriding is for instance methods to change the implementation of the method. hiding is for static methods. but we can overload static methods' as well.
    }
}
