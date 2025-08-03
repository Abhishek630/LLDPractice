package RideSharingAppp;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingService {

    List<Driver> availableDrivers = new ArrayList<>();

    public void addDrivers(Driver driver) {
        availableDrivers.add(driver);
    }

    //request ride

    public void requestRide(Passenger passenger, double distance, FareStrategy strategy){

        if(availableDrivers.isEmpty()){
            passenger.notify("No drivers are available");
        }

        Driver nearestDriver = findNearestDriver(passenger);

        // have to remove driver form the available list.
        availableDrivers.remove(nearestDriver);
        nearestDriver.notify("Ride to be started");
        passenger.notify("Ride scheduled with " + nearestDriver);
        //Ride to start
        Ride ride = new Ride(nearestDriver,passenger,strategy,distance);
        //Ride started
        ride.updateStatus(RideStatus.ONGOING);
        ride.notifyUsers(RideStatus.ONGOING);

        //Ride completed
        ride.updateStatus(RideStatus.COMPLETED);
        ride.notifyUsers(RideStatus.COMPLETED);
        ride.calculateFare();
        //After ride is completed
        availableDrivers.add(nearestDriver);
    }

    private Driver findNearestDriver(Passenger passenger) {

        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;
        for(Driver driver : availableDrivers) {
            double distance = driver.getLocation().calDist(passenger.getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                assignedDriver = driver;
            }
        }
        return  assignedDriver;
    }

}
