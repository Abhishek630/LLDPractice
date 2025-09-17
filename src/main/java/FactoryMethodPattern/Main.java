package FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle1 = factory.getVehicle("CAR");
        vehicle1.start();
        vehicle1.stop();

        Vehicle vehicle2 = factory.getVehicle("BUS");
        vehicle2.start();
        vehicle2.stop();

        Vehicle vehicle3 = factory.getVehicle("TRUCK");
        vehicle3.start();
        vehicle3.stop();

    }

    /*
    Also known as: Virtual Constructor
     */
}
