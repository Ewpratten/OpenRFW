package ca.retrylife.openrfw.core.logging;

public class LogCFG {

    // Minimum log level
    private static int minLevel = 0;

    /**
     * Set the global minimum logging level
     * 
     * @param level Min level
     */
    public static void setMinLogLevel(LogLevel level) {
        minLevel = level.l;
    }

    /**
     * Check if a level is allowed based on logging restrictions
     */
    public static boolean isLoggable(LogLevel level) {
        return level.l >= minLevel;
    }
}