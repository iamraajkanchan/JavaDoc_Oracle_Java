package mPatterns.singleton.onThread;

public class SingletonOnThreadNetwork {
    private final int pool;
    private volatile static SingletonOnThreadNetwork singletonNetwork;

    private SingletonOnThreadNetwork(int pool) {
        this.pool = pool; // Note: A constructor cannot access the static properties of its class.
    }

    public static SingletonOnThreadNetwork getInstance(int pool) {
        if (singletonNetwork == null) {
            synchronized (SingletonOnThreadNetwork.class) {
                if (singletonNetwork == null) {
                    singletonNetwork = new SingletonOnThreadNetwork(pool);
                }
            }
        }
        return singletonNetwork;
    }

    public boolean connectNetwork() {
        System.out.println("Connecting Network...");
        System.out.println("Attempting to connect " + this.pool + " pools in few minutes...");
        return true;
    }

}
