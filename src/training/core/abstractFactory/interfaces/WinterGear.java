package training.core.abstractFactory.interfaces;

public class WinterGear implements Gear {

    @Override
    public String run() {
        String autoPartName = "Winter Gear";
        return autoPartName;
    }
}
