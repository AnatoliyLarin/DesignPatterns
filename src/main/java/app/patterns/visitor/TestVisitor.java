package app.patterns.visitor;

public class TestVisitor {

    public static void main(String[] args){

        Visitor testColor = new CarColorTester();
        Visitor testMaxSpeed = new CarMaxSpeedTester();
    }
}