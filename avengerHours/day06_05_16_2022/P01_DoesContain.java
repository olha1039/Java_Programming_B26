package day06_05_16_2022;

public class P01_DoesContain {
    /*
   Write a program that determines if the given sentence contains the given word (Do not use contains() method)

                  Ex;
                  Input: String sentence = "Java is the best programming language"
                         String word = "Java";
                  Output: true
    */
    public static void main(String[] args) {
        String sentence = "Java is the best programming language";
        String word = "Java";
        String word2 = "Ruby";

        System.out.println(sentence.contains(word));
        System.out.println(sentence.contains(word2));

        System.out.println(sentence.indexOf(word));
        System.out.println(sentence.indexOf(word2));
        System.out.println();
        System.out.println(doesContain(sentence, word));
        System.out.println(doesContain(sentence, word2));

    }

    public static boolean doesContain(String sentence, String word) {

        if (sentence.indexOf(word) == -1) {
            return false;
        }
        return true;
    }
}
