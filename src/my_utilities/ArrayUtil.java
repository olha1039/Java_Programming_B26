package my_utilities;

public class ArrayUtil {
      /*
    Min Number
    create a method that will accept an int array and return the smallest number from the array
     */
    public static int minNumber(int [] nums){

        int min = nums[0];

        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    /*
    Max Number
    create a method that will accept an int array and return the biggest number from the array
     */

    public static int maxNumber(int [] nums){

        int max = nums[0];

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
 /*
    Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */

    public static boolean contains(int [] nums, int element){

        for(int each : nums){
            if(each == element){
                return true;
            }
        }

        return false;
    }


}
