package mPatterns.factory;

public class FactoryChicagoPizzaIngredientFactory implements FactoryPizzaIngredientFactory{
    @Override
    public FactoryCheese createCheese() {
        return null;
    }

    @Override
    public FactoryClams createClams() {
        return null;
    }

    @Override
    public FactoryDough createDough() {
        return null;
    }

    @Override
    public FactorySauce createSauce() {
        return null;
    }

    @Override
    public String[] createVeggies() {
        return new String[0];
    }
}
