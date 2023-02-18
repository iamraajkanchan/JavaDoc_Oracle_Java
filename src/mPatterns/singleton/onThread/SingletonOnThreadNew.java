package mPatterns.singleton.onThread;

public class SingletonOnThreadNew extends Thread {
    private final SingletonOnThreadNetwork singletonNetwork;
    public boolean isNetworkConnected = false;

    SingletonOnThreadNew(int pool) {
        singletonNetwork = SingletonOnThreadNetwork.getInstance(pool);
    }

    @Override
    public void run() {
        isNetworkConnected = singletonNetwork.connectNetwork();
    }
}
