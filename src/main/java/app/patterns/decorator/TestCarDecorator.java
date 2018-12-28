package app.patterns.decorator;

import app.core.carPlant.Car;
import app.patterns.abstractFactory.Context;

class TestCarDecorator {
    public static void main(String[] args) {

        Context factory = new Context();

        SportCar sportCar = new SportCar(new Car.Builder()
                .withBreakType(factory.getFactory("Tesla").createBreak())
                .bodyColor("Green")
                .hasAirCondition(true)
                .withGearType(factory.getFactory("Tesla").createGear())
                .withWheelType(factory.getFactory("Tesla").createWheel())
                .bodyHeight(175)
                .bodyWidth(350)
                .withMaxSpeed(175)
                .numberOfSeats(7)
                .build());

        System.out.println("\nDecorator for a car: " + sportCar.getCarType());
    }
}
