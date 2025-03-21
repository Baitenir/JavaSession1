package accessModifier.task1;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public static int  deposit(BankAccount bankAccount, int increaseMoney){
        bankAccount.setBalance(bankAccount.getBalance() + increaseMoney);
        return bankAccount.getBalance();
    }

    public static int withdraw(BankAccount bankAccount, int withdrawMoney){
        bankAccount.setBalance(bankAccount.getBalance() - withdrawMoney);
        return bankAccount.getBalance();
    }

    public static int getUserBalance(BankAccount bankAccount){
        return bankAccount.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
