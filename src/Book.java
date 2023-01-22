public class Book {
    private String title;
    private String author;
    private boolean isRead;

    public Book(String title, String author, boolean isRead) {
        this.title = title;
        this.author = author;
        this.isRead = isRead;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getisRead() {
        return isRead;
    }

    public void displayBookInformation() {
        System.out.println("Tytuł: "+ title);
        System.out.println("Autor: "+ author);
        String isReadString= isRead? "Tak" : "Nie";
        System.out.println("Przeczytana? " + isReadString);
        System.out.println();

    }

}
