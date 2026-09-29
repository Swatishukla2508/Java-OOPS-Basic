import java.util.*;

abstract class Shape {
    void area() {

    }
}

class Rectangle extends Shape {
    int l;
    int b;

    void shape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenghth");
        l = scanner.nextInt();

        System.out.println("Enter the breadth");
        b = scanner.nextInt();
    }

    void area() {
        System.out.println("Area of rectangle: " + (l * b));
    }
}

class Circle extends Shape {
    int r;

    void Shape() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius");
        r = scanner.nextInt();
    }

    void area() {
        System.out.println("Area of circle: " + (3.14 * r * r));

    }
}

public class Abstraction3 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        Circle C1 = new Circle();
        R1.shape();
        R1.area();
        C1.Shape();
        C1.area();

    }

}
