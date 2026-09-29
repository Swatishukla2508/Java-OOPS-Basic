import java.util.Scanner;

class Shape {
    void area() {

    }
}

class Rectangle extends Shape {
    int l, b;
    int area;

    void area() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        l = scanner.nextInt();

        System.out.println("Enter the breadth of rectangle");
        b = scanner.nextInt();
        area = l * b;
    }

    void display() {
        System.out.println("Area of rectangle " + area);
    }
}

public class Inheritance7 {
    public static void main(String[] args) {
        Rectangle S1 = new Rectangle();
        S1.area();
        S1.display();
    }

}
