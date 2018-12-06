package training.patterns.builder;

import app.Cars;
import training.patterns.abstractfactory.interfaces.*;

public class CarsBuilder {

    private Gear gearType;
    private Wheel wheelType;
    private Break breakType;
    private int maxSpeed;
    private String color;
    private boolean hasAirCondition;
    private int numberOfSeats;
    private int width;
    private int height;

    public CarsBuilder setGearType(Gear gearType) {
        this.gearType = gearType;
        return this;
    }

    public CarsBuilder setWheelType(Wheel wheelType) {
        this.wheelType = wheelType;
        return this;
    }

    public CarsBuilder setBreakType(Break breakType) {
        this.breakType = breakType;
        return this;
    }

    public CarsBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
         return this;
    }

    public CarsBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarsBuilder setHasAirCondition(boolean hasAirCondition) {
        this.hasAirCondition = hasAirCondition;
        return this;
    }

    public CarsBuilder setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public CarsBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public CarsBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public Cars build(){
        return new Cars();
    }
}
