package OOPPart.Shapes.model;

public class Circle extends Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle() { }


    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI  * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "It`s circle. Radius: " + radius + ". " + super.toString();
    }
}
