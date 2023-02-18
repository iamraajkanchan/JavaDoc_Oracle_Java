package mPatterns.singleton.offThread.forMultipleAccessPoint;

public class SingletonPrivateNetworkObserver {
    private final SingletonForMultipleAccessPointNetwork singletonNetwork;

    SingletonPrivateNetworkObserver() {
        this.singletonNetwork = SingletonForMultipleAccessPointNetwork.getInstance();
    }

    public void connectPrivateNetwork() {
        if (singletonNetwork.connectNetwork()) {
            System.out.println("Private Network Connected");
        } else {
            System.out.println("There is some technical issue, please try after sometime.");
        }
    }
}
