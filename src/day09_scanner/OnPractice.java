package day09_scanner;

public class OnPractice {
    public static void main(String[] args) {

        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 || oranges < 5); //true
        System.out.println(apples > 10 || oranges == 10); //false || true  --> true
        System.out.println(apples > 10 && oranges == 10); //false
        // false && true -> false

    }

}
