package day00_Interview_practice.random;

public class IsPalindrome {


    public static String isPalindrome(String str){
        String temp = "";

        for(int i = str.length()-1; i >= 0; i--){
           temp += str.charAt(i);
        }
        return str.equals(temp) ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("alla"));
    }



}
