package day51_inheritance.lyft;

public class CarRide {
    public static void main(String[] args) {

    Lyft obj1 = new Lyft("James");
        System.out.println(obj1.calculateRates(10)); //15

        LyftXL obj2 = new LyftXL("James");
        System.out.println(obj2.calculateRates(10)); //16.5


    }
}
