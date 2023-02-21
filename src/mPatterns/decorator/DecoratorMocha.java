package mPatterns.decorator;

public class DecoratorMocha extends CondimentDecorator {

    private final DecoratorBeverage beverage;

    DecoratorMocha(DecoratorBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Mocha";
    }

    @Override
    double cost() {
        return beverage.cost() + 6.50;
    }
}
