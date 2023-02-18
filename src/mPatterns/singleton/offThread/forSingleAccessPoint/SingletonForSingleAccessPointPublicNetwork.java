package mPatterns.singleton.offThread.forSingleAccessPoint;

public class SingletonForSingleAccessPointPublicNetwork {
    SingletonForSingleAccessPointNetwork singletonNetwork;

    SingletonForSingleAccessPointPublicNetwork() {
        singletonNetwork = SingletonForSingleAccessPointNetwork.getInstance();
    }

    public void connectNetwork() {
        singletonNetwork.connectNetwork();
        System.out.println("Public network connected.");
    }
}
