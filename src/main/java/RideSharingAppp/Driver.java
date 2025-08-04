package RideSharingAppp;

public class Driver extends User {
    String name;
    Location location;
    Vehicle vehicle;

    public Driver(String name, Location location, Vehicle vehicle) {
        super(name, location);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void notify(String msg) {
        System.out.println(msg);
    }
}
