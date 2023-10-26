package src.parkingLot.service.strategy.slotAllocationStrategy;

import src.parkingLot.models.Gate;
import src.parkingLot.models.ParkingLot;
import src.parkingLot.models.ParkingSlot;
import src.parkingLot.models.constants.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate gate);
}
