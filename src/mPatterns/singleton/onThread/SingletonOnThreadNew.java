package mPatterns.singleton.onThread;

public class SingletonOnThreadNew extends Thread {
    private final SingletonOnThreadNetwork singletonNetwork;

    SingletonOnThreadNew(int pool) {
        singletonNetwork = SingletonOnThreadNetwork.getInstance(pool);
    }

    @Override
    public void run() {
        singletonNetwork.connectNetwork();
    }
}
