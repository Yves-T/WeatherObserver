package be.yt.observer;

import java.util.List;

/**
 * User: Yves-T
 * Date: 14/11/12
 * Time: 12:27
 */
public class FetchWeatherTask implements Runnable {
    private String taskName;

    public FetchWeatherTask() {

    }

    @Override
    public void run() {
        // fetch weather
        WeatherData weatherData = WeatherData.getInstance();
        List<WeatherItem> weatherItems = YahooWeatherStaxParser.readConfig();
        WeatherItem weatherItem = weatherItems.get(0);
        assert weatherItem != null;

        weatherData.setMeasureMents(weatherItem.getTemperature(), weatherItem.getHumidity(), weatherItem.getPressure());
    }
}
