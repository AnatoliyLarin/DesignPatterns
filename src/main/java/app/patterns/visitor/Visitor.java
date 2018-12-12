package app.patterns.visitor;

import app.core.carPlant.Car;

public interface Visitor {

    void visit(Car carForTest);
}