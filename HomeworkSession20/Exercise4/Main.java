package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4.8);
        Circle newCircle = new Circle(7.5);
        Rectangular rectangle = new Rectangular(12.5, 5.20);
        Rectangular newRectangle = new Rectangular(5.5, 2.7);
        

        ShapeContainer<Circle> circleShapeContainer = new ShapeContainer<>();
        circleShapeContainer.addShape(circle);
        circleShapeContainer.addShape(newCircle);

        ShapeContainer<Rectangular> rectangularShapeContainer = new ShapeContainer<>();
        rectangularShapeContainer.addShape(rectangle);
        rectangularShapeContainer.addShape(newRectangle);

        List<Shape> mixedShapes = new ArrayList<>();
        mixedShapes.add(circle);
        mixedShapes.add(rectangle);
        mixedShapes.add(newCircle);

        ShapeContainer<Shape> mixedContainer = new ShapeContainer<>();
        mixedContainer.addShapes(mixedShapes);

        System.out.println("Cricle container: ");
        circleShapeContainer.displayShapes();

        System.out.println("Rectangular container: ");
        rectangularShapeContainer.displayShapes();

        System.out.println("Mixed shapes container: ");
        mixedContainer.displayShapes();







    }
}
