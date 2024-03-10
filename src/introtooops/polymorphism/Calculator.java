package introtooops.polymorphism;

public class Calculator {
    // Java refers to methods using the method's signature
    // Method Signature = Method Name + Parameters type

    // Method overloading
    // static polymorphism (resolved at compile time)

    // add(int,int)
    public double add(int a, int b) {
        return a + b;
    }

    // add(double,double)
    public double add(double a, double b) {
        return a + b;
    }
}
