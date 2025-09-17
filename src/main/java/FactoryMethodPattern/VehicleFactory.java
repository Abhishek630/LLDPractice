package FactoryMethodPattern;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }
        else if(vehicleType.equalsIgnoreCase("BUS")) {
            return new Bus();
        }
        else if (vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        throw new IllegalArgumentException("No Vehicle found");
    }
}
