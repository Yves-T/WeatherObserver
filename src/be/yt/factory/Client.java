package be.yt.factory;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 16:07
 */
public class Client {
    private void someMethodThatLogs(AbstractLoggerCreator loggerCreator) {
        Logger logger = loggerCreator.createLogger();
        logger.log("Message");
    }

    public static void main(String[] args) {
        // For the purpose of this example, create an XMLLoggerCreator directly
        // but this would normally be passed to constructor for use.
        AbstractLoggerCreator creator = new XMLLoggerCreator();

        Client client = new Client();
        client.someMethodThatLogs(creator);
    }
}
