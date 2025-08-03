package RideSharingAppp;

public class Ride {
    Driver driver;
    Passenger passenger;
    FareStrategy fareStrategy;
    RideStatus rideStatus;
    double distance;
    double fare;

    public Ride(Driver driver, Passenger passenger, FareStrategy fareStrategy, double distance) {
        this.driver = driver;
        this.passenger = passenger;
        this.fareStrategy = fareStrategy;
        this.rideStatus = RideStatus.SCHEDULED;
        this.distance = distance;
        this.fare = fare;
    }

    //polymorphic behaviour

    public double calculateFare(){
        return fareStrategy.calculateFare(driver.getVehicle(), distance);
    }

    public void updateStatus(RideStatus status){
        this.rideStatus =status;
        notifyUsers(status);
    }

    public void notifyUsers(RideStatus status){
        driver.notify("Ride status " + status);
        passenger.notify("Ride status " + status);
    }

}
