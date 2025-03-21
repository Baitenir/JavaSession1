package accessModifier.task;

import java.util.Arrays;
import java.util.Scanner;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int password;
    Product[] products = new Product[10];

    public User(long id,String firstName, String lastName, String email, int password, Product[] products) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;
        this.firstName = firstName;
    }
    public User(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


    Scanner scannerForInt = new Scanner(System.in);
    Scanner scannerForString = new Scanner(System.in);
    User[] users = new User[10];

    /// register:
    int count = 0;
    public void register(){
        User user = new User();
        System.out.print("Write the id: ");
        user.setId(scannerForInt.nextInt());
        System.out.print("Write the first name: ");
        user.setFirstName(scannerForString.nextLine());
        System.out.print("Write the last name: ");
        user.setLastName(scannerForString.nextLine());
        System.out.print("Write the email: ");
        user.setEmail(scannerForString.nextLine());
        System.out.print("Write the password: ");
        user.setPassword(scannerForInt.nextInt());
        if (count < users.length){
            users[count++] = user;
            System.out.println();
            System.out.println("Successful saved!");
        } else {
            System.out.println();
            System.out.println("Error");
        }
        System.out.println(Arrays.toString(users));
    }

    /// login:
    public boolean login(){
        System.out.print("\nWrite email: ");
        String userLoginEmail = scannerForString.nextLine();
        System.out.print("Write password: ");
        int userLoginPassword = scannerForInt.nextInt();

        for (int i = 0; i < count; i++) {

            if (users[i].getEmail().equals(userLoginEmail) && (users[i].getPassword() == userLoginPassword)) {
                return true;
            } else {
                return false;
//                System.out.println("\nInvalid email or password, try again");
            }
        } return false;
    }

    // add product
    int countProduct = 0;
    public void addProduct (Product product){
        if (countProduct < products.length){
            products[countProduct++] = product;
        } else {
            System.out.println("error");
        }
    }

    public Product[] getAllProducts(){
        return products;
    }

    // exit:

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    //User (id,firstName, lastName, email, password,
//      products) Для старта сайта выбираем 3 операции
//-Register
//-Login
//-Exit
}
