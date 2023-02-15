package mPatterns.singleton;

public class SingletonPublicNetworkObserver {
    private final SingletonNetwork singletonNetwork;

    SingletonPublicNetworkObserver() {
        this.singletonNetwork = SingletonNetwork.getInstance();
    }

    public void connectPublicNetwork() {
        if (singletonNetwork.connectNetwork()) {
            System.out.println("Public Network Connected");
        } else {
            System.out.println("There is some technical issue, please try after sometime.");
        }
    }
}
