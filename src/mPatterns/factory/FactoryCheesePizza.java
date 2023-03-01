package mPatterns.factory;

public class FactoryCheesePizza extends FactoryPizza{

    FactoryPizzaIngredientFactory pizzaIngredientFactory;

    FactoryCheesePizza(FactoryPizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {

    }
}
