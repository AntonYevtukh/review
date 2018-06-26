package OOPPart.Shapes.controller;

import OOPPart.Shapes.model.Circle;
import OOPPart.Shapes.model.Rectangle;
import OOPPart.Shapes.model.Shape;
import OOPPart.Shapes.model.Triangle;

import java.util.Arrays;

//Это скорей относится к модели, нежели к крнтроллеру, по сути это как методы бизнес-логики / обработки данных
public class ShapeController {

    public ShapeController() {
    }


    public Shape[] initArray() {
        Shape sh1 = new Circle(5, "Black");
        Shape sh2 = new Rectangle(5, "White");
        Shape sh3 = new Rectangle(8, 3, "Blue");
        Shape sh4 = new Triangle(12, "Red");
        Shape sh5 = new Triangle(12, 5, 9, "Green");
        Shape sh6 = new Triangle(4, 7, 12, "Blue");
        Shape sh7 = new Circle(10, "Red");
        Shape sh8 = new Circle(3, "Black");
        Shape sh9 = new Rectangle(9, "Red");
        Shape sh10 = new Rectangle(5, 11, "Green");

        //лучше называть массивы и списки по имени класса в множественном числе - Shape[] shapes
        Shape[] arr = {sh1, sh2, sh3, sh4, sh5, sh6, sh7, sh8, sh9, sh10};
        return arr;
    }

    public void showData(Shape[] arr){
        if (arr.length == 0) System.out.println("No data"); //перенос
        else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public double summaryArea(Shape[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].calcArea(); //пробелы
        }
        return sum;
    }


    public Shape[] sortByArea(Shape[] arr){
        Shape[] res;
        res = Arrays.copyOf(arr, arr.length);
        Arrays.sort(res, Shape.areaComparator);
        return res;
    }

    public Shape[] sortByColor(Shape[] arr){
        Shape[] res;
        res = Arrays.copyOf(arr, arr.length);
        Arrays.sort(res, Shape.colorComparator);
        return res;
    }

    //Нет задания по вычислению суммарной площади фигур заданного вида
    //Например, так (сравнение идет по классу фигуры)
    public double summaryAreaByType(Shape[] shapes, Class<? extends Shape> shapeType) {
        double summaryArea = 0;
        for (Shape shape: shapes) {
            if (shape.getClass().equals(shapeType)) {
                summaryArea += shape.calcArea();
            }
        }

        return summaryArea;
        /*
        return Arrays.stream(shapes).filter((Shape shape) -> shape.getClass().equals(shapeType)).
                mapToDouble(Shape::calcArea).sum();*/
    }
}
