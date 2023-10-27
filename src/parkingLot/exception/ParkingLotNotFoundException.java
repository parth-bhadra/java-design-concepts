package src.parkingLot.exception;

public class ParkingLotNotFoundException extends Exception {
    public ParkingLotNotFoundException() {
        super();
    }

    public ParkingLotNotFoundException(String message) {
        super(message);
    }
}
