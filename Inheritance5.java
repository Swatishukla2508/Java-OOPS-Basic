
import java.util.Scanner;

interface Connectable {
    void connect();
}

interface Rechargeable {
    void recharge();
}

class Device {
    String type;
}

class Smartwatch extends Device implements Connectable, Rechargeable {

    String name;

    Smartwatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of device:");
        name = scanner.nextLine();
    }

    public void connect() {
        System.out.println("Smartwatch connected via Bluetooth");
    }

    public void recharge() {
        System.out.println("Smartwatch is charging");
    }

    void display() {
        System.out.println("Device name: " + name);
    }
}

public class Inheritance5 {
    public static void main(String[] args) {

        Smartwatch sw = new Smartwatch();

        sw.connect();
        sw.recharge();
        sw.display();
    }
}