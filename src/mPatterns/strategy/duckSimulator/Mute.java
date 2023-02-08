package mPatterns.strategy.duckSimulator;

public class Mute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am mute");
    }
}
