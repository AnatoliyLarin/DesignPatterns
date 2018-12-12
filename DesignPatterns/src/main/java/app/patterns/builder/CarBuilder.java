package app.patterns.builder;

import app.core.carPlant.interfaces.*;

public class CarBuilder {

    private Gear gearType;
    private Wheel wheelType;
    private Break breakType;
    private int maxSpeed;
    private String color;
    private boolean hasAirCondition;
    private int numberOfSeats;
    private int width;
    private int height;

    public CarBuilder withGearType(Gear gearType) {
        this.gearType = gearType;
        return this;
    }

    public CarBuilder withWheelType(Wheel wheelType) {
        this.wheelType = wheelType;
        return this;
    }

    public CarBuilder withBreakType(Break breakType) {
        this.breakType = breakType;
        return this;
    }

    public CarBuilder withMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
         return this;
    }

    public CarBuilder bodyColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder hasAirCondition(boolean hasAirCondition) {
        this.hasAirCondition = hasAirCondition;
        return this;
    }

    public CarBuilder numberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public CarBuilder bodyWidth(int width) {
        this.width = width;
        return this;
    }

    public CarBuilder bodyHeight(int height) {
        this.height = height;
        return this;
    }

//    public Car build() {
//        return new Car(gearType, wheelType, breakType, maxSpeed, color, hasAirCondition, numberOfSeats, width, height);
//    }
}