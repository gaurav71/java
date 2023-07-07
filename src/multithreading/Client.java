package multithreading;

// Main Thread -> Child Threads
// User Threads = Process waits for these to finish
// Daemon Threads = Process does not wait for them
// Thread Creation
//      implement java.lang.Runnable (much better)
//      extend java.lang.Thread

public class Client {
    public static void printNumbers() {
        for (int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("main is running");

        Thread thread = new Thread1("Thread1");
        thread.setDaemon(true);
        thread.start();

        Thread thread2 = new Thread(new Thread2(), "Thread2");
        thread2.start();

        // Pass the implementation of Runnable class object
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumbers();
            }
        });
        thread3.setName("Thread3");
        thread3.start();

        // Pass the implementation of Runnable class object using lambdas
        Thread thread4 = new Thread(() -> printNumbers());
        thread4.setName("Thread4");
        thread4.start();

        System.out.println("main is exiting");
    }
}
