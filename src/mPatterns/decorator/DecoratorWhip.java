package mPatterns.decorator;

public class DecoratorWhip extends CondimentDecorator {

    private final DecoratorBeverage beverage;

    DecoratorWhip(DecoratorBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    double cost() {
        return beverage.cost() + 9.55;
    }
}
