import java.util.Scanner;

class Laptop {
    String brand;
    int model;
    double price;

    Laptop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name of Brand");
        brand = scanner.nextLine();
        System.out.println("Enter The Model Name");
        model = scanner.nextInt();
        System.out.println("Enter The Price of Laptop");
        price = scanner.nextDouble();
    }

    Laptop(String brand, int model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void Display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        Laptop L2 = new Laptop("Lenovo", 25, 68000);
        L1.Display();
        L2.Display();

    }

}
