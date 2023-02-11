package mPatterns.observer.withJavaUtil;

import java.util.Observable;
import java.util.Observer;

public class CurrentObservation implements Observer, DisplayBehavior {

    Observable observable;
    private float temperature;
    private float pressure;
    private float humidity;

    CurrentObservation(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.humidity = weatherData.getHumidity();
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
