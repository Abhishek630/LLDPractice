package ParkingLot;

import java.util.Map;
import java.util.Optional;

public class ParkingLot {

    Map<Integer,ParkingFloor> floors;

    public Optional<Ticket> parkVehicle(Vehicle vehicle) {
        var vehicleType = vehicle.getVehicleType();
        var number = vehicle.licensePlate;

        //find which floor has parking slot empty which can accommodate our vehicle.
        // So from floorMap we have to get the floor on which vehicleTypeSlots are present
        // check for each floor and
        // then check if the vehicleSlots can accommodate it or not

        for(ParkingFloor floor : floors.values()) {
            Optional<ParkingSlot> availableSlot = floor.findAvailableSlot(vehicle);
            if(availableSlot.isPresent()){
                ParkingSlot slot = availableSlot.get();
                slot.setAvailable(false);

                Ticket ticket = new Ticket(vehicle,slot,floor);
                return  Optional.of(ticket);
            }
        }
        return Optional.empty();
    }

    public void unparkVehicle(Ticket ticket){
        ParkingSlot slot = ticket.getSlot();
        slot.setAvailable(true);
    }
}
