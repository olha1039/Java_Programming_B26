package day53_abstraction.cars;

public class Garage {

    public static void main(String[] args) {

        // Car obj1 = new Car(); Car is abstract, so we cannot make n object of this class

        Toyota obj2 = new Toyota();
        obj2.start();
        System.out.println("-----------------");
        Honda obj3 = new Honda();
        obj3.start();

        // both Toyota and Honda were concrete classes, because they were not abstract, so we had to implement the start method (abstract method)

        //ElectricCar obj4 = new ElectricCar();
        //ElectricCar is abstract, so we cannot create an object of this class
        System.out.println("----------------");
        Tesla obj5 = new Tesla();
        obj5.start(); // defined in the Car class
        obj5.charge(); // defined in the electricCar class

        // Tesla was a non-abstract class, so it was concrete, which means it had to override all the abstract methods from the super class







    }
}
