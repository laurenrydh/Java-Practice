package ClassObjectConstructors;

public class BankAccount {
    private String name;
    private double balance;

    // This is the constructor
    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }
    public void Withdrawl(double amount) {
        if (this.balance < amount) {
            System.out.println("Overdraft Warning!");
        } else {
            this.balance -= amount;
        }
    }

    public void AccountStatement() {
        System.out.println("hello " + this.name + ", " + "Your Account balance is: " + this.balance);
    }
    
    public static void main (String[] args) {

    BankAccount checking1 = new BankAccount("Lauren", 500);

    checking1.Deposit(100);
    checking1.AccountStatement();

    // Bank Transfer
    BankAccount checking2 = new BankAccount("Minecraft Steve", 5000);
    BankAccount checking3 = new BankAccount("Hector", 300);

    checking2.Withdrawl(100);
    checking3.Deposit(100);

    checking2.AccountStatement();
    checking3.AccountStatement();
}
}

