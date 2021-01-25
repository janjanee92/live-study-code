package com.jihan.javastudycode.week9;

public class CustomException extends Exception {
    protected ErrorCode code = null;

    public CustomException(ErrorCode code) {
        super();
        this.code = code;
    }
    public CustomException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;
    }
    public CustomException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }
    public CustomException(Throwable cause, ErrorCode code) {
        super(cause);
        this.code = code;
    }

    public ErrorCode getErrorCode() {
        return this.code;
    }
}
