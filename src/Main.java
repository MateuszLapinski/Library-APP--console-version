import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean shouldContinue= true;
        LibraryApp libraryApp= new LibraryApp();
        libraryApp.bookadding();

        while(shouldContinue) {
            System.out.println("Choose an option: ");
            System.out.println("1. Display available books");
            System.out.println("2. Adding books");
            System.out.println("3. Display unread books");
            System.out.println("4. Find by author");
            System.out.println("5. Finish");

            int userChoice= scanner.nextInt();

            switch(userChoice) {
                case 1 -> libraryApp.displayBooks();
                case 2 -> libraryApp.addBook();
                case 3 -> libraryApp.displayIsReading();
                case 4 -> libraryApp.displayBookByAuthor();
                case 5 -> shouldContinue=false;
            }
        }
    }
}

