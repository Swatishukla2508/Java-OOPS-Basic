
import java.util.Scanner;

class Account {
    void accountdetails() {

    }
}

class Currentacc extends Account {
    String accountholdername;
    int transactionlimit;
    int overdraftlimit;

    void accountdetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter accountholdername");
        accountholdername = scanner.nextLine();
        System.out.println("enter transaction limit");
        transactionlimit = scanner.nextInt();
        System.out.println("enter overdraft limit");
        overdraftlimit = scanner.nextInt();

    }

    void display() {
        System.out.println("Accountholder name:" + accountholdername);
        System.out.println("transaction limit:" + transactionlimit);
        System.out.println("enter overdraftlimit" + overdraftlimit);
    }

}

class Savingacc extends Account {
    String accholdername;
    double minbalance;
    int minwithdrawal;

    void accountdetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter accholdername");
        accholdername = scanner.nextLine();
        System.out.println("enter minbalance");
        minbalance = scanner.nextDouble();
        System.out.println("enter minwithdrawl");
        minwithdrawal = scanner.nextInt();

    }

    void display2() {
        System.out.println("Accountholder name:" + accholdername);
        System.out.println(" balance limit:" + minbalance);
        System.out.println("enter withdrawl limit" + minwithdrawal);
    }
}

public class Inheritance9 {
    public static void main(String[] args) {
        Currentacc C1 = new Currentacc();
        Savingacc S1 = new Savingacc();
        C1.accountdetails();
        C1.display();
        S1.accountdetails();
        S1.display2();
    }

}
