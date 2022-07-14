package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface<String> printEachChar = (str) -> { // could remove or keep parantasies, if it is only one argument
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };

        printEachChar.test("hello world");

        DynamicInterface<Integer> printNumber5TItems = n -> {
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
        };
        printNumber5TItems.test(10);
    }

}
