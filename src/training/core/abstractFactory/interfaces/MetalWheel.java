package training.core.abstractFactory.interfaces;

public class MetalWheel implements Wheel {

    @Override
    public String run(){
        String autoPartName = "Metal Wheel";
        return autoPartName;
    }
}
