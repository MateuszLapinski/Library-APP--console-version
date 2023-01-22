import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean shouldContinue= true;
        Biblioteka biblioteka= new Biblioteka();
        biblioteka.bookadding();

        while(shouldContinue) {
            System.out.println("Choose an option:");
            System.out.println("1. Wyświetl dostępne książki");
            System.out.println("2. Dodaj książkę");
            System.out.println("3. Wyświetl książki nieprzeczytane");
            System.out.println("4. Znajdź po autorze");
            System.out.println("5. Zakończ");

            int userChoice= scanner.nextInt();

            switch(userChoice) {
                case 1 -> biblioteka.displayBooks();
                case 2 -> biblioteka.addBook();
                case 3 -> biblioteka.displayIsReading();
                case 4 -> biblioteka.displayBookByAuthor();
                case 5 -> shouldContinue=false;
            }
        }
    }
}

