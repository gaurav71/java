package classes;

public class OuterClass {
    InnerClass inner;
    private class InnerClass {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public InnerClass createInnerClassObject() {
        new InnerClass(42);
        return inner;
    }

    public int getValueOfInnerClass() {
        return inner.getValue();
    }
}


