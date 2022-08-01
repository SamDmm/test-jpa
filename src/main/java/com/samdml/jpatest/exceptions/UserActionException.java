package com.samdml.jpatest.exceptions;

public class UserActionException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UserActionException(String message) {
        super(message);
    }
}
