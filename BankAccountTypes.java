import java.util.*;

// Base class: BankAccount
class BankAccount {

    protected String accountNumber;
    protected double balance;

    // Constructor to initialize BankAccount details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor to initialize SavingsAccount details
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overriding displayAccountDetails method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {

    private double withdrawalLimit;

    // Constructor to initialize CheckingAccount details
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding displayAccountDetails method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: Rs." + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {

    private int depositTerm;
    private double maturityAmount;

    // Constructor to initialize FixedDepositAccount details
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm, double maturityAmount) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
        this.maturityAmount = maturityAmount;
    }

    // Overriding displayAccountDetails method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
        System.out.println("Maturity Amount: Rs." + maturityAmount);
    }
}

// Main class to test Bank Account Types
public class BankAccountTypes {
    public static void main(String[] args) {

        // Creating instances of different account types
        SavingsAccount savings = new SavingsAccount("SA12345", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 20000, 5000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 100000, 12, 110000);

        // Displaying account details
        savings.displayAccountDetails();
        System.out.println();
        checking.displayAccountDetails();
        System.out.println();
        fixedDeposit.displayAccountDetails();
    }
}
