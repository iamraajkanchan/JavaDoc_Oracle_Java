package mPatterns.strategy.duckSimulator;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I squeak");
    }
}
