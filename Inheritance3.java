import java.util.Scanner;

class Person {
    String name;
    int age;

    void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of person");
        name = scanner.nextLine();
        System.out.println("Enter the age of a person");
        age = scanner.nextInt();

    }

    class Student extends Person {
        int roll;

        void Display2() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the roll no of person");
            roll = scanner.nextInt();

        }

        void Display3() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + roll);

        }
    }
}

public class Inheritance3 {
    public static void main(String[] args) {

        Person p1 = new Person();

        Person.Student s1 = p1.new Student();

        s1.display();
        s1.Display2();
        s1.Display3();

    }

}
