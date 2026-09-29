import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    void Rectangledetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length");
        length = scanner.nextInt();
        System.out.println("enter the breadth");
        breadth = scanner.nextInt();

    }

    int area() {
        return length * breadth;
    }

    void Rectangledisplay() {

        System.out.println("Rectangle length" + length);
        System.out.println("Rectangle breadth" + breadth);
    }

}

public class Classandobject3 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.Rectangledetails();
        R1.Rectangledisplay();
        R1.area();

        System.out.println("Area of rectangle: " + R1.area());
    }
}
// System.out.println("area of rectangle" +);
