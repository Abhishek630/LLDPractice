package RideSharingAppp;

public class SharingFare implements FareStrategy {
    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm()*0.75*distance;
    }
}
