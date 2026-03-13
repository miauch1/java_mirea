package Logging;

public abstract class Logger {
    protected Logger nextLogger;

    public void setNextlogger(Logger next) {
        nextLogger = next;
    }

    public void logMessage(String message, Levels level) {
        if (nextLogger != null) nextLogger.logMessage(message, level);
    }
}
