package mPatterns.observer.withoutJavaUtil;

public class WeatherDataSimulator {
    public static void main(String[] a) {
        /* Instantiating the Subject. */
        WeatherData weatherData = new WeatherData();

        /* Instantiating the Observers. */
        CurrentObservation currentObservation = new CurrentObservation();
        ThirdPartyLibrary thirdPartyLibrary = new ThirdPartyLibrary();
        TokyoObservation tokyoObservation = new TokyoObservation();

        weatherData.measurementChanged(32f, 12.25f, 96.07f);
        weatherData.registerObserver(currentObservation);
        weatherData.registerObserver(thirdPartyLibrary);
        weatherData.notifyObserver();

        weatherData.removeObserver(thirdPartyLibrary);
        weatherData.measurementChanged(14f, 12.25f, 96.07f);
        weatherData.notifyObserver();

        /* Displaying data from various Observers. */
        currentObservation.display();
        thirdPartyLibrary.display();
        tokyoObservation.display();
    }
}
