import app.Calculator;
import training.patterns.factory.*;

public class TestCalculatorFactory {
    public static void main(String[] args){

        OperationsFactory operationsList  = new OperationsFactory();

        Calculator calc1 = new Calculator(operationsList.createOperation("Add"));
        float result1= calc1.execute(2,7);

        System.out.println("Calculation result - add: " + result1);

        Calculator calc2 = new Calculator(operationsList.createOperation("Multiply"));
        float result2= calc2.execute(2,7);

        System.out.println("Calculation result - multiply: " + result2);

        Calculator calc3 = new Calculator(operationsList.createOperation("Extent"));
        float result3 = calc3.execute(2,3);

        System.out.println("Calculation result - extent: " + result3);
    }
}