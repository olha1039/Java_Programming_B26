package day19_string;

public class IndexMethod2 {
    public static void main(String[] args) {

        String s = "java";
        System.out.println(s.indexOf('a')); //1
        System.out.println(s.lastIndexOf('a')); //3

        String s2 = "abcbcb";
        System.out.println(s2.indexOf('b')); // 1
        System.out.println(s2.lastIndexOf('b')); // 5

        System.out.println(s2.indexOf("cb")); // 2
        System.out.println(s2.indexOf("cbd")); // cbs sequence is not a String, so we get -1
        System.out.println(s2.indexOf('z')); // -1
    }
}
