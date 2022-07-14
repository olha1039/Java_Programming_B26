package day08_relational_operators.homework_practice_08;

import java.io.FilterOutputStream;

public class OperatorPractice {
    public static void main(String[] args) {

        int W = 78 / 2 * 2 + 3 - 5 % 5;
        /*        39   * 2 + 3 - 5 % 5;
                     78    + 3 - 5 % 5;
                     78    + 3 -   0;
                     81
         */
        System.out.println(W);

        int a = 8; // 8 -> 7
        int b = a--; // b = 8

        System.out.println(a);
        System.out.println(b);

        int L = 50; // L = 50 -> 49 -> 50 -> 49 -> 50
        int P = --L + L++ + L-- + L++;
        //      49  + 49  + 50 + 49 =197
        System.out.println(L);
        System.out.println(P);

        int R = 20; // 18
        int T = -R-- + -R++ + --R * R-- % 2;
        //      -20  + -19 + 19 * 19 % 2 = -38
        System.out.println(R);
        System.out.println(T);

        int e = 1; // e = 1 -> 0 -> 1 -> 0 -> -1
        int f = -e-- + e++ / -e-- * --e;
        //      -1  + 0  / - 1 * -1
        //      -1 + 0 * -1
        //      -1 + 0
        //      -1
        System.out.println(e);
        System.out.println(f);



    }
}
