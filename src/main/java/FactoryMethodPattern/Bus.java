package FactoryMethodPattern;

public class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bus started");
    }

    @Override
    public void stop() {
        System.out.println("Bus Stopped");
    }
}
