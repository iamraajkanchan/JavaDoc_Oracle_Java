package mPatterns.factory;

public class FactorySimplePizzaFactory {
    public FactoryPizza createPizza(String type) {
        FactoryChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new FactoryChicagoPizzaIngredientFactory();
        FactoryPizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new FactoryCheesePizza(chicagoPizzaIngredientFactory);
        }
        return pizza;
    }
}
