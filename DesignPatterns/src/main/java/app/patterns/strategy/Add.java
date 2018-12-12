package training.core.strategy;

public class Add implements Operations {

    @Override
    public float calculate(float num1, float num2) {
        return num1 + num2;
    }
}