package mPatterns.observer.withJavaUtil;

import java.util.*;

public class WeatherData extends Observable {
    private float temperature;
    private float pressure;
    private float humidity;

    WeatherData() {
        temperature = 0.0f;
        pressure = 0.0f;
        humidity = 0.0f;
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getPressure() {
        return this.pressure;
    }

    public float getHumidity() {
        return this.humidity;
    }

}
