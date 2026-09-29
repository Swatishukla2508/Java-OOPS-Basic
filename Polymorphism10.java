class Payment {
    void pay() {

    }
}

class Upi extends Payment {
    void pay() {
        System.out.println("Payment done through upi apps via id");
    }
}

class Creditcard extends Payment {
    void pay() {
        System.out.println("Payemnt done through credit card ");
    }
}

class Netbanking extends Payment {
    void pay() {
        System.out.println("Payment done through banks online services");
    }
}

public class Polymorphism10 {
    public static void main(String[] args) {
        Upi U = new Upi();
        Creditcard C = new Creditcard();
        Netbanking N = new Netbanking();

        U.pay();
        C.pay();
        N.pay();
    }
}
