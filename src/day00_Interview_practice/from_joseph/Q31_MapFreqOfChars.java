package day00_Interview_practice.from_joseph;

import java.util.Map;
import java.util.TreeMap;

public class Q31_MapFreqOfChars {
    //Map -- Frequency of Characters: Write a method that prints the frequency of each character from a String

    public static String freqOfChars(String str){
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        str = "";
        for(Map.Entry<String, Integer> each: map.entrySet()){
            str += each.getKey()+each.getValue();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(freqOfChars("AAABBBCCCCDDDD"));
    }

}
