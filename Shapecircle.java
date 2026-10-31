package oopsconcepts;

class ShapeCircle extends Shape {
    double radius;

    ShapeCircle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}
