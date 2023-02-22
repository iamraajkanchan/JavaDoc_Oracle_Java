package mPatterns.decorator;

public class DecoratorCoffeeShopSimulator {
    public static void main(String[] a) {
        DecoratorBeverage myBeverage = new DecoratorMilk(new DecoratorWhip(new DecoratorEspresso()));
        System.out.println(myBeverage.getDescription());
        System.out.println(myBeverage.cost());
    }
}
