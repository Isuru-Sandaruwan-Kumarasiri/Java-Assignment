import java.util.Scanner;

public class BookList {
    private String name;

    private Book[] book = new Book[15];
    private int index;

    public BookList(String name) {
        this.name = name;
        this.index = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void insert(Book book1) {
        if (book != null) {
            boolean isCopy = false;
            for (int i = 0; i < index; i++) {
                if (book1.getBook_title().equals(book[i].getBook_title())) {
                    System.out.println("Copy");
                    isCopy = true;
                    break;
                }
            }
            if (!isCopy) {
                if (index < book.length) {
                    index++;
                    book[index] = book1;
                    book1.setID(index);

                } else {
                    System.out.println("BookList is full");
                }
            }

        }
    }


    public void delete(int id) {
        boolean find=false;
        int findIndex=0;

        for (int i=0;i<index;i++){
            System.out.println("run");
            if(book[i].getID()==id){
                find=true;
                findIndex=i;
                System.out.println("findindex-"+findIndex);

            }
        }
        if(find){
            book[findIndex]=null;
            System.out.println("index-"+index);

            for (int i=findIndex;i<index;i++){
                book[i]=book[i+1];
                book[i].setID(i);
            }
            book[index]=null;
            index--;
        }


    }
    public void details(){
        for (int i=0; i<book.length;i++){
            if(book[i]!=null){
                System.out.println(book[i]);
            }
        }
    }
    public Book search(String name) {
        Book findBook = null;
        if (!(book == null)) {
            for (int i = 0; i < index; i++) {
                if (book[i] != null && book[i].getBook_title().equals(name)) {
                    findBook = book[i];
                    break;
                }
            }
        }
        return findBook;
    }
    public void modify(String name,int rank){
        Book b=search(name);
        if(!(b==null)){
            b.setRank(rank);
        }

    }

    public void sortArray(){
        for (int i = 0; i < index ; i++) {
            for (int j = 0; j < index- i ; j++) {
                if (book[j].getRank() > book[j + 1].getRank()) {

                    Book temp = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i <=index; i++) {
                book[i].setID(i+1 );
        }



    }



}