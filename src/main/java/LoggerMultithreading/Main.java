package LoggerMultithreading;

public class Main {
    public static void main(String[] args) {
        Thread logger1 = new Thread(new Application());
        Thread logger2 = new Thread(new Application());
        logger1.start();
        logger2.start();

    }
}
