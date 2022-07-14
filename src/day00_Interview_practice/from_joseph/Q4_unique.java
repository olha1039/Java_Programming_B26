package day00_Interview_practice.from_joseph;

public class Q4_unique {
    /*
    Q4
Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static String unique (String s){
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char letter = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char letter2 = s.charAt(j);

                if(letter == letter2){
                    count++;
                }
            }
            if(count == 1){
                result += letter;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }
}

/*
 for (int i = 0; i < s.length(); i++) {
            char each = s.charAt(i);
            int a = s.indexOf(each);
            int b = s.lastIndexOf(each);
            boolean isUnique = a == b;

            if (isUnique == true) {
                System.out.print(each);
            }

        }
 */
