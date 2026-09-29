class Printer {
    void print(int a) {
        System.out.println("Enter the integer:" + a);
    }

    void print(double d) {
        System.out.println("Enter the double:" + d);
    }

    void print(String s) {
        System.out.println("Enter the string :" + s);
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Printer P1 = new Printer();
        // P1.equals(5);
        P1.print("My name is khushi");
        P1.print(2500);
        P1.print(25);
    }

}
