
import java.util.function.DoubleBinaryOperator;

public class GenericInterfacesTest3 {

    public double calculate(double a, double b, DoubleBinaryOperator dbo) {
        
        return dbo.applyAsDouble(a, b);
        
    }
    
    public static void main(String[] args) {
        
        GenericInterfacesTest3 calculation = new GenericInterfacesTest3();
        
        int x = 15;
        int y = 4;
        
        System.out.println(calculation.calculate(x, y, (a, b) -> a / b));
        
    }
}
