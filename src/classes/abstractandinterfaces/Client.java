package classes.abstractandinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.breathe();

        Dog a = new Dog();
        a.defaultMethod();
        Animal.staticMethod();

        // We can store value of smaller type in a variable bigger type
        byte b = 100;
        int x = b;
        // Dog <= Animal
        // Dog is a subtype of Animal
        // Can store Dog in Animal
        Animal animal = new Dog();

        // Covariant
        // If X <= Y (X is a subtype of Y), then f(X) <= f(Y)
        // Dog <= Animal
        // Dog[] <= Animal[]
        // Dog array is a subtype of animal array.
        // Arrays are covariant
        Animal[] animals = new Dog[20];

        // Invariant
        // If X <= Y (X is a subtype of Y), but there is no relation between f(X) and f(Y)
        // Dog <= Animal
        // Does not imply any relation for generics.
        // Generics are invariant
        // ArrayList<Animal> animalsList = new ArrayList<Dog>();

        // ContraVariant
        // If X <= Y (X is a subtype of Y), then f(Y) <= f(X)
    }
}
