package day00_Interview_practice.from_joseph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Q3_removeDup {
    /*  Q3
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
         */

    public static String removeDup (String s){

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(result.contains("" + letter)){
                continue;
            }
            result += "" + letter;
        }
        return result;
    }

    public static String removeDup2 (String str){

       str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        str = str.replaceAll(", ","").replace("[","").replace("]","");
        return str;
    }

    public static void removeDup3 (String s){
        LinkedHashSet<Character> set = new LinkedHashSet();
        for (int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        for (Character ch : set) {
            System.out.print(ch);
        }
    }





    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup2("AAABBBCC"));
        removeDup3("AAAABBBCCC");
    }

}
