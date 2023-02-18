package mPatterns.singleton.onThread;

public class SingletonOnThreadNetwork {
    private static SingletonOnThreadNetwork singletonNetwork;

    public SingletonOnThreadNetwork getInstance() {
        if (singletonNetwork == null) {
            singletonNetwork = new SingletonOnThreadNetwork();
        }
        return singletonNetwork;
    }

    public void connectNetwork() {
        System.out.println("Connecting Network...");
    }
}
