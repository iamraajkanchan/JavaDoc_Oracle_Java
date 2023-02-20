package mPatterns.decorator;

public class DecoratorSoy extends CondimentDecorator {

    private final DecoratorBeverage beverage;

    DecoratorSoy(DecoratorBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.description + ", Soy";
    }

    @Override
    double cost() {
        return beverage.cost() + 4.25;
    }
}
