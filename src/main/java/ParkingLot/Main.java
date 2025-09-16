package ParkingLot;

public class Main {
    public static void main(String[] args) {
        ParkingSlot slot1 = new ParkingSlot(1, SlotType.BIG);
        ParkingSlot slot2 = new ParkingSlot(2, SlotType.MEDIUM);
        ParkingSlot slot3 = new ParkingSlot(3, SlotType.SMALL);

        System.out.println(slot1.canAccommodate(VehicleType.CAR));
        System.out.println(slot3.canAccommodate(VehicleType.CAR));
        slot1.assignSlot();
        slot2.releaseSlot();
    }
}
