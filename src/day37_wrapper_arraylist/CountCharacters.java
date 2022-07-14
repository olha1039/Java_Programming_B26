package day37_wrapper_arraylist;

import java.util.Arrays;

public class CountCharacters {
    /*
        given some String, count the number of uppercase letter, lowercase letters, numbers and other characters
       aP3d572&*jd@jdJU

       Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number

     */
    public static void main(String[] args) {

        String s = "aP3d572&*jd@jdJU";
        int upper = 0, lower = 0, number = 0, other = 0;

        String uppercaseChars = null;
        for (int i = 0; i < s.length(); i++) {
            uppercaseChars = "";
            char letter = s.charAt(i);

            if (Character.isUpperCase(letter)) {
                upper++;
                uppercaseChars += letter;
            } else if (Character.isLowerCase(letter)) {
                lower++;
            } else if (Character.isDigit(letter)) {
                number++;
            } else {
                other++;
            }

        }
        System.out.println("Upper: " + upper);
        System.out.println("Uppercase letters: " + Arrays.toString(uppercaseChars.toCharArray()));
        System.out.println("Lower: " + lower);
        System.out.println("Numbers: " + number);
        System.out.println("Other: " + other);
    }


}
