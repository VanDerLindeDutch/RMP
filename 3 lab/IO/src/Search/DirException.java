package Search;
public class DirException extends Exception {
    public DirException() {
        super();
    }

    public DirException(String message) {
        super(message);
    }

    public DirException(String message, Throwable cause) {
        super(message, cause);
    }

    public DirException(Throwable cause) {
        super(cause);
    }

    protected DirException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
