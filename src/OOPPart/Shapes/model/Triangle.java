package OOPPart.Shapes.model;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle(){ }

   public Triangle(int side){
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }

    //Тоже можно вызвать внутри другие конструкторы
   public Triangle(int side, String color){
        super(color);
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }

   public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

   public Triangle(int sideA, int sideB, int sideC, String color){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
       double s = 1/2 * (sideA + sideB + sideC);
       double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return area;
    }


    @Override
    public String toString() {
        return "It`s triangle, sideA: " + sideA + ", sideB: " + sideB + ", sideC: " + sideC + ". " + super.toString();
    }
}
