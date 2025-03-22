package Modifier.task;

import java.time.LocalDate;

public class Book extends Product{
    private long id;
    private String authorFullName;

    public Book() {

    }
    public Book(long id, String name, String description, int price, LocalDate createDate, int productCount, long id1, String authorFullName) {
        super(id, name, description, price, createDate, productCount);
        this.id = id1;
        this.authorFullName = authorFullName;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", authorFullName='" + authorFullName + '\'' +
                '}';
    }
}
