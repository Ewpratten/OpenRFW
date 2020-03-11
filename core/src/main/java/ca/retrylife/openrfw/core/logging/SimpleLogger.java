package ca.retrylife.openrfw.core.logging;

public class SimpleLogger {

    /**
     * Log a message to the console
     * 
     * @param component Component source name
     * @param message   Message contents
     */
    public static void log(String component, String message) {
        log(component, message, LogLevel.INFO);
    }

    /**
     * Log a message to the console
     * 
     * @param component Component source name
     * @param message   Message contents
     * @param level     Log level
     */
    public static void log(String component, String message, LogLevel level) {

        // Insure message is allowed
        if (LogCFG.isLoggable(level)) {
            System.out.println(String.format("[%s] %s%s", component, level.m, message));
        }

    }
}