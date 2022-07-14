package day00_Interview_practice.from_joseph;

public class Q10_minNumber {
    /*
    Q10
            Write a method that can find the minimum number from an int Array
     */

    public static int minNumber(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       return min;
    }

    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{5, 4, 6, 8, 7, 6, 5, 1, 54, 654, 468}));
    }
}
