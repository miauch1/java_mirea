package Test;

import Logging.*;

public class Main {
    public static void main(String[] args) {

        Logger info = new InfoLogger();
        Logger warning = new WarningLogger();
        Logger error = new ErrorLogger();
        Logger critical = new CriticalLogger();
        Logger debug = new DebugLogger();

        info.setNextlogger(warning);
        warning.setNextlogger(error);
        error.setNextlogger(critical);
        critical.setNextlogger(debug);

        System.out.println("Requests: ");
        info.logMessage("This is info message", Levels.INFO);
        info.logMessage("This is warning message", Levels.WARNING);
        info.logMessage("This is error message", Levels.ERROR);
        info.logMessage("This is critical message", Levels.CRITICAL);
        info.logMessage("This is debug message", Levels.DEBUG);
    }
}
