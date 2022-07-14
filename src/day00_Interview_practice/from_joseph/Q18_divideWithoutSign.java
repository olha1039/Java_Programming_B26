package day00_Interview_practice.from_joseph;

public class Q18_divideWithoutSign {
//    Q18:Numbers -- Divide without / operator
//    Write a method that can divide two numbers without using division operator


    public static void divideWithoutSign(int a, int b) { // only works if a > b
        if (b == 0) {
            System.out.println("Can not divide by 0");

        }
        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count + "." + a);

    }

    public static void main(String[] args) {
        divideWithoutSign(11,3);
    }

}
