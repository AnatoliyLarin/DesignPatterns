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
}
