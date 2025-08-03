package RideSharingAppp;

public class Car extends Vehicle{

    public Car(String number) {
        super(number);
    }

    @Override
    public double getFarePerKm() {
        return 20;
    }
}
