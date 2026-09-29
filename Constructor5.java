import java.util.Scanner;

class Movie {
    String name;
    String language;
    int rating;

    Movie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of movie");
        name = scanner.nextLine();
        System.out.println("Enter the language of movie");
        language = scanner.nextLine();
        System.out.println("Enter the rating of movie");
        rating = scanner.nextInt();
    }

    Movie(String name, String language, int rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;

    }

    void Moviedisplay() {
        System.out.println("Enter Movie Name" + name);
        System.out.println("Enter Movie Language" + language);
        System.out.println("Enter Movie Rating" + rating);
    }
}

public class Constructor5 {
    public static void main(String[] args) {
        Movie M1 = new Movie();
        Movie M2 = new Movie("Dhurandhar", "Hindi", 5);
        M1.Moviedisplay();
        M2.Moviedisplay();
    }

}
