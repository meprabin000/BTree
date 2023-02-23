package btree;

/**
 * Logger class implements the log method that easily logs the class stamp
 * and messages in a proper format.
 */
public class Logger {
    private Class<?> logClass;

    // constructor
    public Logger(Class<?> logClass) {
        this.logClass = logClass;
    }

    // logs the message
    public void log (LogType logType, String message) {
        System.out.println("[" + logType.name() + "][" + this.logClass.getName() + "]: " + message);
    }
}
