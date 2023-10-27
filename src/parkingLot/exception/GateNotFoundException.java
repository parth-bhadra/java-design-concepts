package src.parkingLot.exception;

public class GateNotFoundException extends Exception {
    public GateNotFoundException() {
        super();
    }

    public GateNotFoundException(String message) {
        super(message);
    }
}
