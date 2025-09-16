package ParkingLot;

import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    int floorId;

    List<ParkingSlot> slots;

    public ParkingFloor(int floorId, List<ParkingSlot> slots) {
        this.slots = slots;
        this.floorId = floorId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public Optional<ParkingSlot> findAvailableSlot(Vehicle vehicle){
        // As per the given vehicle we have to find whether the slots are available on the floor
        //For ex - if Vehicle is car then we have to find out if how many carSlots and busSlots
        // are available because both of them can accommodate car .

        var vehicleType = vehicle.getVehicleType();

        return slots.stream()
                .filter(parkingSlot -> parkingSlot.isAvailable())
                .filter(slot -> slot.canAccommodate(vehicleType))
                .findFirst();

    }
}
