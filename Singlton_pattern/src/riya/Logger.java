
package riya;

public class Logger {
    private Logger(){}
    
    public static class LoggerHolder
    {
        public static Logger logger = new Logger();
    }
    
    public static Logger getInstance()
    {
        return LoggerHolder.logger;
    }
    
}
