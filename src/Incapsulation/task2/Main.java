package Incapsulation.task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Nicolo");
        customer1.setEmail("nicoBadboy@gmail.com");
        customer1.setDateOfBirth(LocalDate.of(1990,11,4));
        customer1.setPhoneNumber("996708342322");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Itachi");
        customer2.setEmail("gg@gmail.com");
        customer2.setDateOfBirth(LocalDate.of(2002,1,23));
        customer2.setPhoneNumber("996708312322");

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setFirstName("Tobirama");
        customer3.setEmail("tobi@gmail.com");
        customer3.setDateOfBirth(LocalDate.of(1985,8,17));
        customer3.setPhoneNumber("996708348762");

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setFirstName("Albert");
        customer4.setEmail("alb@gmail.com");
        customer4.setDateOfBirth(LocalDate.of(1960,5,12));
        customer4.setPhoneNumber("996708334232");

        Customer[] customersDB = new Customer[]{customer1, customer2}; // TODO DATABASE

        // TODO TEST CREATE METHOD:
        // TODO SUCCESS
          Customer customer = new Customer();
//        customersDB = customer.createCustomer(customersDB, customer3);
//        customer.showAllArray(customersDB);

        // TODO TEST GET ALL METHOD:
        // TODO SUCCESS
        // customer.showAllArray(customer.getAllCustomers(customersDB));

        // TODO TEST GET BY ID METHOD:
        // TODO SUCCESS
     //   System.out.println(customer.getById(3, customersDB).showAllInfoPerson());

        // TODO TEST UPDATE METHOD:
        // TODO SUCCESS
        Customer updateCustomer = new Customer();
        updateCustomer.setFirstName("Vivobook");
        updateCustomer.setPhoneNumber("123");
        customer.showAllArray(customer.updateCustomerById(2,customersDB, updateCustomer));



    }
}
