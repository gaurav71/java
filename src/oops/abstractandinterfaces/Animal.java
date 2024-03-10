package oops.abstractandinterfaces;

// Interface has abstract methods which needs to be defined by the implementing oops.classes
// Interface can only have static attributes and method definitions
public interface Animal {
    // final variable (cannot be reassigned)
    int value = 10;
    public void makeSound();
    public void breathe();
    public void sleep();

    // default method will be provided to the implementing class (can be overridden)
    public default void defaultMethod () {
        System.out.println(value);
        System.out.println("Default method");
    }

    public static void staticMethod() {
        System.out.println(value);
        System.out.println("Static method");
    }
}
