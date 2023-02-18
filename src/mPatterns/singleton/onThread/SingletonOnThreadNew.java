package mPatterns.singleton.onThread;

public class SingletonOnThreadNew extends Thread {
    private final SingletonOnThreadNetwork singletonNetwork;

    SingletonOnThreadNew() {
        singletonNetwork = SingletonOnThreadNetwork.getInstance();
    }

    @Override
    public void run() {
        singletonNetwork.connectNetwork();
    }
}
