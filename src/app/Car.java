package app;

import training.patterns.abstractfactory.interfaces.*;
import training.patterns.builder.CarBuilder;

public class Car {

    //private CarBuilder carBuilder;

    private Gear gearType;
    private Wheel wheelType;
    private Break breakType;
    private int maxSpeed;
    private String color;
    private boolean hasAirCondition;
    private int numberOfSeats;
    private int width;
    private int height;

    public Car(Gear gearType, Wheel wheelType, Break breakType, int maxSpeed, String color, boolean hasAirCondition, int numberOfSeats, int width, int height) {
        this.gearType = gearType;
        this.wheelType = wheelType;
        this.breakType = breakType;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.hasAirCondition = hasAirCondition;
        this.numberOfSeats = numberOfSeats;
        this.width = width;
        this.height = height;
    }

    //Getters

    public Gear getGearType() {
        return gearType;
    }

    public Wheel getWheelType() {
        return wheelType;
    }

    public Break getBreakType() {
        return breakType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasAirCondition() {
        return hasAirCondition;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Setters

    public void withGearType(Gear gearType) {
        this.gearType = gearType;
    }

    public void withWheelType(Wheel wheelType) {
        this.wheelType = wheelType;
    }

    public void withBreakType(Break breakType) {
        this.breakType = breakType;
    }

    public void withMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void bodyColor(String color) {
        this.color = color;
    }

    public void hasAirCondition(boolean hasAirCondition) {
        this.hasAirCondition = hasAirCondition;
    }

    public void numberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void bodyWidth(int width) {
        this.width = width;
    }

    public void bodyHeight(int height) {
        this.height = height;
    }
}