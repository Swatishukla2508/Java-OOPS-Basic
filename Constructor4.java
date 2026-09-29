import java.util.Scanner;

class Car {
    String company;
    String model;
    Byte mileage;

    Car() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of company");
        company = scanner.nextLine();
        System.out.println("Enter the model of car");
        model = scanner.nextLine();
        System.out.println("enter the mielage");
        mileage = scanner.nextByte();
    }

    Car(String company, String model, Byte mileage) {
        this.company = company;
        this.model = model;
        this.mileage = mileage;
    }

    void Display() {
        System.out.println("Enter Name Of Car Company" + company);
        System.out.println("Enter Model Of Car" + model);
        System.out.println("Enter Mileage of Car" + mileage);
    }
}

public class Constructor4 {
    public static void main(String[] args) {
        Car C1 = new Car();
        Car C2 = new Car("Hyundai", "zedblack", (byte) 45);
        C1.Display();
        C2.Display();

    }

}
