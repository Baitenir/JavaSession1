package accessModifier.task1;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("ID: 20050708");
        bankAccount.setBalance(200000);
        System.out.println("Your account number: "+bankAccount.getAccountNumber());
        System.out.print("Your balance: "+bankAccount.getBalance());

        BankAccount.deposit(bankAccount, 76000);
        System.out.print("\n\nYour balance after deposit: ");
        System.out.println(BankAccount.getUserBalance(bankAccount));

        System.out.print("Your balance after withdraw: ");
        BankAccount.withdraw(bankAccount, 34000);
        System.out.println(BankAccount.getUserBalance(bankAccount));

    }
}
    //Task 1
    //BankAccount деген класс тузунуз access модификатор
    //default болсун.
    //        Полелер: accoutNumber,balance (private болсун)
    //Методдор(static болсун):
    //deposit(double amount) баланска кошот
    //withdraw(double amount) баланстан алат
    //getBalance() балансты чыгарып берет
    //Методдорду main’ден чакырып иштетиниздер