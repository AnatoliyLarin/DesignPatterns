package app.patterns.listener;

import app.core.carPlant.Car;

public interface CarListener {

    void onRelease(Car car);
}