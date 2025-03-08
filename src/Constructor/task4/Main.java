package Constructor.task4;

import static Constructor.task4.Person.getMaxSalaryPerson;
import static Constructor.task4.Person.getMinSalaryPerson;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Albert", 34, "Dentist", 1200,"Iphone 16 Pro Max");
        Person person2 = new Person("Nicolo", 54, "Teacher", 1000,"Samsung galaxy s24");
        Person person3 = new Person("Lopez", 24, "Artist", 800,"Xiaomi 12 Note");
        Person person4 = new Person("Joni", 30, "Taxi driver", 2300,"Iphone 12 pro");
        Person person5 = new Person("Sadyr", 43, "Programmer", 1700,"Poco X6");

        Person[] people = new Person[] {person1, person2, person3, person4, person5};
        for (Person pepe : people) {
            System.out.println(pepe.ShowPeople());
        }
        System.out.println("_____________________________");
        Person maxSalaryPerson = getMaxSalaryPerson(people);
        System.out.println("This person have more big salary: "+maxSalaryPerson.ShowPeople());

        System.out.println("_____________________________");
        Person minSalaryPerson = getMinSalaryPerson(people);
        System.out.println("This person have more small salary: "+minSalaryPerson.ShowPeople());

        System.out.println("_____________________________");
        System.out.println("This person have a more expensive phone: "+ person1.ShowPeople());

    }
}

//4-task
//Cоздайте класс Person c полями(name,
//age, work, salary, phone). В main
//создайте 5 объектов класса, дайте
//значения через конструктор, положите
//эти объекты в массив, сначала
//выведите все эти объекты на консоль.
//Теперь выведите человека у которого
//самая высокая зарплата,
// выведите у кого самая
// низкая зарплата, выведите у
//кого самый дорогой телефон.