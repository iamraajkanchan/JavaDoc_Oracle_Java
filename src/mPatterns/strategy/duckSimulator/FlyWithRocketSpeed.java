package mPatterns.strategy.duckSimulator;

public class FlyWithRocketSpeed implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with Rocket Speed");
    }
}
