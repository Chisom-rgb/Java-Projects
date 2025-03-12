/**
 * 
 */
package Lab4;

/**
 * Rectangle class extending Shape with width, height, and perimeter calculation.
 * 
 * @author Chisomaga Acholonu
 */
public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height, double x, double y) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + " with width " + width + " and height " + height;
    }
}

