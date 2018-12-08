import app.*;
import training.core.strategy.*;

public class TestCalculatorStrategy{
    public static void main(String[] args) {

        Calculator calc1 = new Calculator(new Add());
        float result1 = calc1.execute(7,3);

        System.out.println("Calculation result - add: " + result1);

        Calculator calc2 = new Calculator(new Multiply());
        float result2 = calc2.execute(7,7);

        System.out.println("Calculation result - multiply: " + result2);

        Calculator calc3 = new Calculator(new Extent());
        float result3 = calc3.execute(4,5);

        System.out.println("Calculation result - extent: " + result3);
    }
}