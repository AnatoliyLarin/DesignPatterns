public class Extent implements Operations {

    @Override
    public float calculate(float num1, float num2) {
        float result = (float) Math.pow(num1, num2);
        return result;
    }
}