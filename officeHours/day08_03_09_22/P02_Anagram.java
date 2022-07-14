package day08_03_09_22;

public class P02_Anagram {
    public static void main(String[] args) {
        /*
            Given two Strings determine if they are anagram or not. String are anagram if they are built up of the same characters
            Ex:
            listen vs silent -->
            funeral vs real fun -->
            a gentleman vs elegant man

            -> anagram
            Hint: look up and use replaceFirst method
         */

        String a = "a gentleman";
        String b = "elegant man";

        a = a.replace(" ", "");
        b = b.replace(" ", "");
        if (a.length() == b.length()) { // this is precondition to check anagram or not
            for (int i = 0; i < a.length(); i++) {

                char each = a.charAt(i);

                b = b.replaceFirst(each + "", "");

            }
            if (b.isEmpty()) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
    }
}
