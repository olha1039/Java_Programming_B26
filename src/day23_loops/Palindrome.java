package day23_loops;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Palindrome: its the same reading from the beginning and the end
        Task: Check if the word is palindrome

        Flow:
                declare some initial String
                how to reverse a String
                check if the reverse version is the same as the original
         */

        String str = "abcde";

        // reverse the String

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){

            reverse += str.charAt(i); // characters are being red from the end and being added backward into a reverse String

        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}
