abstract class Paymentsystem {
    abstract void pay();
}

class Creitcard extends Paymentsystem {
    void pay() {
        System.out.println("paid by creditcard");
    }

}

class Upi extends Paymentsystem {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class Netbanking extends Paymentsystem {
    void pay() {
        System.out.println("paid by net banking");
    }
}

public class Abstraction4 {
    public static void main(String[] args) {
        Creditcard C1 = new Creditcard();
        Upi U1 = new Upi();
        Netbanking N1 = new Netbanking();

        C1.pay();
        U1.pay();
        N1.pay();
    }
}
