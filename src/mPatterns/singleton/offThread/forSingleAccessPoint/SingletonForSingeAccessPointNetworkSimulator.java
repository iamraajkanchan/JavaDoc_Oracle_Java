package mPatterns.singleton.offThread.forSingleAccessPoint;

public class SingletonForSingeAccessPointNetworkSimulator {
    public static void main(String[] args) {
        SingletonForSingleAccessPointPublicNetwork singleton = new SingletonForSingleAccessPointPublicNetwork();
        singleton.connectNetwork();
    }
}
