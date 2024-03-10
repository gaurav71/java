package introtooops.polymorphism;

public class Client {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double val1 = calc.add(10, 10);
        double val2 = calc.add(10.3, 10.7);

        System.out.println(val1);
        System.out.println(val2);

        ElectricCar c = new ElectricCar();
        c.start();
    }
}
