package ca.retrylife.openrfw.core.logging;

/**
 * Logging message urgency level
 */
public enum LogLevel {
    INFO("", 2), WARN("WARN: ", 3), ERROR("ERROR: ", 4), FATAL("FATAL: ", 5), DEBUG("DEBUG: ", 1),
    LIB_DEBUG("LIB: ", 0);

    public String m;
    public int l;

    private LogLevel(String m, int l) {
        this.m = m;
        this.l = l;
    }
}