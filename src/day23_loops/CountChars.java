package day23_loops;

public class CountChars {
    public static void main(String[] args) {
        /*
        counts Hi
         */
        String str = "aaaahiahhihibbbcch";
        int count = 0;

        for(int index = 0; index < str.length() - 1; index++){

            if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                count++;
            }
        }
        System.out.println(count);
    }
}
