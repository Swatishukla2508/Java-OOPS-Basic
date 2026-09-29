import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int id;

    Employee() {
        name = "unknown";
        salary = 0;
        id = 0;
        System.out.println("default constructor called");
        System.out.println("employee name" + name);
        System.out.println("employee salary" + salary);
        System.out.println("employee id" + id);

    }

    Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    void Employeedetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of employee");
        name = scanner.nextLine();
        System.out.println("enter the salary of employee");
        salary = scanner.nextDouble();
        System.out.println("enter the id of employee");
        id = scanner.nextInt();
    }

    void employeedisplay() {
        System.out.println("employee name=" + name);
        System.out.println("employee salary=" + salary);
        System.out.println("employee id=" + id);
    }

}

public class Constructor1 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.Employeedetails();
        E1.employeedisplay();

    }

}
