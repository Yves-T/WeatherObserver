package be.yt.observer;

import java.util.List;

/**
 * User: Yves-T
 * Date: 13/11/12
 * Time: 12:38
 */
public class TestXMLParser {
    public static void main(String[] args) {
        YahooWeatherStaxParser staxParser = new YahooWeatherStaxParser();
        List<WeatherItem> weatherItems = staxParser.readConfig();
        for (WeatherItem weatherItem : weatherItems) {
            System.out.println("humidity:" + weatherItem.getHumidity());
            System.out.println("temp:" + weatherItem.getTemperature());
            System.out.println("pressure:" + weatherItem.getPressure());
        }
    }
}
