class Employee {
    void calculatesalary() {

    }
}

class Manager extends Employee {
    void calculatesalary() {
        System.out.println("The manager salary is 100000");
    }
}

class Developer extends Employee {
    void calculatesalary() {
        System.out.println("The developer salary is 1200000");
    }
}

public class Polymorphism8 {
    public static void main(String[] args) {
        Manager M1 = new Manager();
        Developer D1 = new Developer();
        M1.calculatesalary();
        D1.calculatesalary();
    }

}
