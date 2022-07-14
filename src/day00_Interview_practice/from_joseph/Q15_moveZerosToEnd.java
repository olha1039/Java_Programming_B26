package day00_Interview_practice.from_joseph;

import java.util.Arrays;

public class Q15_moveZerosToEnd {
//    Q15:Array -- Move Zeros to the End
//    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//
//    Ex:
//    input:  {1,0,2,0,3,0,4,0};
//    output: [1, 2, 3, 4, 0, 0, 0, 0]


    public static void moveZeroToTheEnd(int[] a) {

        int[] result = new int[a.length];
        int index = 0;

        for (int each : a) {
            if (each != 0) {
                result[index++] = each;
            }
        }
        System.out.println(Arrays.toString(result));
    }




    public static void main(String[] args) {
        moveZeroToTheEnd(new int[]{1, 0, 2, 0, 3, 0, 4, 0});
    }

}
