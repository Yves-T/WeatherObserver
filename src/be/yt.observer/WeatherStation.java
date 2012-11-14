package be.yt.observer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * User: Yves-T
 * Date: 13/11/12
 * Time: 14:06
 */
public class WeatherStation {
    public static void main(String[] args) {

        // setup weather display
        WeatherData weatherData = WeatherData.getInstance();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        // setup task for fetching weather
        FetchWeatherTask printTask = new FetchWeatherTask();
        ScheduledExecutorService threadExecutor = Executors.newScheduledThreadPool(1);

        // start fetching weather conditions
        // first parameter : runnable task
        // second parameter : task is first executed after this delay
        // third parameter : task is recurringly executed after this period expires
        // fourth parameter : timeunit in this case seconds
        threadExecutor.scheduleAtFixedRate(printTask, 5, 10, TimeUnit.SECONDS);
    }
}
