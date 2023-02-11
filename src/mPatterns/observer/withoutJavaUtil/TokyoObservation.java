package mPatterns.observer.withoutJavaUtil;

public class TokyoObservation implements Observer, DisplayBehavior {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public void displayObserverName() {
        System.out.println("This is " + getClass().getSimpleName());
    }

    @Override
    public void display() {
        displayObserverName();
        System.out.println("Temperature : " + this.temperature + " C, Pressure : " + this.pressure + " Pa, Humidity : " + this.humidity + " cubic metre");
    }
}
