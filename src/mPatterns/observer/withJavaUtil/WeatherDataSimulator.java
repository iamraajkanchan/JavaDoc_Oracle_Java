package mPatterns.observer.withJavaUtil;

public class WeatherDataSimulator {
    public static void main(String[] a) {
        /* Instantiating the Subject. */
        WeatherData weatherData = new WeatherData();

        /* Instantiating the Observers. */
        CurrentObservation currentObservation = new CurrentObservation(weatherData);
        ThirdPartyLibrary thirdPartyLibrary = new ThirdPartyLibrary(weatherData);
        TokyoObservation tokyoObservation = new TokyoObservation(weatherData);

        weatherData.setMeasurements(32f, 12.25f, 96.07f);
        weatherData.measurementsChanged();
        weatherData.setMeasurements(14f, 12.25f, 96.07f);
        tokyoObservation.unsubscribe();
        weatherData.measurementsChanged();

        /* Displaying data from various Observers. */
        currentObservation.display();
        thirdPartyLibrary.display();
        tokyoObservation.display();
    }
}
