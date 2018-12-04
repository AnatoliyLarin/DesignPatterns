package training.patterns.abstractfactory.factory;

import training.patterns.abstractfactory.interfaces.Break;
import training.patterns.abstractfactory.interfaces.Gear;
import training.patterns.abstractfactory.interfaces.Wheel;

public interface AutoPartsFactory {

    public Gear createGear();

    public Break createBreak();

    public Wheel createWheel();
}
