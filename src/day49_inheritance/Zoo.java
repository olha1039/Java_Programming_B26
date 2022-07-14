package day49_inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfLegs = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;

        Lion lion = new Lion();
        // Q: How many instance variables does the lion has access to? - 3

        //Q: How many instance methods does the lion obj have access to?

        lion.roar();
        lion.species = "Lion";
        lion.walk();
    }

}
