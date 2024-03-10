package classes.nestedclasses;

/*
* Nested Classes are of 2 types:
*   Nested Static Classes: can access static attributes of outer class
*   Inner Classes: can access all attributes of outer class;
*
*   Every attribute of inner class object is accessible in outer class
*   Every attribute of outer class object is accessible in inner class
*
* */

public class OuterClass {
    private int outerClassPrivateVal = 20;
    private static int outerClassStaticVal = 30;

    public void testNestedClasses() {
        // object of inner class can access all attributes (private) inside the outer class scope
        PublicInnerClass publicInnerClass = new PublicInnerClass();
        PrivateInnerClass privateInnerClass = new PrivateInnerClass();
        PublicStaticNestedClass publicStaticNestedClass = new PublicStaticNestedClass();
        PrivateStaticNestedClass privateStaticNestedClass = new PrivateStaticNestedClass();

        System.out.println(publicInnerClass.publicVal + publicInnerClass.privateVal);
        System.out.println(privateInnerClass.publicVal + privateInnerClass.privateVal);
        System.out.println(publicStaticNestedClass.publicVal + publicStaticNestedClass.privateVal);
        System.out.println(privateStaticNestedClass.publicVal + privateStaticNestedClass.privateVal);

        System.out.println(PublicInnerClass.staticVal);
        System.out.println(PrivateInnerClass.staticVal);
        System.out.println(PublicStaticNestedClass.staticVal);
        System.out.println(PrivateStaticNestedClass.staticVal);
    }

    public PrivateInnerClass getPrivateInnerClassObject() {
        return new PrivateInnerClass();
    }

    public PrivateStaticNestedClass getPrivateStaticNestedClassObject() {
        return new PrivateStaticNestedClass();
    }

    public class PublicInnerClass {
        public int publicVal;
        private int privateVal;
        private static int staticVal;

        // Nested class can access attributes of outer class (same way any other outer method would)
        private void outerClassAttributeAccess() {
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClassPrivateVal);
            System.out.println(outerClassStaticVal);
        }
    }

    private class PrivateInnerClass {
        public int publicVal;
        private int privateVal;
        private static int staticVal;

        private void outerClassAttributeAccess() {
            System.out.println(outerClassPrivateVal);
            System.out.println(outerClassStaticVal);
        }
    }

    public static class PublicStaticNestedClass {
        public int publicVal;
        private int privateVal;
        private static int staticVal;
        // Nested class can only access static attributes of outer class (same way any other outer static method would)
        private void outerClassAttributeAccess() {
//            System.out.println(outerClassPrivateVal);
            System.out.println(outerClassStaticVal);
        }
    }

    private static class PrivateStaticNestedClass {
        public int publicVal;
        private int privateVal;
        private static int staticVal;
        private void outerClassAttributeAccess() {
//            System.out.println(outerClassPrivateVal);
            System.out.println(outerClassStaticVal);
        }
    }
}


