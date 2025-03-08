package Constructor.task5_HW;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1,"Red Apple", 45, "drama" , LocalDate.of(2007,2,2));
        Book book2 = new Book(2,"Love", 50, "drama" , LocalDate.of(2007,2,2));
        Book book3 = new Book(1,"Cats", 30, "drama" , LocalDate.of(2007,2,2));
        Book book4 = new Book(4,"Education", 75, "drama" , LocalDate.of(2007,2,2));
        Book book5 = new Book(4,"Knowledge", 65, "drama" , LocalDate.of(2007,2,2));
        Book[] books = new Book[] {book1, book2, book3, book4, book5};
        Library library1 = new Library(1,"Love", "a-12", books);
        Library library2 = new Library(2,"Love", "a-13", books);
        Library library3 = new Library(4,"Love", "a-1", books);




    }
}

//Book деген класс тузунуз
//полялары(id,bookName,price,genre,create
//        Date)
//Library деген класс тузунуз
//,полялары(id,name,address,Book[] books)
//Main ден 3 library 5 book тузунуз

//1 id деги library нин ичиндеги бардык
//китептерди алып чыккан метод
//тузунуз
