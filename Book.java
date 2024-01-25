import java.util.Objects;

public class Book {
   private int ID;
    private  String Book_title;
    private String Author;
    private int Rank;
    private String bookStatus;


    public Book(int ID, String book_title, String author, int rank) {
        this.ID = ID;
        Book_title = book_title;
        Author = author;
        Rank = rank;
        this.bookStatus =null;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getID() == book.getID() && getRank() == book.getRank() && Objects.equals(getBook_title(), book.getBook_title()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getBookStatus(), book.getBookStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getBook_title(), getAuthor(), getRank(), getBookStatus());
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", Book_title='" + Book_title + '\'' +
                ", Author='" + Author + '\'' +
                ", Rank=" + Rank +
                ", bookStatus='" + bookStatus + '\'' +
                '}';
    }
}
