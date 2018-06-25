package OOPPart.Shapes.view;

import OOPPart.Shapes.controller.ShapeController;
import OOPPart.Shapes.model.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeController sh = new ShapeController();

        Shape[] inArr = sh.initArray();

        sh.showData(inArr);

        System.out.println(sh.summaryArea(inArr));

        sh.showData(sh.sortByArea(inArr));

        sh.showData(sh.sortByColor(inArr));


    }
}
