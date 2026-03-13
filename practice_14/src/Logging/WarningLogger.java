package Logging;

public class WarningLogger extends Logger {
    @Override
    public void logMessage(String message, Levels level) {
        if (level == Levels.WARNING) {
            System.out.println("[WARNING]: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
