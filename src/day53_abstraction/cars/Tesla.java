package day53_abstraction.cars;

public class Tesla extends ElectricCar {

    @Override
    public void start() {
        System.out.println("card in the car");
        System.out.println("press button");
    }

    @Override
    public void charge() {
        System.out.println("charging tesla");
    }
    /*
    the Tesla class is a subclass of electric car class

    the electric car class is abstract and tesla is not abstract(non-abstract), that means the normal classes cannot have abstract methods, so we have to override any/all abstract methods that were inherited
     */
}
