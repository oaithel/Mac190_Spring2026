package com.mac190.exceptions;

public class MyCheckedException extends Exception {
    private int code;
    public MyCheckedException() {
        super();
        code = 0;
    }
    public MyCheckedException(int c, String msg) {
        super(msg);
        code = c;
    }
    public String getMessage() {
        return code + ": " + super.getMessage();
    }
}
