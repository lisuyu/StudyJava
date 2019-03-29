package app.test.error;

public class ClothException extends Exception {

    public ClothException() {
    }

    public ClothException(String message) {
        super(message);
    }

    public ClothException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClothException(Throwable cause) {
        super(cause);
    }

    public ClothException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
