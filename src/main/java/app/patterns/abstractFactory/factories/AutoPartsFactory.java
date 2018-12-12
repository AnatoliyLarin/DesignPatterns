package app.patterns.abstractFactory.factories;

import app.core.carPlant.interfaces.*;

public interface AutoPartsFactory{

    Gear createGear(String gearType);

    Break createBreak(String breakType);

    Wheel createWheel(String wheelType);
}