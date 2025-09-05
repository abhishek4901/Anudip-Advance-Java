/*
 * demon thread () -- it provide the service to user thread . Demon thread always thread execute at last (after successsfully executing the user thread)
 * demon thread have  low priority 
 * we can make user thread -- setDemon(true)
 */

public class DeomonThread {

    // Thread A
    static class A extends Thread {
        public void run() {
            System.out.println("Thread ID: " + Thread.currentThread().getId());
            System.out.println("Thread State: " + Thread.currentThread().getState());
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());

            for (int i = 5; i <= 50; i += 5) {
                System.out.println("A: " + i);
            }
        }
    }

    // Thread B (Daemon thread)
    static class B extends Thread {
        public void run() {
            System.out.println("Thread ID: " + Thread.currentThread().getId());
            System.out.println("Thread State: " + Thread.currentThread().getState());
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
            System.out.println("Is Daemon: " + Thread.currentThread().isDaemon());

            for (int i = 7; i <= 70; i += 7) {
                System.out.println("B: " + i);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.setName("My Thread-1");
        a1.setPriority(Thread.MAX_PRIORITY); // Highest priority

        b1.setDaemon(true); // Mark B as Daemon thread

        a1.start();
        b1.start();
    }
}
