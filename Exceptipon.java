/*Exceptipon- this is abnormal condition the distrub narmol flow of program
and handle Exceptipon call Exceptipon handling

try - in which code exception generated written inside  of block 
syntax --try {
statement 
}
catch - to handle the exception 
synax catch (execption name object){
statement
}

 finally -- always exceuted (like file close , db connection close)
 finally {
 statement
 }

 1. try always work with either catch or finally block
 2. at a time only one exection cam handle
 3. one try block and more than one catch bloack can be  but always written in hierarchy
 e.printStrackTrace() -- for print method of exection
 
 throw --to genrate new execption(any type of exception)
 synax --- throw new exception name("massage")

 throws -- to provide  an information  may be exception generated
            to declare an exception . 
            synax -- method  singhnature 
4. if exception is gernated either handle it or declare it(using thows keyword)  and handle kahi bhi kr skte h jururi nhi ki jaha genrate ho vhi handle kre 
5. tranfer exception  one method to another method call expection propragation. 

public class Exceptipon{
    public static void main(String[] args) {
        int a = 200;
         System.out.println(a);
         System.out.println("before divide");
         try {
            int arr[4] = 100;//exception gernrate
             int b = a/0;//exception gernrate
             System.out.println(b);
             
            } catch (Exception e) {// exception
                System.out.println(e);
            }
            System.out.println("after divide");
            
            
        }
        
    }
        custom exception 
        new keyword  obejct  banta aur object se constructor call hota h 
    
    */
    class Def {
    public void p() {
        throw new ArithmeticException("Generate an exception");
    }

    public void m() {
        p();
    }

    public void n() {
        m();
    }
}

class Exc {
    public static void main(String args[]) {
        Def d1 = new Def();
        try {
            d1.n();   // calling n() which calls m() → p() → exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after handling exception...");
    }
}