package com.cedaniel200.screenplay.starc.exceptions;

public class InsertCardException extends AssertionError {

    private static final String MESSAGE = "An error occurred while trying to insert the card";

    public InsertCardException(Throwable cause) {
        super(MESSAGE, cause);
    }
}
