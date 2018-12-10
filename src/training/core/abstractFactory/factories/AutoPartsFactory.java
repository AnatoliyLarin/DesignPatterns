package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

public interface AutoPartsFactory{

    createGear(String gearType);

    createBreak(String breakType);

    createWheel(String wheelType);
}
