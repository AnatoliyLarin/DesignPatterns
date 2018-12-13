package app.patterns.strategy;

import app.core.operations.Operation;

public class Multiply implements Operation {

    @Override
    public float calculate(float num1, float num2) {
        return num1 * num2;
    }
}