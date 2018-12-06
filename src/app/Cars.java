package app;

import training.patterns.abstractfactory.interfaces.*;

public class Cars {

    private Gear gearType;
    private Wheel wheelType;
    private Break breakType;
    private int maxSpeed;
    private String color;
    private boolean hasAirCondition;
    private int numberOfSeats;
    private int width;
    private int height;

    public Cars(Gear gearType, Wheel wheelType, Break breakType, int maxSpeed, String color, boolean hasAirCondition, int numberOfSeats, int width, int height) {
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


    public void setGearType(Gear gearType) {
        this.gearType = gearType;
    }

    public void setWheelType(Wheel wheelType) {
        this.wheelType = wheelType;
    }

    public void setBreakType(Break breakType) {
        this.breakType = breakType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasAirCondition(boolean hasAirCondition) {
        this.hasAirCondition = hasAirCondition;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
