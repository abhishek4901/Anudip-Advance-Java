// wap to perfrom different task by different - different thread
class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1: Printing numbers " + i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task2: Printing alphabets " + (char)(64 + i));
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class MultiTask {
    public static void main(String[] args) {
        Task1 t1 = new Task1(); // First thread
        Task2 t2 = new Task2(); // Second thread

        t1.start(); // start task1
        t2.start(); // start task2
    }
}
