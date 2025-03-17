package inheritence.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Technique tech = new Technique();
        Scanner scan = new Scanner(System.in);
        Computer computer = new Computer();
        Phone phone = new Phone();
        SmartWatch  smartWatch = new SmartWatch();

        computer.setName("Enigma");
        computer.setBrand("GermanMake");
        computer.setVersion(1);
        computer.setPass(1223);

        phone.setName("Redmi note 13 pro max ultra super phone");
        phone.setBrand("MI");
        phone.setVersion(13);
        phone.setPass(2122);

        smartWatch.setName("i12");
        smartWatch.setBrand("Apple");
        smartWatch.setVersion(12);
        smartWatch.setColor("Red");

        System.out.println("Select (On/Off)");
        String userOnOff = scan.nextLine();
        if (userOnOff.equalsIgnoreCase("On")) {
            System.out.println("Select the device (Computer / Phone / Smart watch): ");
            String userChoice = scan.nextLine();
            String userChoiceResult = tech.checkUserChoice(userChoice);

            int userPass = 0;
            if (userChoiceResult.equalsIgnoreCase("Phone")) {
                System.out.println("Write the password");
                userPass = scan.nextInt();
                String userPhonePassResult = phone.checkUserPass(userPass);
                if (userPhonePassResult.equals("Phone is on")){
                    System.out.println("Phone is on");
                    phone.showInfo(phone.getName(), phone.getBrand(), phone.getVersion());
                }
                else {
                    System.out.println("Invalid password!");
                }

            } else if (userChoiceResult.equalsIgnoreCase("Computer")) {
                System.out.println("Write the password");
                userPass = scan.nextInt();
                String userComputerPassResult = computer.checkUserPass(userPass);
                if (userComputerPassResult.equals("Computer is on!")) {
                    System.out.println("Computer is on!");
                computer.showInfo(computer.getName(), phone.getBrand(), computer.getVersion());
                }
                else {
                    System.out.println("Invalid password!");
                }

            } else if (userChoiceResult.equalsIgnoreCase("Smart Watch")) {
                System.out.println(smartWatch.smartWatchOn());
                smartWatch.showInfo(smartWatch.getName(), tech.getBrand(), tech.getVersion(), smartWatch.getColor());
            } else {
                System.out.println("ERROR");
            }
        }
        else if (userOnOff.equalsIgnoreCase("Off")) {
            System.out.println("Bye Bye");
        }


    }
}


//Создайте класс Technique с полями(name, brand, version) и
//метод turnOnOff(); возвращает "name + включена" или
//"name + выключена"
//
// пользователь должен дать с
//консоли именно какую технику он хочет включить или
//выключить.Если он выбирает телефон или компьютер
//запросите пароль
//Создайте класс Phone, Computer,
//SmartWatch, все эти классы должны наследоваться от
//класса Technique и в каждом классе должен быть по
//одному уникальному полю. Вызовите методы Parrent
//classа и переопределите их в каждом классе. В main
//создайте по 2 объекта каждого выводите всю
//информацию и вызовите методы.
