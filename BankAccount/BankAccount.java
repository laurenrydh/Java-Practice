package BankAccount;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount {
    private String name;
    private double balance;
    private int accountNumber;
    static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    static int accountCounter = 0;

    // This is the constructor
    public BankAccount(String name, double balance, int accountNumber) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public BankAccount() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Are you an existing customer?");
            System.out.println("1. Yes");
            System.out.println("2. No");
    
            int answer = scanner.nextInt();
            scanner.nextLine();
    
            if (answer == 1) {
                System.out.println("Please enter your account number: ");
                this.accountNumber = scanner.nextInt();
                scanner.nextLine();
                BankAccount account = null;
                for (int i = 0; i < accounts.size(); i++) {2
                    if (accounts.get(i).accountNumber == this.accountNumber){
                        account = accounts.get(i);
                    }
                }
                if (account == null) {
                    System.out.println("Account doesn't exist");
                } else {
                    this.name = account.name;
                    this.balance = account.balance;
                    break;
                }
            } else if (answer == 2) {
                System.out.println("Let's make a new account!");
                System.out.println("What is the name for the account?");
                this.name = scanner.nextLine();
                System.out.println("What is the beginning balance for the account?");
                this.balance = scanner.nextDouble();
                scanner.nextLine();
                this.accountNumber = accountCounter;
                accountCounter += 1;
                break;
            }
        }
      
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

    public void Transfer(BankAccount to, double amount) {
        this.Withdrawl(amount);
        to.Deposit(amount);
    }

    public static void MainMenu(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Hello " + account.name + "!");
            System.out.println("Welcome to the main menu, what would you like to do today?");
            System.out.println("1. To check account balance");
            System.out.println("2. To make a withdrawal");
            System.out.println("3. To make a deposit");
            System.out.println("4. To make a tranfer to another account");
            System.out.println("0. To exit.");
            int answer = scanner.nextInt();
            if (answer == 1) {
                account.AccountStatement();
            } else if (answer == 2) {
                System.out.println("How much would you like to withdraw?");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                account.Withdrawl(amount);
            } else if (answer == 3) {
                System.out.println("How much would you like to deposit?");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                account.Deposit(amount);
            } else if (answer == 4) {
                System.out.println("Please enter the account number you would like to transfer to:");
                int accountNumber = scanner.nextInt();
                scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).accountNumber == accountNumber){
                        found = true;
                        System.out.println("Please enter the amount you would like to transfer: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        account.Transfer(accounts.get(i), amount);
                    }
                }
                if (!found) {
                    System.out.println("Account doesn't exist");
                }
            } else if (answer == 0) {
                break;
            } else {
                System.out.println("Invalid response, please try again.");
            }
        }

    }
    public static void main (String[] args) {
        while(true) {
            BankAccount account = new BankAccount();
            accounts.add(account);
            MainMenu(account);
        }
    }
}

