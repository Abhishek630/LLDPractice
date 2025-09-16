package SingletonPattern;

public class Logger {
    //Private static variable to hold the single instance
    private  static Logger logger = null;
    private Logger(){
        // Why?-> Private constructor to prevent external instantiation
    }

    public static Logger getLogger() {
        if(logger == null){
            logger = new Logger(); // New  instance done only when logger doesn't exist
        }
        return  logger;
    }

    public void log(String message) {
        System.out.println("Log " + message);
    }
}
