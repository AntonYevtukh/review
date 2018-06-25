package OOPPart.Shapes.model;

import java.util.Comparator;

public abstract class Shape implements Drawable {


    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape(){
        shapeColor = "none";
    }

   public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    abstract public double calcArea();

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }

    @Override
    public String toString() {
        return "This shape color is " + shapeColor;
    }

    public static Comparator<Shape> areaComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape o1, Shape o2) {
            return Double.compare(o1.calcArea(), o2.calcArea());
        }
    };

    public static Comparator<Shape> colorComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape o1, Shape o2) {
            return o1.getShapeColor().compareTo(o2.getShapeColor());
        }
    };
}
