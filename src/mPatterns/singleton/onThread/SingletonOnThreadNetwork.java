package mPatterns.singleton.onThread;

public class SingletonOnThreadNetwork {
    private final int pool;
    private volatile static SingletonOnThreadNetwork singletonNetwork;

    private SingletonOnThreadNetwork(int pool) {
        this.pool = pool;
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

    public void connectNetwork() {
        System.out.println("Connecting Network...");
        System.out.println("Attempting to connect " + this.pool + "in few minutes...");
    }

}
