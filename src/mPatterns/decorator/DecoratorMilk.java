package mPatterns.decorator;

public class DecoratorMilk extends CondimentDecorator {
    private final DecoratorBeverage beverage;

    DecoratorMilk(DecoratorBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    double cost() {
        return beverage.cost() + 8.34;
    }
}
