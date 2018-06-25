package OOPPart.Shapes.model;

public class Rectangle extends Shape {

    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

   public Rectangle(){ }

   public Rectangle(int side){
        this.width = side;
        this.height = side;
    }

    public Rectangle(int side, String color){
        super(color);
        this.width = side;
        this.height = side;
    }

   public Rectangle(int height, int width){
        this.width = width;
        this.height = height;
    }

    public Rectangle(int height, int width, String color){
        super(color);
        this.width = width;
        this.height = height;
    }



    @Override
    public double calcArea() {
        return height*width;
    }


    @Override
    public String toString() {
       return "It`s rectangle, width: " + width + ", height: " + height + ". " + super.toString();
    }
}
