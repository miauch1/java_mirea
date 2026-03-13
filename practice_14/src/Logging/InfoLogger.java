package Logging;

public class InfoLogger extends Logger {
    @Override
    public void logMessage(String message, Levels level) {
        if (level == Levels.INFO) {
            System.out.println("[INFO]: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
