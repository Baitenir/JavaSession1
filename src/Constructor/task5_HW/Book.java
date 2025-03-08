package Constructor.task5_HW;

import java.time.LocalDate;

public class Book {
    int id;
    String bookName;
    int price;
    String genre;
    LocalDate publicDate;

    public Book (int id, String bookName, int price, String genre, LocalDate publicDate){
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.genre = genre;
        this.publicDate = publicDate;
    }

}
