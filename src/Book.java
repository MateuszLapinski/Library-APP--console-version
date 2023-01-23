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
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        String isReadString= isRead? "Yes" : "No";
        System.out.println("Is Reading? " + isReadString);
        System.out.println();

    }

}
