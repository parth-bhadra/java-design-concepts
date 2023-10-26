package src.parkingLot.models;

import src.parkingLot.models.constants.ParkingSlotStatus;
import src.parkingLot.models.constants.VehicleType;

public class ParkingSlot extends BaseModel {
    private int number;
    private VehicleType vehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private Vehicle vehicle;

}
