package day63_functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {
            if(n % 2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        evenOrOdd.apply(20); // method called apply in NumberInterface interface
        evenOrOdd.apply(25);
        System.out.println("=================");

        // another implementation for apply method
        NumberInterface cube = (number) -> {
            System.out.println(number * number * number);
        };

        cube.apply(3);
        cube.apply(4);



    }
}
