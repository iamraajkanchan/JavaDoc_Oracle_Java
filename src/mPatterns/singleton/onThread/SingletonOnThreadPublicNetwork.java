package mPatterns.singleton.onThread;

public class SingletonOnThreadPublicNetwork {

    private final SingletonOnThreadNew singletonThread;

    SingletonOnThreadPublicNetwork(SingletonOnThreadNew singletonThread) {
        this.singletonThread = singletonThread;
    }

    public void connect() {
        singletonThread.start();
        if (singletonThread.isNetworkConnected) {
            System.out.println("Public Network Connected");
        } else {
            System.out.println("There is some technical issue in Public Network, please try after sometime!");
        }
    }
}
