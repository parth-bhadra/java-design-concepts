package TicTacToe.exceptions;

public class InvalidPlayerCountException extends Exception {
    public InvalidPlayerCountException() {
    }

    public InvalidPlayerCountException(String message) {
        super(message);
    }

    public InvalidPlayerCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPlayerCountException(Throwable cause) {
        super(cause);
    }

    public InvalidPlayerCountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
