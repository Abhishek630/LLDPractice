package FactoryMethodPattern;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck Started");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stopped");
    }
}
