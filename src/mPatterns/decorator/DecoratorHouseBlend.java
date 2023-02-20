package mPatterns.decorator;

public class DecoratorHouseBlend extends DecoratorBeverage {

    DecoratorHouseBlend() {
        super.description = "House Blend Coffee";
    }

    @Override
    double cost() {
        return 12.99;
    }
}
