package Search;
public class DirectException extends Exception {
    public DirectException() {
        super();
    }

    public DirectException(String message) {
        super(message);
    }

    public DirectException(String message, Throwable cause) {
        super(message, cause);
    }

    public DirectException(Throwable cause) {
        super(cause);
    }

    protected DirectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
