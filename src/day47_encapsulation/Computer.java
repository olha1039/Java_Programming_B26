package day47_encapsulation;

public class Computer {
 /*
    Computer - static
    class name: computer:
        instance variables:
            price, brand, color, ...
        static variables: hasScreen, hasBattery, hasMemory
        make objects of the class in a main method and access both instance and static members from proper references
     */

    String brand;
    double price;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static { //this will be run first since we are using the computer class for the first time (ComputerLab), then below block is running
        System.out.println("Static block run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, double price, String color) {
        System.out.println("Constructor run");
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

}
