package Logging;

public class CriticalLogger extends Logger {
    @Override
    public void logMessage(String message, Levels level) {
        if (level == Levels.CRITICAL) {
            System.out.println("[CRITICAL]: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
