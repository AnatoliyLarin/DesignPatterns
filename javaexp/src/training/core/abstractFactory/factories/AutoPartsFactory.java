package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

public interface AutoPartsFactory{

    Gear createGear();

    Break createBreak();

    Wheel createWheel();
}
