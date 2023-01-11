package chapter8;

public class UnsupportedFunctionException extends RuntimeException{

    private final int ERR_CODE;

    public UnsupportedFunctionException() {
        this(100);
    }

    public UnsupportedFunctionException(int ERR_CODE) {
        this.ERR_CODE = ERR_CODE;
    }

    public UnsupportedFunctionException(String message, int ERR_CODE) {
        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + ERR_CODE + "]" + super.getMessage();
    }
}
