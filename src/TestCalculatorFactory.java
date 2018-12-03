import app.Calculator;
import training.patterns.factory.*;
import training.patterns.strategy.Operations;

public class TestCalculatorFactory {
    public static void main(String[] args){

        OperationsFactory getOperation  = new OperationsFactory();

        Calculator calc1 = getOperation.createOperation("Add");
        ((Operations) calc1).calculate(2,2);
    }
}
