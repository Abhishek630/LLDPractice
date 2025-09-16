package LoggerMultithreading;

public class Logger {
    //Private static variable to hold the single instance
    private  static volatile Logger logger = null;
    //why volatile -> for visibility to other threads
    private Logger(){
        // Why?-> Private constructor to prevent external instantiation
    }

    public static Logger getLogger() {
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null) {
                    logger = new Logger();
                }// New  instance done only when logger doesn't exist
            }
        }
        return  logger;
    }

    public void log(String message) {
        System.out.println("Log " + message);
    }
}
