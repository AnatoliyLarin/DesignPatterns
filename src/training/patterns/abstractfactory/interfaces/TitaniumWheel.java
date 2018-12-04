package training.patterns.abstractfactory.interfaces;

public class TitaniumWheel implements Wheel {

    @Override
    public String run(){
        String autoPartName = "TitaniumWheel";
        return autoPartName;
    }
}
