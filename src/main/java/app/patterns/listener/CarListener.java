package app.patterns.listener;

import app.core.carPlant.Car;

public interface CarListener {

    Car onRelease(Car car);
}