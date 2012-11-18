package be.yt.factory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 16:01
 */
// the abstract creator
public abstract class AbstractLoggerCreator {
    // the factory method
    public abstract Logger createLogger();

    // the operations that are implemented for all LoggerCreators
    // like anOperation() in our diagram
    public Logger getLogger() {
        // depending on the subclass, we'll get a particular logger.
        Logger logger = createLogger();

        // could do other operations on the logger here

        return logger;
    }
}
