package src.parkingLot.service.strategy.billCalculationStrategy;

import src.parkingLot.models.Ticket;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    double calculateBillAmount(Ticket ticket, LocalDateTime exitTime);
}
