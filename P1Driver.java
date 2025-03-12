/**
 * 
 */
package Lab4;

/**
 * @author Chisomaga Acholonu
 * @version Eclipse 
 * 
 */


import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class P1Driver {
    public static void main(String[] args) {
        // Lambda expressions for custom functional interface
        MyFunction greet = msg -> System.out.println("Greeting: " + msg);
        MyFunction shout = msg -> System.out.println("Shouting: " + msg.toUpperCase());

        // Using Consumer and BiConsumer
        Consumer<String> consumer = msg -> System.out.println("Consumer: " + msg);
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " & " + b);

        // Calling method
        foo(greet, "Hello");
        foo(shout, "hello");

        // Using Consumer
        consumer.accept("This is an example");

        // Using BiConsumer
        biConsumer.accept("Hello", "World");
    }

    /**
     * Executes a given MyFunction lambda expression with a message.
     * 
     * @param func    the functional interface implementation
     * @param message the message to be processed
     */
    static void foo(MyFunction func, String message) {
        func.execute(message);
    }
}

