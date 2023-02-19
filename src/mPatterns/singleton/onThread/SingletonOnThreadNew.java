package mPatterns.singleton.onThread;

public class SingletonOnThreadNew extends Thread {
    private final SingletonOnThreadNetwork singletonNetwork;
    private volatile boolean isNetworkConnected = false;

    SingletonOnThreadNew(int pool) {
        singletonNetwork = SingletonOnThreadNetwork.getInstance(pool);
    }

    @Override
    public void run() {
        isNetworkConnected = singletonNetwork.connectNetwork();
    }

    public boolean getConnectedStatus() throws InterruptedException {
        synchronized (this) {
            wait();
        }
        return isNetworkConnected;
    }
}
