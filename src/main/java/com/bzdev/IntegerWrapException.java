package com.bzdev;

/**
 * Custom exception class to indicate an integer wrap condition during
 * the summation of the elements of an integer array.
 * This class stores the type of wrap whether a MAX_INT or a MIN_INT wrap
 * in a message string for output display with the result of the summation.
 *
 * @author Bill Zude
 * @version 10-06-15
 */
public class IntegerWrapException extends RuntimeException {

    private String errMsg;

    public IntegerWrapException(){}

    public IntegerWrapException(String message) {

        super(message);
        this.errMsg = message;

    }

    public void displayErrMsg() {
        System.out.println(this.errMsg);
    }

}
