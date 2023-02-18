package mPatterns.singleton.onThread;

public class SingletonOnThreadNetwork {
    private volatile static SingletonOnThreadNetwork singletonNetwork;

    private SingletonOnThreadNetwork() {}

    public SingletonOnThreadNetwork getInstance() {
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
    }
}
