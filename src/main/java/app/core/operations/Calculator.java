package app.core.operations;

public class Calculator {

    private Operation operation;

    public Calculator(Operation operation){
        this.operation = operation;
    }

    public float execute(float num1, float num2) {
        return operation.calculate(num1, num2);
    }
}