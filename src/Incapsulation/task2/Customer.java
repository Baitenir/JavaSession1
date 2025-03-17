package Incapsulation.task2;

import java.time.LocalDate;

public class Customer {
    private long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    // setters and getters:
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    // TODO CRUD METHODS:
    // TODO 1 - CREATE:
    public Customer[] createCustomer (Customer[] customers, Customer customer){
        Customer[] newCustomers = new Customer[customers.length + 1];
        for (int i = 0; i < customers.length; i++) {
            newCustomers[i] = customers[i];
        }
        newCustomers[customers.length] = customer;
        customers = newCustomers;
        System.out.println("Succes saved!");
        return customers;
    }

    // TODO 2 - READ (GET ALL AND GET BY ID)
    // TODO GET ALL:
    public Customer[] getAllCustomers (Customer[] customers){
        return customers;
    }

    // TODO 2 - READ (GET ALL AND GET BY ID)
    // TODO GET BY ID:
    public Customer getById(long id, Customer[] customers){
        for (Customer customer : customers) {
            if (customer.id == id) return customer;
        }
        return null;
    }

    // TODO 3 - UPDATE:
    public Customer[] updateCustomerById (long id, Customer[] customers, Customer updateCustomer){
        Customer oldCustomer = getById(id, customers);
        if (updateCustomer.firstName != null && !oldCustomer.firstName.equals(updateCustomer.firstName)) {
            oldCustomer.setFirstName(updateCustomer.firstName);
        }
        if (updateCustomer.email != null && !oldCustomer.email.equals(updateCustomer.email)){
            oldCustomer.setEmail(updateCustomer.email);
        }
        if (updateCustomer.dateOfBirth != null && !oldCustomer.dateOfBirth.equals(updateCustomer.dateOfBirth)){
            oldCustomer.setDateOfBirth(updateCustomer.dateOfBirth);
        }
        if (updateCustomer.phoneNumber != null && !oldCustomer.phoneNumber.equals(updateCustomer.phoneNumber)){
            oldCustomer.setPhoneNumber(updateCustomer.phoneNumber);
        }
        return customers;
    }

    // TODO 4 - DELETE:
    public Customer[] deleteCustomerById (long id, Customer[] customers){
        return null;
    }

    public String showAllInfoPerson(){
        return  "Id: "+ id +
                "\nName: " + firstName +
                "\nEmail: "+ email +
                "\nDate of birth: " + dateOfBirth+
                "\nPhone number: "+ phoneNumber;
    }

    public void showAllArray (Customer[] customers){
        System.out.println("______________________________________");
        for (Customer customer : customers) {
            System.out.println(customer.showAllInfoPerson());
            System.out.println();
        }
        System.out.println("______________________________________");
    }

}
