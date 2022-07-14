package day11_03_22_2022;

public class P04_StringTimes {
    public static void main(String[] args) {
        /*
         Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi
         */

        String word = "Hi";
        stringTimes("Hi", 5);

    }

    public static void stringTimes(String word, int num) {
        String str = "";
        for (int i = 0; i < num; i++) {
            str += word;

        }
        System.out.println(str);
    }

}
