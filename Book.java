import java.util.Objects;

public class Book {
   private int ID;
    private  String Book_title;
    private String Author;
    private int Rank;
    private String bookStatus;


    public Book(int ID, String book_title, String author, int rank, String bookStatus) {
        this.ID = ID;
        Book_title = book_title;
        Author = author;
        Rank = rank;
        this.bookStatus = bookStatus;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBook_title() {
        return Book_title;
    }

    public void setBook_title(String book_title) {
        Book_title = book_title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
}
