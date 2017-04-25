
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GenericInterfaceTest1 {

    // Predicate Interface has one function test(), which tests boolean types
    public void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        
        for (Integer n: list) {
            
            // Run the boolean test on parameter n
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        
        GenericInterfaceTest1 test = new GenericInterfaceTest1();
        
        List<Integer> listToCheck = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Print all numbers in the list:");
        
        // Lambda function: set to true
        test.evaluate(listToCheck, n -> true);
        
        System.out.println();
        
        System.out.println("Print all the even numbers in the list:");
        
        // Lambda function: test that number can be devided by 0
        
        test.evaluate(listToCheck, n -> n%2 == 0);
        
        System.out.println();
        
        System.out.println("Print all the numbers greater than 3:");
               
        test.evaluate(listToCheck, n -> n > 3);
        
    }
    
}
