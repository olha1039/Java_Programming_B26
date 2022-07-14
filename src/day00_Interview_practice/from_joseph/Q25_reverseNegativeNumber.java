package day00_Interview_practice.from_joseph;

public class Q25_reverseNegativeNumber {

    //Write a return method that can reverse negative number and return it as int

        public static int reverseNegative (int n){
         int result = 0;
         int lastDigit = 0;

         while(n != 0){
             lastDigit = n % 10;
             result = result * 10 + lastDigit;
             n /= 10;
         }
           return result;
        }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-123));
    }

}
