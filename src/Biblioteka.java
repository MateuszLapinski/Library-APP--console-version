import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteka {
    private List<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.println("Podaj tytuł książki");
        String title = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Podaj Autora");
        String author = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Czy książka została przeczytana? (Y/N)");
        String isReadString = scanner.nextLine();
        System.out.println(" ");
        boolean isRead;
        if (isReadString.equals("Y")) {
            isRead = true;
            System.out.println("Książka została przeczytana");
        } else {
            isRead = false;
        }
        Book book = new Book(title, author, isRead);
        books.add(book);

        System.out.println("Książka została dodana");
        System.out.println(" ");

    }

    public void displayBookByAuthor() {

        System.out.println("Podaj autora: ");
        String authorUser = scanner.nextLine();
        books.stream()
                .filter(book -> book.getAuthor().equals(authorUser))
                .forEach(Book::displayBookInformation);



    }
    public void displayIsReading() {
        books.stream()
                .filter(book -> book.getisRead()==false)
                .forEach(Book::displayBookInformation);
    }


    public void displayBooks() {
        int i=0;
        for(Book  book: books) {
            i++;
            System.out.println(i+ ". " );
            book.displayBookInformation();
            System.out.println();


        }
        System.out.println(" ");
    }
    public void bookadding() {

        Book book1= new Book("Ślepnąc od świateł","Żulczyk", true);
        Book book2= new Book("Czarne Słońce","Żulczyk", true);
        Book book3= new Book("Instytut","Żulczyk", false);
        Book book4= new Book("Wzgórze Psów","Żulczyk", true);
        Book book5= new Book("Harry Potter","Rowling", true);
        Book book6= new Book("Przystań Wiatrów","Martin", false);
        Book book7= new Book("Krzyżacy","Sienkiewicz", true);
        Book book8= new Book("Eragon","Paulini", true);
        Book book9= new Book("Miecz przeznaczenia","Sapkowski", true);
        Book book10= new Book("Krótka historia czasu", "Hawking", false);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
    }

}
