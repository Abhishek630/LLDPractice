package LoggerMultithreading;



public class Application implements  Runnable {
    public  void run() {
        Logger logger = Logger.getLogger();
        logger.log("Application started.");
    }
}
