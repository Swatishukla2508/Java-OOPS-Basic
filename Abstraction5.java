import java.util.Scanner;

abstract class Employee {
    abstract void calculatesalary();
}

class Manager extends Employee {

    void calculatesalary() {
        System.out.println("Manager salry is 100000");
    }
}

class Developer extends Employee {
    int w;
    Scanner scanner = new Scanner(System.in);

    void calculatesalary() {
        System.out.println("enter the no of working days");
        w = scanner.nextInt();

        System.out.println("Salary of developer is " + (10000 * w));
    }
}

public class Abstraction6 {
    public static void main(String[] args) {
        Manager M1 = new Manager();
        Developer D1 = new Developer();

        M1.calculatesalary();
        D1.calculatesalary();
    }
}
