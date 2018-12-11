package training.core.abstractFactory.interfaces;

public class HardBreak implements Break {

    @Override
    public String stop(){
        String autoPartName = "Hard Break";
        return autoPartName;
    };
}
