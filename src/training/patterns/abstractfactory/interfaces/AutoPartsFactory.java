package training.patterns.abstractfactory.interfaces;

public interface AutoPartsFactory {

    public Gear createGear();

    public Break createBreak();

    public Wheel createWheel();
}
