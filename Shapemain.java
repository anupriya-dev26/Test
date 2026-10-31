package oopsconcepts;

public class Shapemain {
    public static void main(String[] args) {

        ShapeCircle c = new ShapeCircle(5);
        c.calculateArea();

        Shaperectangle r = new Shaperectangle(10, 5);
        r.calculateArea();
    }
}
