package training.patterns.abstractfactory.interfaces;

public class SummerGear implements Gear {

    @Override
    public String run(){
        String autoPartName = "Summer Gear";
        return autoPartName;
    }
}
