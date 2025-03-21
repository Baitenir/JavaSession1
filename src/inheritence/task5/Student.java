package inheritence.task5;

public class Student extends Apartment{
    private String fullName;
    private String phoneNumber;
    private String address;
    private int bankAccount;

    public Student() {
    }

    public Student(String fullName, String phoneNumber, String address1, int bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address1;
        this.bankAccount = bankAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int[] liveIn (Apartment apartment, Student[] rentApartment){
        int eachStudentPayMonth = payMonth(apartment, rentApartment);
        int[] canLives = new int[rentApartment.length];
        for (int i = 0; i < rentApartment.length; i++) {
            canLives[i] = rentApartment[i].getBankAccount() / eachStudentPayMonth;
        }
        return canLives;
    }
    // todo update method
//    public Student changeInfo (Student[] students, Student updateStudent){
//        for (Student student : students) {
//            if (student.getFullName() != null && updateStudent.getFullName().equals(student.fullName)){
//
//            }
//        }
//        return null;
//    }

    public void showInfoStudent() {
        System.out.println("______________________________________");
        System.out.println("Student name:         " + fullName);
        System.out.println("Student phone number: " + phoneNumber);
        System.out.println("Student address:      " + address);
        System.out.println("Student bankAccount:  " + bankAccount);

    }

    public void showAllStudents (Student[] students){
        for (Student student : students) {
            student.showInfoStudent();
        }
    }

}
