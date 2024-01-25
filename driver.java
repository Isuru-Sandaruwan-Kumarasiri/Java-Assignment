public class driver {
    public static void main(String[] args) {
        Book b1=new Book(23,"isuru","isuru",34,"read");
        Book b2=new Book(24,"isur","isuru",34,"read");
        Book b3=new Book(25,"isu","isuru",34,"read");
        Book b4=new Book(26,"is","isuru",34,"read");

        BookList nam=new BookList("education");
        nam.insert(b1);
        nam.insert(b2);
        nam.insert(b3);
        nam.insert(b4);

        nam.details();

        nam.delete(1);

        nam.details();



    }


}
