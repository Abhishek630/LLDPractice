package RideSharingAppp;

public abstract class Vehicle {

    String number;

    public Vehicle(String number) {
        this.number = number;
    }

    public abstract double getFarePerKm();
}
