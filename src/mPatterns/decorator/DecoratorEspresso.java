package mPatterns.decorator;

public class DecoratorEspresso extends DecoratorBeverage {

    DecoratorEspresso() {
        super.description = "Espresso";
    }

    @Override
    double cost() {
        return 5.66;
    }
}
