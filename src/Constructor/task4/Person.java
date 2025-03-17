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

    public Person (){

    }

    public String ShowPeople() {
        return "Person " +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", work: '" + work + '\'' +
                ", salary: " + salary +
                ", phone: '" + phone + '\'' +
                '}';
    }

    public Person getPersonBiggerSalary(Person[] people){
        Person maxSalaryPerson = people[0];

        for (Person person : people) {
            if (person.salary > maxSalaryPerson.salary) maxSalaryPerson = person;
        }
        return maxSalaryPerson;
    }

    public Person getPersonWithSmallSalary(Person[] people){
        Person minSalaryPerson = people[0];
        for (Person person : people) {
            if (minSalaryPerson.salary < person.salary) minSalaryPerson = person;
        }
        return minSalaryPerson;
    }
}
