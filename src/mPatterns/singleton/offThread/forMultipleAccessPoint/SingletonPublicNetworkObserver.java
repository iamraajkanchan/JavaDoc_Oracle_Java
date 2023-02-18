package mPatterns.singleton.offThread.forMultipleAccessPoint;

public class SingletonPublicNetworkObserver {
    private final SingletonForMultipleAccessPointNetwork singletonNetwork;

    SingletonPublicNetworkObserver() {
        this.singletonNetwork = SingletonForMultipleAccessPointNetwork.getInstance();
    }

    public void connectPublicNetwork() {
        if (singletonNetwork.connectNetwork()) {
            System.out.println("Public Network Connected");
        } else {
            System.out.println("There is some technical issue, please try after sometime.");
        }
    }
}
