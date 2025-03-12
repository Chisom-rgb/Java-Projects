/**
 * 
 */
package Lab4;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * P3Driver demonstrates filtering a list of numbers using lambda expressions
 * with Predicate functional interfaces, then printing the results using Consumer.
 * 
 * @author Chisomaga Acholonu
 */
public class P3Driver {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12, 256, 300, 301, 303, 17, 120);

        // Prime number filter
        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // Even number filter
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Multiples of 3 filter
        Predicate<Integer> isMultipleOf3 = n -> n % 3 == 0;

        // Consumer to print numbers
        Consumer<Integer> print = System.out::println;

        // Call PerformConditionally with different filters
        System.out.println("Prime numbers:");
        PerformConditionally(nums, isPrime, print);

        System.out.println("\nEven numbers:");
        PerformConditionally(nums, isEven, print);

        System.out.println("\nMultiples of 3:");
        PerformConditionally(nums, isMultipleOf3, print);
    }

    /**
     * Filters and prints numbers based on a given condition.
     * 
     * @param nums      the list of numbers to filter
     * @param filter    the condition to apply
     * @param consumer  the action to perform on filtered numbers
     */
    private static void PerformConditionally(List<Integer> nums, Predicate<Integer> filter, Consumer<Integer> consumer) {
        for (Integer i : nums) {
            if (filter.test(i)) {
                consumer.accept(i);
            }
        }
    }
}

