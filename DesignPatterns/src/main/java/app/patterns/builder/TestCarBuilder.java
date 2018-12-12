package java.core.training.builder;

import java.app.core.carPlant.Car;
import training.core.abstractFactory.Context;

public class TestCarBuilder {

    public static void main(String[] args){

        Context factory = new Context();

        Car car = new Car.Builder()
                .withBreakType(factory.getFactory("Tesla").createBreak(("Soft")))
                .bodyColor("Green")
                .hasAirCondition(true)
                .withGearType(factory.getFactory("Tesla").createGear(("Winter")))
                .withWheelType(factory.getFactory("Tesla").createWheel(("Metal")))
                .bodyHeight(175)
                .bodyWidth(350)
                .withMaxSpeed(175)
                .numberOfSeats(7)
                .build();

        System.out.println("\nOrdered car's info\n");
        System.out.println("Gear type: " + car.getGearType().run() + "\n" + "Wheel type: " + car.getWheelType().run());
        System.out.println("Break type: " + car.getBreakType().stop() + "\n" + "Color: " + car.getColor());
        System.out.println("Seats number: " + car.getNumberOfSeats() + "\n" + "Conditioning: " + car.isHasAirCondition());
        System.out.println("Max speed: " + car.getMaxSpeed() + "\n" + "Body's width/height: " + car.getWidth() + "/" + car.getHeight());
    }
}