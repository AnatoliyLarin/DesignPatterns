package training.core.abstractFactory.interfaces;

public class SoftBreak implements Break {

    @Override
    public String stop(){
        String autoPartName = "Soft Break";
        return autoPartName;
    }
}
