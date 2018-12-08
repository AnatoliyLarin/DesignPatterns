package training.core.strategy;

public class Multiply implements Operations {

    @Override
    public float calculate(float num1, float num2) {
        return num1 * num2;
    }
}