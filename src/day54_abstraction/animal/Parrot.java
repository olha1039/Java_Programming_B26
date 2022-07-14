package day54_abstraction.animal;

// if I do final here, meaning it's the final version, parrot can't be a parent for any other class

import day54_abstraction.language.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot wobble over to the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("HELLO HELLO");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE");
    }
}
