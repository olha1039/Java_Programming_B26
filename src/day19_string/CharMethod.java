package day19_string;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
        // index    0123
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
//        System.out.println(s.charAt(4));

        int lastIndex = s.length() - 1; //4-1=3
        System.out.println("last char: " + s.charAt(lastIndex));

        int secondToLastChar = s.length() - 2;
//        char secondToLastChar = s.charAt(secondToLastIndex);
        System.out.println("second to last character: " + secondToLastChar);

    }
}
