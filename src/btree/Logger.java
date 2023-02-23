package btree;

public class Logger {
    private Class<?> logClass;


    public Logger(Class<?> logClass) {
        this.logClass = logClass;
    }

    public void log (LogType logType, String message) {
        System.out.println("[" + logType.name() + "][" + this.logClass.getName() + "]: " + message);
    }
}
