package oopsconcepts;

class Emanager extends Employee {
    String department = "HR";

    void displayDetails() {
        System.out.println("Manager Details");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}