package accessModifier.task;
import java.time.LocalDate;
import java.util.Scanner;

public class Product {
    private long id;
    private String name;
    private String description;
    private int price;
    private LocalDate createDate;
    private String type;
    private int productCount;

    public Product(){

    }

    public Product(long id, String name, String description, int price, LocalDate createDate, int productCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createDate = createDate;
        this.productCount = productCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    Scanner scannerForInt = new Scanner(System.in);
    Scanner scannerForString = new Scanner(System.in);

    public String createProduct (User user){
        System.out.println("Select type: 1-Electronics \n 2-Books");
        int userType = scannerForInt.nextInt();
        if (userType == 1){
            Electronics electronics = new Electronics();
            System.out.println("Write the id: ");
            electronics.setId(scannerForInt.nextInt());
            System.out.println("Write the brand: ");
            electronics.setBrand(scannerForString.nextLine());
            System.out.println("Write the color: ");
            electronics.setColor(scannerForString.nextLine());
            System.out.println("Write the isNew: ");
            electronics.setNew(scannerForString.nextBoolean());
            System.out.println("Write the memory: ");
            electronics.setMemory(scannerForInt.nextInt());
            user.addProduct(electronics);

        } else if (userType == 2){
            Book book = new Book();
            System.out.println("Write the id: ");
            book.setId(scannerForInt.nextInt());
            System.out.println("Write the authorFullName: ");
            book.setAuthorFullName(scannerForString.nextLine());
            user.addProduct(book);

        } else {
            System.out.println("Invalid type");
        }
        return "Error";

    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                ", productCount=" + productCount +
                '}';
    }
}
