package RideSharingAppp;

public class Bike extends Vehicle{

    public Bike(String number) {
        super(number);
    }

    @Override
    public double getFarePerKm() {
        return 10;
    }
}
