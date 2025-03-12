/**
 * 
 */
package Lab4;

/**
 * Circle class extending Shape with a radius and perimeter calculation.
 * 
 * @author Chisomaga Acholonu
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}

