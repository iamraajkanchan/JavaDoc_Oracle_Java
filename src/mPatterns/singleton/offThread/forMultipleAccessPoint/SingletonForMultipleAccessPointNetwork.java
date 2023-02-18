package mPatterns.singleton.offThread.forMultipleAccessPoint;

public class SingletonForMultipleAccessPointNetwork {
    private static SingletonForMultipleAccessPointNetwork uniqueInstance;
    private SingletonForMultipleAccessPointNetwork(){}

    public static SingletonForMultipleAccessPointNetwork getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonForMultipleAccessPointNetwork();
        }
        return uniqueInstance;
    }

    public boolean connectNetwork() {
        System.out.println("Connecting Network...");
        return true;
    }

}
