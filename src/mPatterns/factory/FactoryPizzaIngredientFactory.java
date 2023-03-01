package mPatterns.factory;

public interface FactoryPizzaIngredientFactory {
    public FactoryCheese createCheese();

    public FactoryClams createClams();

    public FactoryDough createDough();

    public FactorySauce createSauce();

    public String[] createVeggies();
}
