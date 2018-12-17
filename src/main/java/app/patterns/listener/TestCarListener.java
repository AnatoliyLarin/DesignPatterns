package app.patterns.listener;

import app.core.carPlant.Car;
import app.patterns.abstractFactory.Context;

public class TestCarListener {

    public static void main(String[] args){

        CarSizeListener carSizeListener = new CarSizeListener();
        CarTestListener carTestListener = new CarTestListener();

        Context order = new Context();

        Car.Builder car1 = new Car.Builder().
                withBreakType(order.getFactory("Tesla").createBreak())
                .withGearType(order.getFactory("Tesla").createGear())
                .withWheelType(order.getFactory("Tesla").createWheel())
                .bodyColor("Green")
                .numberOfSeats(7)
                .withMaxSpeed(175)
                .bodyHeight(175)
                .bodyWidth(350);
    }
}

