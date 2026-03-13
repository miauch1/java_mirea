package Logging;

public class DebugLogger extends Logger {
    @Override
    public void logMessage(String message, Levels level) {
        if (level == Levels.DEBUG) {
            System.out.println("[DEBUG]: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
