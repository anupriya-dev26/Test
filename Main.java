package oopsconcepts;

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(1000);

        p = new CreditCard();
        p.pay(2000);

        p = new Cash();
        p.pay(500);
    }
}
