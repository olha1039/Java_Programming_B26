package day54_abstraction.animal;

// dog is a concrete class, because it's the first normal class
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog goes to the bowl and eats");

    }
}
