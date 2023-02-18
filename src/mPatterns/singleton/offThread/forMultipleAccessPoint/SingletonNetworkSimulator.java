package mPatterns.singleton.offThread.forMultipleAccessPoint;

public class SingletonNetworkSimulator {
    public static void main(String[] a) {
        SingletonPrivateNetworkObserver privateNetwork = new SingletonPrivateNetworkObserver();
        SingletonPublicNetworkObserver publicNetwork = new SingletonPublicNetworkObserver();
        privateNetwork.connectPrivateNetwork();
        publicNetwork.connectPublicNetwork();
    }
}
