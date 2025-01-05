//Create a class ShapeContainer<T> that stores shapes like Circle and Rectangle.
//Use wildcards to filter shapes or add multiple shapes from a list.

package Exercise4;


import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T extends Shape> {

    private List<T> shapes;

    public ShapeContainer() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(T shape) {
        shapes.add(shape);
    }

    public void addShapes(List<? extends Shape> newShapes) {
        for (Shape shape : newShapes) {
            shapes.add((T) shape);
        }

    }

    public void displayShapes() {
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName()
                    + " -Area: " + shape.area()
                    + " -Perimeter: " + shape.perimeter());


        }
    }

}
