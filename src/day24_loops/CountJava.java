package day24_loops;

public class CountJava {
    public static void main(String[] args) {
        /*
        java is a language
        012345

        java 0, 4
        ava  1, 5
        va i 2, 6
         */
        String s = "java is a java language. java";
        int count = 0;

        for (int i = 0; i < s.length() - 3; i++) {
            String everyFour = s.substring(i, i + 4);
           if(everyFour.equals("java")){
               count++;
           }

        }
        System.out.println("How many words are in the sentence? " + count);




    }
}
