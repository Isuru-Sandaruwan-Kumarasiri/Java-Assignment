public class driver {
    public static void main(String[] args) {
        BookList myBookList = new BookList("My BookList");

        // Insert book details to the book list
        myBookList.insert(new Book(0, "Uncanny Valley", "Anna Wiener", 10));
        myBookList.insert(new Book(0, "Weather", "Jenny Offil", 4));
        myBookList.insert(new Book(0, "Long Bright River", "Liz Moore", 18));
        myBookList.insert(new Book(0, "The Glass Hotel", "Emily St & John Mandel", 2));
        myBookList.insert(new Book(0, "Afterlife", "Julia Alvarez", 14));

        myBookList.modify("Long Bright River",1);
        myBookList.details();
        myBookList.sortArray();







    }


}
