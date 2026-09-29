class Shape {
    void area(int l, int b) {
        System.out.println("Recatngle area:" + (l * b));
    }

    void area(int s) {
        System.out.println("Square area:" + (s * s));
    }

    void area(short r) {
        System.out.println("Circle area :" + (3.14 * r * r));
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {
        Shape S1 = new Shape();
        S1.area(100);
        S1.area(25, 25);
        S1.area(250);
    }
}
