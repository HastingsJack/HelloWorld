public class Konto {
    private int accountNumber;
    private String name;
    private double balance;

    public Konto() {
    }

    public Konto(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Konto(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int number) {
        accountNumber = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double deposit) {
        return balance += deposit;
    }

    public double withdrawal(double withdraw) {
        if(withdraw > balance) {
            return -1;
        }
        balance -= withdraw;
        return balance;
    }

    public String toString() {
        return "Account Number: " + accountNumber + "\nName: " + name + "\nBalance: " + balance;
    }
}
