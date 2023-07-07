package multithreading.synchronization;

public class Client {
    public static void main(String[] args) {
//        Stack stack = new Stack(100);
//
//        new Thread(() -> {
//            for (int i=0; i<10; i++) stack.push(i);
//            for (int i=0; i<10; i++) {
//                System.out.print(stack.top());
//                stack.pop();
//            }
//        }).start();
//
//        new Thread(() -> {
//            for (int i=0; i<10; i++) stack.push(i);
//            for (int i=0; i<10; i++) {
//                System.out.print(stack.top());
//                stack.pop();
//            }
//        }).start();

        Queue q = new Queue(10);

        Runnable producer = () -> {
           for (int i=0; i<20; i++) {
               System.out.println(Thread.currentThread().getName() + " " + i);
               q.add(i);
           }
        };

        Runnable consumer = () -> {
            for (int i=0; i<20; i++) {
                int val = q.remove();
                System.out.println(Thread.currentThread().getName() + " " + val);
            }
        };

        Thread t1 = new Thread(producer, "producer");
        Thread t2 = new Thread(consumer, "consumer");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // high priority
        t1.setPriority(10);
        // low priority
        t2.setPriority(1);

        System.out.println("Main exit");
    }
}
