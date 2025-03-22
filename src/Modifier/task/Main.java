package Modifier.task;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Product product = new Product();

        boolean isTrue = true;
        boolean isAuthenticated = false;
        while (isTrue) {

            System.out.println("""
                    __________________ 
                        MENU
                    1. REGISTER
                    2. lOGIN
                    3. Add product
                    4. Get all product
                    5. Exit
                    __________________
                    """);
            System.out.print("Choose method: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.register();
                    break;
                case 2:
                    if (user.login()) {
                        isAuthenticated = true;
                        System.out.println("Welcome!");
                    } else {
                        System.out.println("\nInvalid email or password, try again!");
                    }
                    break;
                case 3:
                    if (isAuthenticated){
                        product.createProduct(user);
                    } else {
                        System.out.println("\nYou don't have authenticated!");
                    }
                    break;
                case 4:
                    if (isAuthenticated) {
                        System.out.println(Arrays.toString(user.getAllProducts()));
                    } else {
                        System.out.println("\nYou don't have authenticated!");
                    }
                    break;
                case 5: isTrue = false; break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}

// Создайте клаcc Product.
//Поля (id,name, description, price,
//      createDate,type,productCount)
//Создайте два дочерних класса
//Electronics поля(id,brand, color, isNew, memory) и
//Book (id,authorFullName)

//User (id,firstName, lastName, email, password,
//      products) Для старта сайта выбираем 3 операции
//-Register
//-Login
//-Exit

//После входа в аккаунт пользователю должны быть доступны
//следующие методы:
//        -Add new Product
//-Get All Products
//-Get All Electronics