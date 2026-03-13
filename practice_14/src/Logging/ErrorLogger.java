package Logging;

public class ErrorLogger extends Logger {
    @Override
    public void logMessage(String message, Levels level) {
        if (level == Levels.ERROR) {
            System.out.println("[ERROR]: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
