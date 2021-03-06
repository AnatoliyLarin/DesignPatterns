package app.core.carPlant;


import app.core.carPlant.interfaces.BaseCar;
import app.core.carPlant.interfaces.Break;
import app.core.carPlant.interfaces.Gear;
import app.core.carPlant.interfaces.Wheel;
import app.patterns.visitor.Visitable;
import app.patterns.visitor.Visitor;

public class Car implements Visitable, BaseCar {

    private Gear gearType;
    private Wheel wheelType;
    private Break breakType;
    private int maxSpeed;
    private String color;
    private boolean hasAirCondition;
    private int numberOfSeats;
    private int width;
    private int height;

    private Car(Builder carToBuild){
        this.gearType = carToBuild.gearType;
        this.wheelType = carToBuild.wheelType;
        this.breakType = carToBuild.breakType;
        this.maxSpeed = carToBuild.maxSpeed;
        this.color = carToBuild.color;
        this.hasAirCondition = carToBuild.hasAirCondition;
        this.numberOfSeats = carToBuild.numberOfSeats;
        this.width = carToBuild.width;
        this.height = carToBuild.height;
    }

    //General methods

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getCarType(){
        String carType = "Concrete car class";
        System.out.println("Base car");
        return carType;
    }

    public static class Builder{
        private Gear gearType;
        private Wheel wheelType;
        private Break breakType;
        private int maxSpeed;
        private String color;
        private boolean hasAirCondition;
        private int numberOfSeats;
        private int width;
        private int height;

        public Builder withGearType(Gear gearType) {
            this.gearType = gearType;
            return this;
        }

        public Builder withWheelType(Wheel wheelType) {
            this.wheelType = wheelType;
            return this;
        }

        public Builder withBreakType(Break breakType) {
            this.breakType = breakType;
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder bodyColor(String color) {
            this.color = color;
            return this;
        }

        public Builder hasAirCondition(boolean hasAirCondition) {
            this.hasAirCondition = hasAirCondition;
            return this;
        }

        public Builder numberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder bodyWidth(int width) {
            this.width = width;
            return this;
        }

        public Builder bodyHeight(int height) {
            this.height = height;
            return this;
        }

        public Car build(){
           return new Car(this);
        }
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
}