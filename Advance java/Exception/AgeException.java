import java.lang.*;
import java.util.Scanner;
class Check{
 public void validate(int age)
{
    if (age>18){
        System.out.println("age is valid ");
    }
    else {
 
        System.out.println("age is not  valid ");

    }
}
}
public class AgeException{
public static void main(String[] args) {
    Check c1 = new Check();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the age");
    int age = sc.nextInt();
    c1.validate(age);
   
}
}
