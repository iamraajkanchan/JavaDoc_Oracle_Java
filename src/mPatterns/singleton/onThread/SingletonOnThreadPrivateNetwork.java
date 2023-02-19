package mPatterns.singleton.onThread;

public class SingletonOnThreadPrivateNetwork {
    private final SingletonOnThreadNew singletonThread;

    SingletonOnThreadPrivateNetwork(SingletonOnThreadNew singletonThread) {
        this.singletonThread = singletonThread;
    }

    public void connect() {
        singletonThread.start();
        try {
            if (singletonThread.getConnectedStatus()) {
                System.out.println("Private Network Connected");
            } else {
                System.out.println("There is some technical issue in Private Network, please try after sometime!");
            }
        } catch (InterruptedException ie) {
            ie.getStackTrace();
        }
    }
}
