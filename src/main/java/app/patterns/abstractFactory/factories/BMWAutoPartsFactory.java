package app.patterns.abstractFactory.factories;

import app.core.carPlant.interfaces.*;

public class BMWAutoPartsFactory implements AutoPartsFactory {

    @Override
    public Gear createGear() {
        return new WinterGear();
    }

    @Override
    public Break createBreak() {
        return new HardBreak();
    }

    @Override
    public Wheel createWheel() {
        return new TitaniumWheel();
    }
}