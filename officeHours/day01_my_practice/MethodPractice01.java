package day01_my_practice;

public class MethodPractice01 {
    public static void OddNumbers(int odd){
        for (int i = 1; i <= odd; i +=2) {
            System.out.print(i + " ");
        }
    }

public static void EvenNumbers(int even){
    for (int i = 0; i <= even; i +=2) {
        System.out.print(i + " ");
    }

}
    public static void main(String[] args) {
        OddNumbers(100);
        System.out.println();
        EvenNumbers(100);
    }
}

