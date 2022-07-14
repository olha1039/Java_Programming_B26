package day24_loops;

public class BiggestSubstring {
    /*
    Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print it.
    Ex: aaabbbccccccdddee Output: ccccc
     */
    public static void main(String[] args) {
        String s = "aaabbbcccccdddddeeee";
        String sub = "";
        String biggest = "";

        for (int i = 0; i < s.length() - 1; i++) {
            sub += s.charAt(i);
            if(s.charAt(i) != s.charAt(i + 1)){ // when the character is different from the one next to it
                if(sub.length() > biggest.length()){
                    biggest = sub;
                }
                sub = ""; // resets this String for the next substring
            }
        }

        System.out.println(biggest);


    }
}
