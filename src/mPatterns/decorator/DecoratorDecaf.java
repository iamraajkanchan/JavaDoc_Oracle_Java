package mPatterns.decorator;

public class DecoratorDecaf extends DecoratorBeverage {

    DecoratorDecaf() {
        super.description = "Decaf";
    }

    @Override
    double cost() {
        return 3.23;
    }
}
