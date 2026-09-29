
class Shape {
    void draw() {

    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle is  draw");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle is draw");
    }
}

public class Polymorphism7 {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        Rectangle R1 = new Rectangle();

        C1.draw();
        R1.draw();
    }
}
