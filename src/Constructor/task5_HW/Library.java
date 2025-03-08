package Constructor.task5_HW;

public class Library {
    int id;
    String name;
    String address;
    Book[] books;

    public Library(int id, String name, String address, Book[] books){
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public int books (){
        int c =0;
        for (Book book1 : books) {
            c = book1.id;
            for (Book book2 : books) {
                if (c == book2.id) return book2.id;
            }
        }
        return 0;
    }

    public static Book getSimilarIdBooks (Book[] books) {
        int bookId1 = 0;
        int bookId2 = 0;
        for (Book book : books) {
            bookId1 = book.id;
            for (Book book1 : books) {
                bookId2 = book1.id;
                if (bookId1 == bookId2) return book1;
            }
        }
        return null;

    }
}
