package oopsconcepts;

public class MainClass {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.deposit(2000);
        b.withdraw(1000);
        b.display();
    }
}
