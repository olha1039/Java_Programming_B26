package day00_Interview_practice.random;

public class PetersonNumber {
    /*
    A number is said to be a Peterson number if the sum of factorials of each digit of the number is equal to the number itself. Example: Input : n = 145 Output = Yes
     */
    public static void main(String[] args) {

        int num = 145;
        int temp = num;
        int f = 1, sum = 0;
        while (num != 0) {
            f = 1;
            int r = num % 10;
            for (int i = 1; i <= r; i++) {
                f = f * i;
            }
            sum = sum + f;
            num = num / 10;
        }
        System.out.println(sum == temp ? "Peterson num" : "not peterson");
    }
}




