package mPatterns.decorator;

public class DecoratorMilk extends CondimentDecorator {
    private final DecoratorBeverage beverage;

    DecoratorMilk(DecoratorBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + 8.34;
    }

    @Override
    String getDescription() {
        return beverage.description + ", Milk";
    }
}
