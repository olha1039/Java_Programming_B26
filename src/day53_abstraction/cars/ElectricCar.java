package day53_abstraction.cars;

public abstract class ElectricCar extends Car {

    public abstract void charge();

}
/*
    the Electric car is a subclass of Car

    the Car class was abstract and electric car is also abstract

    abstract classes can have abstract methods

    so, there is no  problem to inherit, and we don't need to override any methods of this class
 */