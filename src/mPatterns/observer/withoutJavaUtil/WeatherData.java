package mPatterns.observer.withoutJavaUtil;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    private boolean isMeasurementChanged;

    WeatherData() {
        observers = new ArrayList<>();
        temperature = 0.0f;
        pressure = 0.0f;
        humidity = 0.0f;
        isMeasurementChanged = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        if (observerIndex >= 0) {
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObserver() {
        if (isMeasurementChanged) {
            for (Observer observer : observers) {
                observer.update(temperature, pressure, humidity);
            }
        }
    }

    public void measurementChanged(float temperature, float pressure, float humidity) {
        if (this.temperature != temperature) {
            this.temperature = temperature;
            isMeasurementChanged = true;
        }
        if (this.pressure != pressure) {
            this.pressure = pressure;
            isMeasurementChanged = true;
        }
        if (this.humidity != humidity) {
            this.humidity = humidity;
            isMeasurementChanged = true;
        }
    }

}
