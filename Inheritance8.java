
import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void Showemployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of employee");
        name = scanner.nextLine();
        System.out.println("Enter the salary of employee");
        salary = scanner.nextDouble();
    }
}

class Manager extends Employee {
    String work;
    int workhour;

    void showmanagaer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the work manager do in office");
        work = scanner.nextLine();
        System.out.println("Enter the workhour of manager in office");
        workhour = scanner.nextInt();
    }

    void displayManager() {
        System.out.println("Manager work in office " + work);
        System.out.println("Manager workhour in office " + workhour);
    }
}

class Developer extends Employee {
    String work1;
    String Work2;

    void showdeveloper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the work1 of developer");
        work1 = scanner.nextLine();
        System.out.println("Enter the work2 of developer");
        Work2 = scanner.nextLine();
    }

    void display() {
        System.out.println("Employee name please " + name);
        System.out.println("Employee salary please " + salary);
        System.out.println("Developer work he do " + work1);
        System.out.println("Developer work he do " + Work2);
    }
}

public class Inheritance8 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        Manager M1 = new Manager();
        Developer D1 = new Developer();

        E1.Showemployee();
        M1.showmanagaer();
        M1.displayManager();
        D1.showdeveloper();
        D1.display();
    }
}