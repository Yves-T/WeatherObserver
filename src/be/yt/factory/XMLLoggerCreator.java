package be.yt.factory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 16:05
 */
// concrete creator
public class XMLLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        return new XMLLogger();
    }
}