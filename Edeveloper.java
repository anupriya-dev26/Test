package oopsconcepts;

class Developer extends Employee {
    String language = "Java";

    void displayDetails() {
        System.out.println("Developer Details");
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}
