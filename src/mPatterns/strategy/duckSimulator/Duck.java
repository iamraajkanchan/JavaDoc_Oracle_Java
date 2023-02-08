package mPatterns.strategy.duckSimulator;

abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim on water!!!");
    }

    public void updateFlyBehavior(FlyBehavior updatedFlyBehavior) {
        this.flyBehavior = updatedFlyBehavior;
    }

    public void updateQuackBehavior(QuackBehavior updatedQuackBehavior) {
        this.quackBehavior = updatedQuackBehavior;
    }

    abstract void display();
}
