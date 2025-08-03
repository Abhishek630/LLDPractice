package RideSharingAppp;

public class StandardFare implements FareStrategy{
    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance;
    }
}
