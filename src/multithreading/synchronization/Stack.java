package multithreading.synchronization;

public class Stack {

    // volatile => read/write value directly in ram and not use the cache
    private volatile int data[];
    private int top;

    Object lock;

    Stack(int capacity) {
        this.data = new int[capacity];
        this.top = -1;
        this.lock = new Object();
    }

    boolean isEmpty() {
        return this.top < 0;
    }

    boolean isFull() {
        return this.top == this.data.length;
    }

    synchronized boolean push(int val) {
        if (this.isFull()) return false;
        top++;
        try { Thread.sleep(1000); } catch (Exception e) {}
        this.data[top] = val;
        return true;
    }

    boolean pop() {
        // this is same as the above push method one.
        synchronized (this) {
            if (this.isEmpty()) return false;
            try { Thread.sleep(1000); } catch (Exception e) {}
            top--;
            return true;
        }
    }

    int top() {
        if (this.isEmpty()) return -1;
        return this.data[top];
    }
}
