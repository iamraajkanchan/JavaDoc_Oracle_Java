package mPatterns.strategy.duckSimulator;

public class FlyNotAtAll implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I couldn't fly");
    }
}
