package training.core.visitor;

import java.app.core.carPlant.Car;

public interface Visitor {

    void visit(Car carForTest);
}
