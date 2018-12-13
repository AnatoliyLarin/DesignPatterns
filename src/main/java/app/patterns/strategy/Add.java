package app.patterns.strategy;

import app.core.operations.Operation;

public class Add implements Operation {

    @Override
    public float calculate(float num1, float num2) {
        return num1 + num2;
    }
}