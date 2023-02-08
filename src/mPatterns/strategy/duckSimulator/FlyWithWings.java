package mPatterns.strategy.duckSimulator;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with Wings");
    }
}
