package oopsconcepts;

class Shaperectangle extends Shape {
    int length;
    int breadth;

    Shaperectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}
