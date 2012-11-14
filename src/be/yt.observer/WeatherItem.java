package be.yt.observer;

/**
 * User: Yves-T
 * Date: 13/11/12
 * Time: 11:37
 */
public class WeatherItem {
    private String humidity;
    private String temperature;
    private String pressure;

    public Float getPressure() {
        if(pressure != null)
        return Float.valueOf(pressure);
        else return 0f;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public Float getTemperature() {
        return Float.valueOf(temperature);
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return Float.valueOf(humidity);
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
