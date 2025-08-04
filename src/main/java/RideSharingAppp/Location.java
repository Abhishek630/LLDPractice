package RideSharingAppp;

public class Location {

    double latitude;
    double longitude;


    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double calDist(Location loc){
        double dx = this.getLatitude() - loc.getLatitude();
        double dy = this.getLongitude() - loc.getLongitude();
        return Math.sqrt(dx*dx + dy*dy);
    }
}
