package inheritence.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ilon Mask", "0708 09 08 77", "Naryn", 10000);
        Student student2 = new Student("Nicolo Tesla", "0708 09 08 77", "Talas", 12000);
        Student student3 = new Student("Alon Turing", "0708 09 08 77", "Naryn", 8000);
        Student student4 = new Student("Mergen Turgan", "0708 09 08 77", "Talas", 22000);
        Student student5 = new Student("Kamchybek Tashiev", "0708 09 08 77", "Naryn", 18000);
        Student student6 = new Student("Erulan Kokulov", "0708 09 08 77", "Talas", 36000);

        Apartment apartment1 = new Apartment("Macqueen", 12000, "Naryn");
        Apartment apartment2 = new Apartment("Helicopter", 15000, "Talas");

        Student[] rentApartment1 = new Student[]{student1, student2, student3};
        Student[] rentApartment2 = new Student[]{student4, student5, student6};
        Scanner scanner = new Scanner(System.in);
        
        // todo panel:
        System.out.println("""
                Select apartment:
                  1. Macqueen
                  2. Helicopter
                """);
        int userChoice = scanner.nextInt();

        int[] canLives1 = new int[rentApartment1.length];
        canLives1 = student3.liveIn(apartment1,rentApartment1);
        int[] canLives2 = new int[rentApartment2.length];
        canLives2 = student3.liveIn(apartment2,rentApartment2);

        if (userChoice == 1){
            apartment1.showApartmentAndStudentsInApartment(apartment1);
            student3.showAllStudents(rentApartment1);
            System.out.println();
            System.out.println("_______________________________________________________");
            System.out.println("Every student must pay " + apartment1.payMonth(apartment1, rentApartment1) + "som month");
            System.out.println(student1.getFullName() + " can live here " + canLives1[0] + " months");
            System.out.println(student2.getFullName() + " can live here " + canLives1[1] + " months");
            System.out.println(student3.getFullName() + " can live here " + canLives1[2] + " months");

        } else if (userChoice == 2) {
            apartment1.showApartmentAndStudentsInApartment(apartment2);
            student3.showAllStudents(rentApartment2);
            System.out.println("_______________________________________________________");
            System.out.println("Every student must pay " + apartment1.payMonth(apartment2, rentApartment2) + "som month");
            System.out.println(student4.getFullName() + " can live here " + canLives2[0] + " months");
            System.out.println(student5.getFullName() + " can live here " + canLives2[1] + " months");
            System.out.println(student6.getFullName() + " can live here " + canLives2[2] + " months");
        }

        // todo test update method:
//        Student student7 = new Student();
//        student7.fullName = "fantom";

    }
}


//1) ЭКИ КЛАСС ТУЗУНУЗ
//* APARTMENT (TITLE, PRICE, ADDRESS)
//* STUDENT ( FULLNAME, PHONENUMBER, ADDRESS,
//            BANKACCOUNT)
//* 2) APARTMENT КЛАССЫНА 2 ОБЬЕКТ, STUDENT КЛАССЫНА 6 ОБЬЕКТ ТУЗУП, АЛАРДЫН
//ПОЛЕЛЕРИН ТОЛТУРУНУЗ.
//        * (БИР КВАРТИРАНЫН ЖАНА 3 СТУДЕНТТИН АДРЕСТЕРИ ОКШОШ БОЛСУН, ЭКИНЧИ
//КВАРТИРАНЫН ЖАНА КАЛГАН 3 СТУДЕНТТЕРДИН АДРЕСТЕРИ ОКШОШ БОЛСУН)
//        * 3)СТУДЕНТЕРДИ ОЗУНЧО МАССИВГЕ, КВАРТИРАЛАРДЫ ОЗУНЧО МАССИВГЕ САЛЫНЫЗ.

//        * 4)КОНСОЛЬДОН КВАРТИРАНЫН АТЫН БЕРСЕНИЗ, ОШОЛ КВАРТИРАНЫ ЖАНА АНДА
//ЖАШАГАН СТУДЕНТТЕРДИ КОНСОЛЬГО ЧЫГАРА ТУРГАН МЕТОД ТУЗУНУЗ
//* 5)КВАРТИРА КЛАССЫНЫН ИЧИНДЕ БИР PAYPERMONTH(); ДЕГЕН МЕТОДУ БОЛСУН, АЛ МЕТОДАР БИР СТУДЕНКЕ КАНЧА СОМДОН КВАРТПЛАТА БЕРУУСУН ЧЫГАРСЫН.

//* 6)СТУДЕНТ КЛАССЫНЫН ИЧИНДЕ БИР LIVEIN(); ДЕГЕН МЕТОД БОЛСУН, АЛ МЕТОД
//СТУДЕНТТИН КАПЧЫГЫНА ЖАРАША АЛ КВАРТИРАДА КАНЧА АЙ ЖАШАЙ АЛУУСУН
//ЧЫГАРСЫН.
//* 7)СТУДЕНТ КЛАССЫНДА ДАГЫ БИР CHANGEINFO(); ДЕГЕН МЕТОД БОЛСУН АЛ МЕТОД
//СТУДЕНТТИН ДАННЫЙЛАРЫН ОЗГОРТУП БЕРСИН