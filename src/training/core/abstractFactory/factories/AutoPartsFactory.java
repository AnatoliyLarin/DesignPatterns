package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

public interface AutoPartsFactory {

    Gear createGear(String gearType);

    Break createBreak(String breakType);

    Wheel createWheel(String wheelType);
}
