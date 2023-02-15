package mPatterns.singleton;

public class SingletonPrivateNetworkObserver {
    private final SingletonNetwork singletonNetwork;

    SingletonPrivateNetworkObserver() {
        this.singletonNetwork = SingletonNetwork.getInstance();
    }

    public void connectPrivateNetwork() {
        if (singletonNetwork.connectNetwork()) {
            System.out.println("Private Network Connected");
        } else {
            System.out.println("There is some technical issue, please try after sometime.");
        }
    }
}
