package training.patterns.factory;

public class Multiply implements Operations {

    @Override
    public float calculate(float num1, float num2) {
        float result = num1 * num2;
        return result;
    }
}