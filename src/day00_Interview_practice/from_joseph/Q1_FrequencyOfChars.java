package day00_Interview_practice.from_joseph;

import java.util.HashMap;

public class Q1_FrequencyOfChars {
    /*
    Q1
    Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

   public static String frequencyOfChars (String s){

       String checked = "";
       String result = "";
       for (int i = 0; i < s.length(); i++) {
           int count = 0;
           char letter = s.charAt(i);
           if(!checked.contains("" + letter)){
               checked += "" + letter;
               for (int j = 0; j < s.length(); j++) {
                   char letter2 = s.charAt(j);
                   if(letter == letter2){
                       count++;
                   }
               }
               if(result.contains("" + letter)) {
                   continue;
               }
               result += letter + "" + count;
           }
       }
       return result;
   }

    public static String frequencyOfChars2(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }



    public static void main(String[] args) {

        System.out.println(frequencyOfChars("ABCAADD"));
        System.out.println(frequencyOfChars2("AAABBBBCCCDDDD"));

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String freq = "aasjjikkk";
        for(int i = 0; i < freq.length(); i++) {
            char c = freq.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            }
            else {
                map.put(c, 1);
            }
        }


    }
}
