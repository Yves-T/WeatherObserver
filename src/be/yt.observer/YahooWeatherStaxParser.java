package be.yt.observer;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * User: Yves-T
 * Date: 13/11/12
 * Time: 11:44
 */
public class YahooWeatherStaxParser {
    static final String CHANNEL = "channel";
    static final String ATMOSPHERE = "atmosphere";
    static final String HUMIDITY = "humidity";
    static final String CONDITION = "condition";
    static final String TEMP = "temp";
    static final String PRESSURE = "pressure";

    public static List<WeatherItem> readConfig() {
        List<WeatherItem> weatherItems = new ArrayList<WeatherItem>();

        try {
            // first create a new XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // setup a new eventreader
            InputStream in = null;
            try {
                in = new URL("http://weather.yahooapis.com/forecastrss?w=971554&u=c").openStream();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            // read the XML document
            WeatherItem weatherItem = null;

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    // if we have a channel element we create a new weatherItem
                    if (startElement.getName().getLocalPart() == CHANNEL) {
                        weatherItem = new WeatherItem();
                        // we read the attributes from this tag and add the date
                        // attribute to our object
                        Iterator<Attribute> attributes = startElement.getAttributes();
                    }
                }

                if (event.isStartElement()) {
                    if (event.asStartElement().getName().getLocalPart().indexOf(ATMOSPHERE) > -1) {
                        Iterator<Attribute> attributes = event.asStartElement().getAttributes();
                        while (attributes.hasNext()) {
                            Attribute attribute = attributes.next();
                            if (attribute.getName().toString().equals(HUMIDITY)) {
                                weatherItem.setHumidity(attribute.getValue());
                            } else if ((attribute.getName().toString().equals(PRESSURE))) {
                                weatherItem.setPressure(attribute.getValue());
                            }
                        }
                    }
                }

                if (event.isStartElement()) {
                    if (event.asStartElement().getName().getLocalPart().indexOf(CONDITION) > -1) {
                        Iterator<Attribute> attributes = event.asStartElement().getAttributes();
                        while (attributes.hasNext()) {
                            Attribute attribute = attributes.next();
                            if (attribute.getName().toString().equals(TEMP)) {
                                weatherItem.setTemperature(attribute.getValue());
                            }


                        }
                    }
                }

                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart() == (CHANNEL)) {
                        weatherItems.add(weatherItem);
                    }
                }
            }

        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        return weatherItems;
    }
}
