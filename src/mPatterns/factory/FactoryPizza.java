package mPatterns.factory;

abstract class FactoryPizza {
    String name;
    FactoryCheese cheese;
    FactoryClams clams;
    FactoryDough dough;
    FactorySauce sauce;
    String[] veggies;

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal sizes");
    }

    public void box() {
        System.out.println("Place Pizza into the PizzaStore box");
    }

    public void setPizzaName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("--------").append(this.name).append("--------");
        if (cheese != null) {
            result.append(cheese);
            result.append("/n");
        }
        if (clams != null) {
            result.append(clams);
            result.append("/n");
        }
        if (dough != null) {
            result.append(dough);
            result.append("/n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("/n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("/n");
        }
        return result.toString();
    }
}
