package day18_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String s = "   Saturday   ";
        System.out.println(s);
        System.out.println(s.length());

       s =  s.trim();

        System.out.println(s);
        System.out.println(s.length());

        String str = "    java is fun     ";
        System.out.println(str.trim());
    }
}
