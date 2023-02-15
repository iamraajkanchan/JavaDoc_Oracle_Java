package mPatterns.singleton;

public final class SingletonNetwork {
    private static SingletonNetwork uniqueInstance;
    private SingletonNetwork(){}

    public static SingletonNetwork getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonNetwork();
        }
        return uniqueInstance;
    }

    public boolean connectNetwork() {
        System.out.println("Connecting MPower Network");
        return true;
    }

}
