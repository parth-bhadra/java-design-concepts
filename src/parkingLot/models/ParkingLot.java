package src.parkingLot.models;

import src.parkingLot.models.constants.ParkingLotStatus;
import src.parkingLot.models.constants.VehicleType;
import src.parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategy;
import src.parkingLot.service.strategy.slotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> supportedVehicleTypes;
    private SlotAllocationStrategy slotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;
}
