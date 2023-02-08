package mPatterns.strategy.duckSimulator;

public class DuckSimulator {
    public static void main(String[] a) {
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        ZooDuck zooDuck = new ZooDuck();
        zooDuck.display();
        zooDuck.performFly();
        zooDuck.performQuack();
        System.out.println("Updating the sound of Zoo Duck");
        zooDuck.updateQuackBehavior(new Quack());
        zooDuck.performQuack();
        SpaceDuck spaceDuck = new SpaceDuck();
        spaceDuck.display();
        spaceDuck.performFly();
        spaceDuck.performQuack();
    }
}
