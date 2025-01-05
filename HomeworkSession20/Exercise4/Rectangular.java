package Exercise4;

public class Rectangular implements Shape {

    private double width;
    private double height;

    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * ( width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
