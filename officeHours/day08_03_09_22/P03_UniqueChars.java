package day08_03_09_22;

public class P03_UniqueChars {
    public static void main(String[] args) {
        /*
            Write a program that can  the unique char from a string
            String str = "aabdfccfs";
            Output: bds
            Small task --> Find me first unique Char from
           the String
         */

        //Manually
        String str = "aabdfccfs";

        System.out.println(str.indexOf("b"));
        System.out.println(str.lastIndexOf("b"));
        //Dynamic

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int a = str.indexOf(each);
            int b = str.lastIndexOf(each);
            boolean isUnique = a == b;

            if (isUnique == true) {
                System.out.print(each);
            }

        }


    }
}
