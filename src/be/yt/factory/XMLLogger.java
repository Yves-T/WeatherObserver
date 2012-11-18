package be.yt.factory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 15:58
 */
// concrete implementation of the Logger ( Produkt )
public class XMLLogger implements Logger {
    @Override
    public void log(String message) {
        // log to XML
        System.err.print("Logging to XML");
    }
}
