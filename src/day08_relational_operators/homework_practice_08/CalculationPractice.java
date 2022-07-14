package day08_relational_operators.homework_practice_08;

public class CalculationPractice {
    public static void main(String[] args) {

        int x = 2 + 3 * 2 / 1; // 8
        int y = (2 + 3) * 2; // 10
        int w = 78 / 2 * 2 + 3 - 5 % 5; // 81
        int i = 8 + 2 + 3 + 5 - 2 - 1 - 0 + 1 * 2; // 17
        System.out.println(x);
        System.out.println(y);
        System.out.println(w);
        System.out.println(i);
        System.out.println("-----------------------------");

        int a = 8; // 7
        int b = a--; // 8
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------");

        int c = 1;
        int d = -c-- + c++ / -c-- * --c;
        System.out.println(c);  // -1
        System.out.println(d);  // -1
        System.out.println("---------------------------");

        int A = 50;
        int B = --A + A++ + A-- + A++;
        System.out.println(A); // 50
        System.out.println(B); // 197
        System.out.println("---------------------------");

        int X = 4;
        int Y = X * 4 - X++;
        System.out.println(X); // 5
        System.out.println(Y); // 4*4-4= 12
        System.out.println("----------------------------");

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        System.out.println(t); // 100
        System.out.println(p); // 202 !!!!!!
        System.out.println("----------------------------");

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        System.out.println(R); // 18
        System.out.println(W); // -20+(-19) + 19 * 19 %2 = -38
        System.out.println("-------------------------------");

        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2;
        System.out.println(M); // 300
        System.out.println(N); // 400
        System.out.println(U); // 301+400-301%2+400%2 =700


    }
}
