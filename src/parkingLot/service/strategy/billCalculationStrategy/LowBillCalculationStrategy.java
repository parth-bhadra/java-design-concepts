package src.parkingLot.service.strategy.billCalculationStrategy;

import src.parkingLot.models.Ticket;
import src.parkingLot.models.Vehicle;
import src.parkingLot.models.constants.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowBillCalculationStrategy implements BillCalculationStrategy {
    private static final int PER_HOUR_CHARGE_2_WHEELER = 50;
    private static final int PER_HOUR_CHARGE_4_WHEELER = 100;
    private static final double INCREMENT_FACTOR = 0.1;

    @Override
    public double calculateBillAmount(Ticket ticket, LocalDateTime exitTime) {
        LocalDateTime entryTime = ticket.getEntryTime();
        long totalHours = ChronoUnit.HOURS.between(entryTime, exitTime);

        VehicleType vehicleType = ticket.getVehicle().getVehicleType();

        int perHourCharge = getPerHourCharge(vehicleType);

        double baseCost = totalHours * perHourCharge;
        return baseCost + (baseCost * (INCREMENT_FACTOR * (totalHours-1)));
    }

    private int getPerHourCharge(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR -> {
                return PER_HOUR_CHARGE_4_WHEELER;
            }
            case BIKE -> {
                return PER_HOUR_CHARGE_2_WHEELER;
            }
            default -> {
                return 150;
            }
        }
    }
}
