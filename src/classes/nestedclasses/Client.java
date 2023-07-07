package classes.nestedclasses;

public class Client {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.PublicInnerClass publicInnerClassObject = o.new PublicInnerClass();
        System.out.println(publicInnerClassObject.publicVal);

        OuterClass.PublicStaticNestedClass publicStaticNestedClass = new OuterClass.PublicStaticNestedClass();
        System.out.println(publicStaticNestedClass.publicVal);

        // will not have access to any attributes of private inner class object
        Object privateInnerClassObject = o.getPrivateInnerClassObject();

        // will not have access to any attributes of private inner class object
        Object privateStaticNestedClass = o.getPrivateStaticNestedClassObject();
    }
}
