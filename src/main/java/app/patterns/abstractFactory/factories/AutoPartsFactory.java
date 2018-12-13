package app.patterns.abstractFactory.factories;

import app.core.carPlant.interfaces.*;

public interface AutoPartsFactory{

    Gear createGear();

    Break createBreak();

    Wheel createWheel();
}