class Calculator {
    void add(int a, int b) {
        System.out.println("Value :" + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Value :" + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("value : " + (a + b));
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Calculator C1 = new Calculator();

        C1.add(2, 5);
        C1.add(3, 3);
        C1.add(3, 0, 3);

    }

}
