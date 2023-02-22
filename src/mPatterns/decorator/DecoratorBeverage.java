package mPatterns.decorator;

abstract class DecoratorBeverage {
    protected String description = "Unknown description";

    public String getDescription() {
        return this.description;
    }

    abstract double cost();
}
