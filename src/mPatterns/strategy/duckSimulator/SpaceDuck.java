package mPatterns.strategy.duckSimulator;

public class SpaceDuck extends Duck {

    SpaceDuck() {
        flyBehavior = new FlyWithRocketSpeed();
        quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("I am a Space Duck");
    }
}
