package mPatterns.strategy.duckSimulator;

public class WoodenDuck extends Duck {

    WoodenDuck() {
        flyBehavior = new FlyNotAtAll();
        quackBehavior = new Mute();
    }

    @Override
    void display() {
        System.out.println("I am a Wooden Duck");
    }
}
