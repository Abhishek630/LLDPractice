package ParkingLot;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Ticket {
    ZonedDateTime entryTime;
    Vehicle vehicle;
    ParkingSlot slot;
    ParkingFloor floor;

    public Ticket(Vehicle vehicle, ParkingSlot slot, ParkingFloor floor) {

        this.entryTime = ZonedDateTime.now();
        this.vehicle = vehicle;
        this.slot = slot;
        this.floor = floor;
    }

    public ZonedDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(ZonedDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSlot slot) {
        this.slot = slot;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }
}
