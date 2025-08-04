package RideSharingAppp;

public class Passenger extends User{
    String name;
    Location location;

    public Passenger(String name, Location location) {
        super(name, location);
    }

    @Override
    public void notify(String msg) {
        System.out.println(msg);
    }
}
