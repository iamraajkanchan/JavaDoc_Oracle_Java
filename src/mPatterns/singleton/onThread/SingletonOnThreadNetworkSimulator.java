package mPatterns.singleton.onThread;

public class SingletonOnThreadNetworkSimulator {
    public static void main(String[] a) {
        SingletonOnThreadNew singletonPublicThread = new SingletonOnThreadNew(4);
        SingletonOnThreadPublicNetwork singletonPublicNetwork = new SingletonOnThreadPublicNetwork(singletonPublicThread);
        singletonPublicNetwork.connect();
        SingletonOnThreadNew singletonPrivateThread = new SingletonOnThreadNew(2);
        SingletonOnThreadPrivateNetwork singletonPrivateNetwork = new SingletonOnThreadPrivateNetwork(singletonPrivateThread);
        singletonPrivateNetwork.connect();
    }
}

/**
 * Output:
 * There is some technical issue in Public Network, please try after sometime!
 * Connecting Network...
 * There is some technical issue in Private Network, please try after sometime!
 * Connecting Network...
 * Attempting to connect 4 pools in few minutes...
 * Attempting to connect 4 pools in few minutes...
 * */

/**
 * Though the output is confusing but, we were meant not to update the pool of SingletonOnThreadNetwork
 * As this is an example of Singleton, we are going to have on only one instance of SingletonOnThreadNetwork
 * which we created when were creating the instance singletonPublicThread and, we defined the pool size to 4.
 * So according to the code works.
 *
 * But we still have to figure out why the Public and Private Network is not connected.
 * */