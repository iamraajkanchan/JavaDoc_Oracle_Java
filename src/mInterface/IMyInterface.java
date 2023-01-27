package mInterface;

public interface IMyInterface {
    String systemName = "Aakash Rane";
    void addMyName();
    default void showToast() {
        System.out.println("Hello " + systemName);
        addMyName();
    }
}
