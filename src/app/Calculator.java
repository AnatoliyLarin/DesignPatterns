package app;

import training.core.strategy.Operations;

public class Calculator {

    private Operations operand;

    public Calculator(Operations choosenOperation){
        this.operand = choosenOperation;
    }

    public float execute(float num1, float num2) {
        return operand.calculate(num1, num2);
    }
}
