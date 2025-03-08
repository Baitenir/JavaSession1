package Constructor.task4;

public class Person {
    String name;
    int age;
    String work;
    int salary;
    String phone;

    public Person (String name, int age, String work, int salary, String phone){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }

    public String ShowPeople() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static Person getMaxSalaryPerson(Person[] people) {
        Person maxSalaryPerson = people[0];
        for (int i = 1; i < people.length; i++) {
            if (people[i].salary > maxSalaryPerson.salary ) maxSalaryPerson = people[i];
        }
        return maxSalaryPerson;
    }

    public static Person getMinSalaryPerson(Person[] people) {
        Person minSalaryPerson = people[0];
        for (Person person : people) {
            if (person.salary < minSalaryPerson.salary) minSalaryPerson = person;
        }
        return minSalaryPerson;
    }


}
