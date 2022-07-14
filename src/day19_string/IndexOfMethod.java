package day19_string;

import java.lang.module.FindException;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";

        System.out.println(s.indexOf("p")); // 0
        System.out.println(s.indexOf("e")); // 1
        System.out.println(s.indexOf("n")); // 2

        System.out.println(s.indexOf("x")); // -1

        System.out.println(s.indexOf("pe")); // 0
        System.out.println(s.indexOf("pz")); // -1
        System.out.println(s.indexOf("g")); // -1

    }
}
