package day33_methods;

public class CountNumbers {
    /*
        count up to a certain number
        start from 0
        all the numbers until the number input
        method(5) --> 0 1 2 3 4 5
        method(10) -> 0 1 2 3 ... 10
     */
    public static void CountNumber(int nums) {

        for (int i = 0; i <= nums; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CountNumber(10);
        CountNumber(5);

            }

}
