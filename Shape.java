/**
 * 
 */
package Lab4;

/**
 * Abstract class Shape representing a geometric shape with x and y coordinates.
 * 
 * @author Chisomaga Acholonu
 */
public abstract class Shape {
    protected double x, y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " at (" + x + ", " + y + ")";
    }
}

