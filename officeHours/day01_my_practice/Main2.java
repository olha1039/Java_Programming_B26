package day01_my_practice;

public class Main2 {
    public Main2(){
        System.out.println(0);
    }
    static void run(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        Main2.run();
        System.out.println(2);
    }
    static {
        System.out.println(3);
    }
}
