class Account {
    private String holdername;
    private double balance;

    void setholdername(String holdernmae) {
        this.holdername = holdernmae;
    }

    void setbalance(double balance) {

        if (balance < 0) {
            System.out.println("Invalid Balance");
        } else {
            this.balance = balance;
        }
    }

    String getholdername() {
        return holdername;
    }

    double getbalance() {
        return balance;
    }

}

public class Encapsulation4 {
    public static void main(String[] args) {
        Account A1 = new Account();
        A1.setholdername("Khushi");
        A1.setbalance(250000);
        System.out.println("Account holdername" + A1.getholdername());
        System.out.println("Account balance" + A1.getbalance());

    }
}
