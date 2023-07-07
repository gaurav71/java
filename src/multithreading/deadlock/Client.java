package multithreading.deadlock;

public class Client {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    static void call1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " Acquired lock1");

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " Acquired lock2");
            }
        }
    }

    static void call2() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " Acquired lock2");

            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " Acquired lock1");
            }
        }
    }

    public static void main(String[] args) {
        new Thread(Client::call1).start();
        new Thread(Client::call2).start();
    }
}
