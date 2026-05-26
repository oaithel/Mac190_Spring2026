package com.mac190.exceptions;

public class MyUncheckedException extends RuntimeException {
    private int code;
    public MyUncheckedException() {
        super();
        code = 0;
    }
    public MyUncheckedException(int c, String msg) {
        super(msg);
        code = c;
    }
    public String getMessage() {
        return code + ": " + super.getMessage();
    }
}
