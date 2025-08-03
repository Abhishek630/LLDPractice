package RideSharingAppp;

public class Main {
    public static void main(String[] args) {
        Location loc1 = new Location(12.345, 12.976);
        Location loc2 = new Location(13.098, 11.888);
        Location loc3 = new Location(15.982, 9.087);
        Vehicle car = new Car("ABCar");
        Vehicle bike = new Bike("ABike");

        Driver driver1 = new Driver("Driver1",loc1,car);
        Driver driver2 = new Driver("Driver2", loc2, bike);



        Passenger passenger1 = new Passenger("Passenger1", loc3);

        RideMatchingService rms = new RideMatchingService();
        rms.addDrivers(driver1);
        rms.addDrivers(driver2);
        FareStrategy fs1 = new StandardFare();
        FareStrategy fs2 = new SharingFare();
        FareStrategy fs3 = new LuxuryFare();
        rms.requestRide(passenger1, 20.45,fs1);
    }
}
