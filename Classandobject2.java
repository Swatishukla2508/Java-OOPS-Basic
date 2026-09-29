import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;

    void Bookdetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of book");
        name = scanner.nextLine();
        System.out.println("enter the name of author");
        author = scanner.nextLine();
        System.out.println("enter the price of book");
        price = scanner.nextInt();
    }

    void Bookdisplay() {
        System.out.println("Book name" + name);
        System.out.println("Author name" + author);
        System.out.println("Book price" + price);
    }

}

public class Classandobject2 {

    public static void main(String[] args) {
        Book B1 = new Book();
        B1.Bookdetails();
        B1.Bookdisplay();
    }

}
