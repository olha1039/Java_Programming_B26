package day15_04_05_2022;

public class P02_SumOfDigits {
    public static void main(String[] args) {
        /*
        Task 1 : Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
         */
        String s = "jav45ai1000sgre1at82";
        //           45 + 1000 + 1 + 82 --> 1128
        /*
            for (){
                if(isDigit){
                digits+=each;
                } else  {
                    sum= convert this digits to Int
                    reset the digits variable
                }
            }
            System.out.println(sum);
         */

        System.out.println(sumOfDigits(s));

    }

    public static int sumOfDigits(String str) {

        String digits = "0";
        //String s = "jav45ai1000sgre1at82";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) { // here if char is  a digit it will add numbers to digits

                digits += str.charAt(i); // we add numbers here

            } else {  // if char is not a digit - it is letter we sum digits on next line
                sum+= Integer.parseInt(digits);
                digits = "0"; // here digit resets numbers that are collected before letter char and sums it before this line
                // last number 82 stays here, because we don't have next char after 82, so it stops
            }


        }
        return sum+Integer.parseInt(digits);

    }


}