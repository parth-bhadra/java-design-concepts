package src.parkingLot.service.strategy.billCalculationStrategy;

import src.parkingLot.models.constants.BillCalculationStrategyType;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(BillCalculationStrategyType billCalculationStrategy) {
        switch (billCalculationStrategy) {
            case LOW_BILL_CALCULATION_STRATEGY -> {
                return new LowBillCalculationStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}
