package training.patterns.abstractfactory.interfaces;

public class MetalWheel implements Wheel {

    @Override
    public String run(){
        String autoPartName = "MetalWheel";
        return autoPartName;
    }
}
