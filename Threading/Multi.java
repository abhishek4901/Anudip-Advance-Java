

/*kisi me program by default ek thread hota h chahe bnaye ya nhi that thread name is demon thread
 * multitasking -- to perfrom more than one task a time 
 * two type 
 * 1. by process -- mutliprocessing
 * process is a task. process do not share resourse
 * in process occur deadlock because process do not share resourse
 * 
 * Thread-- part of process, thread is light wait , and share the resoures        
 *  2. by threadin -- multithreading-- 
 * task (recsoure 1 and  recsoure 2)
 * when use thread then never occur deadlock (thread share memory and resourse)
 *  Creating thread --
 * 1. extending the Thread class
 * 2. Implementing the interface
 * 
 * new -- when thread object is created 
 * Runnable  -- when start method called 
 * Running -- when run method execute
 * Terminate - /Block -- sleep /wait
 * Dead /end -- when run method executed successsfully
 *  Note --Threads provide many method (kisi thread ko class name se access  ho use static method kahte)
 *   1.which task perform by thread written inside of run method
 *   2. No guaranty for output in thread
 *   3. each thread having  
 * 
 * 
 * 
 *   Constent variable capital me likhte hai
 * 
 * Task 1 wap to perfrom task by different thread (MAX_PRIORITY jiski 10 thread hoge )
 */
public class Multi implements Runnable {

    // run() method defines the task for thread
    public void run() {
        // System.out.println(Thread.currentThread().getClass()); //thread methods  
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getState());
        // System.out.println(Thread.currentThread().getPriority());
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(200); // pause for 200ms
                System.out.println(Thread.currentThread().getName() + " - hello");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        // Creating threads and passing tasks
        Thread t1 = new Thread("Thread -1");
        Thread t2 = new Thread("Thread   -2");

        // Start threads (don’t call run() directly!)
        t1.start();
        t2.start();
    }
}
