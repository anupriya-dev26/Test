package oopsconcepts;

class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Cash Payment: " + amount);
    }
}
