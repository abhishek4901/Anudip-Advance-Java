/*
 * demon thread () -- it provide the service to user thread . Demon thread always thread execute at last (after successsfully executing the user thread)
 * demon thread have  low priority 
 * we can make user thread -- setDemon(true)
 * we can make user thread  to demon thread
 * we can also check this demon thread or not
 * by default thread ki priority fai (non ) and max 10 and lowest 0
 */

public class DeomonThread {

    // Thread A
    static class A extends Thread {
        public void run() {
            System.out.println("Thread ID: " + Thread.currentThread().getId());//for get it 
            System.out.println("Thread State: " + Thread.currentThread().getState());// get thread state 
            System.out.println("Thread Name: " + Thread.currentThread().getName());// getthread name
            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());// get thread priority 

            for (int i = 5; i <= 50; i += 5) {
                System.out.println("A: " + i);
            }
        }
    }

    // Thread B (Daemon thread)
    static class B extends Thread {
        public void run() {
           

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
