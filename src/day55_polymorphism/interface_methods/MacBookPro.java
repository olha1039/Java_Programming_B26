package day55_polymorphism.interface_methods;

public class MacBookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }
}

class Runner{

    public static void main(String[] args) {

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
//        System.out.println(MacBookPro.NAME); both methods works, can call by interface and can call by class as well
//        System.out.println(MacBookPro.OS); you can access static variables from the child class, but you should use the interface
        System.out.println("==========");
        Mac.company();
       // Mac.faceTime(); the default method needs to be called from the object
        System.out.println("==========");
        // Mac.turnOn(); not valid, need an object to call this method

        MacBookPro obj = new MacBookPro();
        obj.turnOn();
        obj.faceTime();

        //obj.company(); static methods from an interface are not
    }
}
