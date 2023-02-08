package mPatterns.strategy.duckSimulator;

public class ZooDuck extends Duck {

    ZooDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I am Zoo duck");
    }
}
