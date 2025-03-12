/**
 * 
 */
package Lab4;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;

/**
 * P2Driver demonstrates sorting a list of Shape objects using lambda expressions
 * instead of Comparators, and iterating using the forEach method.
 * 
 * @author Chisomaga Acholonu
 */
public class P2Driver {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Circle(3.0, 1.0, 2.0));
        shapesList.add(new Rectangle(4.0, 5.0, 0.0, 0.0));
        shapesList.add(new Circle(5.0, 3.0, 1.0));
        shapesList.add(new Rectangle(2.0, 3.0, 5.0, 4.0));

        // Sort by x position using lambda expression
        shapesList.sort((s1, s2) -> Double.compare(s1.getX(), s2.getX()));

        System.out.println("Shapes sorted by x-position:");
        shapesList.forEach(System.out::println);

        // Sort by perimeter using lambda expression
        shapesList.sort((s1, s2) -> Double.compare(s1.getPerimeter(), s2.getPerimeter()));

        System.out.println("\nShapes sorted by perimeter:");
        shapesList.forEach(System.out::println);
    }
}


