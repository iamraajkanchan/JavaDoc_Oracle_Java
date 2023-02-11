package mPatterns.observer.withJavaUtil;

import java.util.Observable;
import java.util.Observer;

public class ThirdPartyLibrary implements Observer, DisplayBehavior {

    Observable observable;
    private float temperature;
    private float pressure;
    private float humidity;

    ThirdPartyLibrary(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            o.notifyObservers();
            this.temperature = ((WeatherData) o).getTemperature();
            this.pressure = ((WeatherData) o).getPressure();
            this.humidity = ((WeatherData) o).getHumidity();
        }
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

    public void unsubscribe() {
        observable.deleteObserver(this);
    }
}
