package day07_unary_opperations.homework_day07;

public class IncrementsPractice {
    public static void main(String[] args) {

        int b =10;
        b++;
        System.out.println(b); //11
        b--;
        System.out.println(b); //10
        System.out.println(b++); //10
        System.out.println(b++); //11
        System.out.println("----------------------");
//-----------------------------------------------------------
        int a = 40;
        System.out.println(--a); //39
        System.out.println(--a); //38
        System.out.println(a--); //38
        System.out.println(--a); //36
        System.out.println(--a); //35
        System.out.println(a--); //35
        System.out.println("--------------------");
 //----------------------------------------------------------
        int c = 14;
        c--; //14
        c++; //13
        --c; //13
        c--; //13
        c++; //12
        System.out.println(c); //13


    }
}
