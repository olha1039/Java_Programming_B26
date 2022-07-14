package day54_abstraction.animal;

// adding abstract here, this is not concrete class, because I don't have to override. It is just inheritance.
// Can I override? Yes, but I don't have to,because it's abstract.
// Bird is a concrete class. Any subclass of a parent class, which is first by the hierarchy is concrete.
public abstract class Bird extends Animal {

    double beakSize;


}
