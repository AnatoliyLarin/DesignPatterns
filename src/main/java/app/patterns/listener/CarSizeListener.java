package app.patterns.listener;

import app.core.carPlant.Car;

public class CarSizeListener implements CarListener {

    @Override
    public void onRelease(Car car) {
        System.out.println("----------------------------------");
        System.out.println("Listener - CarSizeListener");
        System.out.println("----------------------------------");
        System.out.println("Car's height: " + car.getHeight());
        System.out.println("Car's width: " + car.getWidth());
    }
}