package day04_25_2022.packageA;

public class Second {
    // different class same package

    public static void main(String[] args) {
        First obj = new First();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
//        System.out.println(obj.d); this one is private

        System.out.println(First.e); // for static, we use class to call it
    }
}
