package day00_Interview_practice.random;

public class RemoveSubstrings {
    public static void main(String[] args) {
        System.out.println(removeSubstring("fgasdghjasdjjj", "asd")); // fgghjjjj

    }
  /*  We have a string s = "fgasdghjasdjjj".
    Find and remove all substrings = "asd"
            */

    public static String removeSubstring(String a, String b) {

        int num = a.indexOf(b);
        a = a.replace(a.substring(num, num + 3), "");

        return a;
    }
}
