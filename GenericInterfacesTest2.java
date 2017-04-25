import java.util.function.BiFunction;

public class GenericInterfacesTest2 {

            // The functional interface BiFunction has the method "apply"
            // which takes in 2 arguments and returns a 3rd one.
    public String calc(int a, int b, BiFunction<Integer, Integer, String> bf) {
        
        return bf.apply(a, b);
    }
    
    public static void main(String[] args) {
        
        GenericInterfacesTest2 test = new GenericInterfacesTest2();
        
            String result;
            int x = 3;
            int y = 5;
            
            // BiFunction takes in int x and int y
            // The String output transforms the (x, y) into -> .....
            result = test.calc(x, y, (a, b) -> a + "*" + b + " = " + (a * b));
            
            // Results in a String as output
            System.out.println(result);
            
            result = test.calc(x, y, (a, b) -> ":" + (a + b));
            
            System.out.println(result);
    }
}
