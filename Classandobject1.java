import java.util.Scanner;

class Students {
    String name;
    int marks;
    int roll;

    void StudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of student");
        name = scanner.nextLine();
        System.out.println("enter the roll no");
        roll = scanner.nextInt();
        System.out.println("enter the marks");
        marks = scanner.nextInt();
    }

    void StudentDisplay() {

        System.out.println("student Name" + name);
        System.out.println("Student roll no" + roll);
        System.out.println("Student Marks" + marks);
    }
}

public class Classandobject1 {

    public static void main(String[] args) {
        Students S1 = new Students();
        S1.StudentDetails();
        S1.StudentDisplay();
    }

}
