import java.util.Scanner;

class Circle {
    int radius;

    void Circledetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius");
        radius = scanner.nextInt();

    }

    double area() {
        return Math.PI * radius * radius;
    }

    void Circledisplay() {
        System.out.println("radius of circle" + radius);
    }
}

public class Classandobject4 {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        C1.Circledetails();
        C1.Circledisplay();
        System.out.println("area of circle" + C1.area());
    }
}
