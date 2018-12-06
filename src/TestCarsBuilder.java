import app.AssembleLine;
import app.Cars;
import training.patterns.abstractfactory.Context;
import training.patterns.builder.CarsBuilder;

public class TestCarsBuilder {

    public static void main(String[] args){

        CarsBuilder carsBuilder = new CarsBuilder();
        AssembleLine produce = new AssembleLine();
        Context factory = new Context();

        Cars car = carsBuilder.setBreakType(factory.getFactory("Tesla").createBreak(("Soft")));
    }
}
