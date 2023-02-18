package mPatterns.singleton.offThread.forSingleAccessPoint;

public final class SingletonForSingleAccessPointNetwork {
    private final static SingletonForSingleAccessPointNetwork singletonNetwork = new SingletonForSingleAccessPointNetwork();

    private SingletonForSingleAccessPointNetwork() {
    }

    public static SingletonForSingleAccessPointNetwork getInstance() {
        return singletonNetwork;
    }

    public boolean connectNetwork() {
        System.out.println("Connecting Network...");
        return true;
    }
}
