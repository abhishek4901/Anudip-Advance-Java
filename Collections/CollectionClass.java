import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    public Employee() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    // Parameterized constructor
    public Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    // Display method
    public void Display() {
        System.out.println("ID: " + id + "  Name: " + name + "  Salary: " + salary);
    }
}

public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<Employee> l1 = new ArrayList<Employee>();

        // Creating employee objects
        Employee e1 = new Employee(101, "Jarvis", 50);
        Employee e2 = new Employee(102, "saurabh", 600);
        Employee e3 = new Employee(103, "Mithai ji", 5500);

        // Adding employees to ArrayList
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);

        // Displaying employee details
        for (Employee e : l1) {
            e.Display();
        }
    }
}
