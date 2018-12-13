package app.patterns.strategy;

import app.core.operations.Operation;

public class Extent implements Operation {

    @Override
    public float calculate(float num1, float num2) {
        return (float) Math.pow(num1, num2);
    }
}