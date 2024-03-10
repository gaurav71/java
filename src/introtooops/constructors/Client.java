package introtooops.constructors;

public class Client {
    public static void main(String[] args) {
        Phone iphone11 = new Phone(11, "iphone", 15, "Bionic", 6, 540, 20, 60000);

        // shallow copy (iphone12a contains reference to the same object as iphone11)
        Phone iphone12a = iphone11;

        // deep copy (for the outer object). both variables point to a different object in memory
        Phone iphone12b = new Phone(iphone11);

        System.out.println(iphone12b.getModelName());
        System.out.println(iphone12b.getModelNo());
        System.out.println(iphone12b.getProcessorVersion());
        System.out.println(iphone12b.getProcessorVersion());
        System.out.println(iphone12b.getScreenSize());
        System.out.println(iphone12b.getBatteryCapacity());
        System.out.println(iphone12b.getCameraSpecs());
        System.out.println(iphone12b.getPrice());
    }
}
