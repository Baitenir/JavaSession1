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


    public Book[] getSimilarIdBooks(Book[] books) {
        int count = 0;
        Book[] newArrBooks = new Book[books.length];

        for (int i = 0; i < books.length; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].id == books[j].id) {
                    newArrBooks[count++] = books[i];
                    newArrBooks[count++] = books[j];
                }
            }
        }

        Book[] result = new Book[count];
        System.arraycopy(newArrBooks, 0, result, 0, count);

        return result;
    }


    public void showInfo (Book book){
        System.out.println(book.id + ", " + book.bookName + ", " + book.price +", " + book.genre +", " + book.publicDate);
    }

    public void showAll(Book[] books){
        for (Book book : books) {
            showInfo(book);
        }
            
    }
    
}
