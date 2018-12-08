package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

public interface AutoPartsFactory {

    public Gear createGear(String gearType);

    public Break createBreak(String breakType);

    public Wheel createWheel(String wheelType);
}
