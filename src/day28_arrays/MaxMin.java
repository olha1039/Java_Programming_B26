package day28_arrays;

public class MaxMin {
    public static void main(String[] args) {
        /*
            declare and assign an array
            500, 120, -80, 90, 250, -10
            find the biggest number in the array
            find the smallest number in the array
            flow: go through each number in the array, compare that element with the biggest number and compare that element with the smallest number
         */

        int[] nums = {100, 120, -80, 90, 250, -10};

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];

            if(number > max){
                max = number;
            }
            if(number < min){ // if(nums[i] > max
                min = number; // max = nums[i]
            }

        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);


    }
}
