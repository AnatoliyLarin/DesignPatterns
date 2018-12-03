package training.patterns.strategy;

public class Extent implements Operations {

    @Override
    public float calculate(float num1, float num2) {
        return (float) Math.pow(num1, num2);
    }
}