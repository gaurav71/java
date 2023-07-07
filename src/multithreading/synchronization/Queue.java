package multithreading.synchronization;

import java.util.LinkedList;
// how are threads awakened
// 1. notify and notifyAll
// 2. use timeout in wait method. after timeout the thread will be woken up and compete
// for acquisition of lock. woken up thread has no way of knowing it was timed out or signaled
// 3. another method invoke interrupt on waiting thread. exception is thrown after thread is woken up

public class Queue {
    private final LinkedList<Integer> data;
    int capacity;

    Queue(int capacity) {
        this.data = new LinkedList<>();
        this.capacity = capacity;
    }

    boolean add(int value) {
        synchronized (data) {
            while (this.data.size() == this.capacity) {
                try {
                    this.data.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            this.data.add(value);
            this.data.notifyAll();
            return true;
        }
    }

    int remove() {
        synchronized (data) {
            while (this.data.size() == 0) {
                try {
                    this.data.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            int val = this.data.removeFirst();
            this.data.notify();
            return val;
        }
    }
}
