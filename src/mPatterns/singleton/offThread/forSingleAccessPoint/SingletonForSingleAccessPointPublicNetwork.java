package mPatterns.singleton.offThread.forSingleAccessPoint;

public class SingletonForSingleAccessPointPublicNetwork {
    SingletonForSingleAccessPointNetwork singletonNetwork;

    SingletonForSingleAccessPointPublicNetwork() {
        singletonNetwork = SingletonForSingleAccessPointNetwork.getInstance();
    }

    public void connect() {
        if (singletonNetwork.connectNetwork()) {
            System.out.println("Public network connected.");
        } else {
            System.out.println("There is some technical error, please try after sometime!");
        }
    }
}
