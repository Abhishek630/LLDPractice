package ParkingLot;


public abstract class Vehicle {
    String licensePlate;
    VehicleType vehicleType;

    public Vehicle(String licensePlate, VehicleType vehicleType) {
        if(licensePlate == null || licensePlate.isEmpty()){
            throw new IllegalArgumentException("License Plate cannot be empty");
        }
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicencePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
