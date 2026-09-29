import java.util.Scanner;

class Book {
    String author;
    String title;
    double price;

    Book() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the author of book");
        author = scanner.nextLine();
        System.out.println("enter the title of book");
        title = scanner.nextLine();
        System.out.println("enter the price of book");
        price = scanner.nextDouble();
    }

    Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    void Display() {
        System.out.println("Enter Book Author" + author);
        System.out.println("Enter Book Title" + title);
        System.out.println("Enter Book Price" + price);
    }
}

public class Constructor3 {
    public static void main(String[] args) {
        Book B1 = new Book();
        Book B2 = new Book("Chetan bhagat", "half girlfriend", 2500);
        B1.Display();
        B2.Display();
    }
}
