package day00_Interview_practice.from_joseph;

import java.util.Arrays;

public class Q13_arrayFunction {
    /*
    Q13
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */

    public static int[] function(int N) {

        int sum = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N - 1; i++) { // do not run last one, so it won't go to sum
            arr[i] = i;
            sum += i; // sum for the whole array
        }

        arr[N-1] = -sum; // negative sum for the last variable, to make the sum 0

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(function(4)));
    }
}
