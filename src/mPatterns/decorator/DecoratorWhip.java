package mPatterns.decorator;

public class DecoratorWhip extends CondimentDecorator {

    private final DecoratorBeverage beverage;

    DecoratorWhip(DecoratorBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.description + ", Whip";
    }

    @Override
    double cost() {
        return beverage.cost() + 9.55;
    }
}
