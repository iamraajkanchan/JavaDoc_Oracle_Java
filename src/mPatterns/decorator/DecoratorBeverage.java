package mPatterns.decorator;

abstract class DecoratorBeverage {
    public String description = "Unknown description";

    private String getDescription() {
        return this.description;
    }

    abstract double cost();
}
