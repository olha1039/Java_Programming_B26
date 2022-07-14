package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String s = "A";
        System.out.println(str.startsWith(s)); // does the String str start with string s

        System.out.println(str.startsWith(" App")); // space is character
        System.out.println(str.startsWith(    "App")); // space doesn't affect the String
        System.out.println(str.startsWith("Aoo"));

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a"));
        System.out.println("--------------------------");
        System.out.println(sentence.endsWith("day")); //true

        System.out.println(sentence.endsWith(" day")); //true
        System.out.println(sentence.endsWith("good")); //false
        System.out.println(sentence.endsWith("today was a good day")); // true


    }
}
