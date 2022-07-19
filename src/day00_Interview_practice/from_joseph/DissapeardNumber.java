package day00_Interview_practice.from_joseph;

public class DissapeardNumber {


    public static int findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int sum = ((n + 1) * (n + 2)) / 2;  //(5+1)*(5+2)/2 = 21
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6, 7};
        System.out.println(findDisappearedNumbers(a));
    }
}


