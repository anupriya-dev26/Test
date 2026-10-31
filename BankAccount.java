package oopsconcepts;

class BankAccount {
    int accountNumber = 12345;
    private double balance = 5000;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}