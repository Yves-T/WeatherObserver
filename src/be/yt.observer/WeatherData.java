package be.yt.observer;

import java.util.ArrayList;

/**
 * User: Yves-T
 * Date: 13/11/12
 * Time: 10:57
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private static WeatherData uniqueWeatherDataInstance;

    private WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public static WeatherData getInstance() {
        if (uniqueWeatherDataInstance == null) {
            uniqueWeatherDataInstance = new WeatherData();
        }
        return uniqueWeatherDataInstance;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(temperature, humidity, pressure);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasureMents(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
