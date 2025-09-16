package ParkingLot;

public class ParkingSlot {
    int slotId;
    boolean isAvailable;
    SlotType slotType;

    public ParkingSlot(int slotId,SlotType slotType) {
        this.slotId = slotId;
        this.isAvailable = true;
        this.slotType = slotType;
    }

    public int getSlotId() {
        return slotId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(SlotType slotType) {
        this.slotType = slotType;
    }

    public boolean canAccommodate(VehicleType vehicleType){
        return switch (vehicleType) {
            case MOTORBIKE -> slotType == SlotType.SMALL || slotType == SlotType.MEDIUM || slotType == SlotType.BIG;
            case CAR -> slotType == SlotType.MEDIUM || slotType == SlotType.BIG;
            case BUS -> slotType == SlotType.BIG;
        };
    }

    public void releaseSlot(){
        if(isAvailable){
            throw  new IllegalArgumentException("Slot" + slotId + "is already free");
        }
        this.isAvailable =true;
    }

    public void assignSlot(){
        if(!isAvailable){
            throw new IllegalArgumentException("Slot" + slotId + "is already assigned");
        }
        this.isAvailable = false;
    }



}
