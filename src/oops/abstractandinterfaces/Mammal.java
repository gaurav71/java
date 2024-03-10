package oops.abstractandinterfaces;

// Cannot create object from abstract class (always extended)
// Can contain abstract methods which have to be overridden by the child class
// Rest is the same
public abstract class Mammal implements Animal {
    int numOfLegs;
    public abstract void makeSound();
    public void breathe() {
        System.out.println("breathe");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}

