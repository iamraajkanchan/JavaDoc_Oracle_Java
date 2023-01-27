package mInterface;

public class MyInterfaceImpl implements IMyInterface{
    @Override
    public void addMyName() {
        System.out.println("Adding Raj Kanchan in " + IMyInterface.systemName + " team");
    }

    @Override
    public void showToast() {
        System.out.println("Overriding showToast method of Interface.");
        IMyInterface.super.showToast();
    }
}
