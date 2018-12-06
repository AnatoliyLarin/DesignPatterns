import app.AssembleLine;
import app.Cars;
import training.patterns.abstractfactory.Context;
import training.patterns.builder.CarsBuilder;

public class TestCarsBuilder {

    public static void main(String[] args){

        CarsBuilder carsBuilder = new CarsBuilder();
        Context factory = new Context();

        Cars car = carsBuilder.setBreakType(factory.getFactory("Tesla").createBreak(("Soft")))
                .setColor("Green")
                .setHasAirCondition(true)
                .setGearType(factory.getFactory("Tesla").createGear(("Hard")))
                .setWheelType(factory.getFactory("Tesla").createWheel(("Winter")))
                .setHeight(175)
                .setWidth(350)
                .setMaxSpeed(175)
                .setNumberOfSeats(7)
                .build();

            System.out.println("Car's color: " + car.getColor() + "\n" + "Car's wheel type: " + car.getWheelType());
    }
}
