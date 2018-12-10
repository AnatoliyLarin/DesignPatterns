package app;

import training.core.strategy.Operations;

public class Calculator {

    private Operations operand;

    public Calculator(Operations chosenOperation){
        this.operand = chosenOperation;
    }

    public float execute(float num1, float num2) {
        return operand.calculate(num1, num2);
    }
}
