package RideSharingAppp;

public class LuxuryFare implements FareStrategy {
    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm()*distance*2;
    }
}
