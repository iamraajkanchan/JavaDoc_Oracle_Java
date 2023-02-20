package mPatterns.decorator;

public class DecoratorDarkRoast extends DecoratorBeverage {

    DecoratorDarkRoast() {
        super.description = "Dark Roast";
    }

    @Override
    double cost() {
        return 8.45;
    }
}
