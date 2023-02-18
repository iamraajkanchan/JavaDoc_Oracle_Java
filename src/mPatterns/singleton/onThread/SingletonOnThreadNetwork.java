package mPatterns.singleton.onThread;

public class SingletonOnThreadNetwork {
    private int pool;
    private volatile static SingletonOnThreadNetwork singletonNetwork;

    private SingletonOnThreadNetwork() {}

    public static SingletonOnThreadNetwork getInstance() {
        if (singletonNetwork == null) {
            synchronized (SingletonOnThreadNetwork.class) {
                if (singletonNetwork == null) {
                    singletonNetwork = new SingletonOnThreadNetwork();
                }
            }
        }
        return singletonNetwork;
    }

    public void connectNetwork() {
        System.out.println("Connecting Network...");
        System.out.println("Attempting to connect " + this.pool + "in few minutes...");
    }

    public void setPool(int pool) {
        this.pool = pool;
    }
}