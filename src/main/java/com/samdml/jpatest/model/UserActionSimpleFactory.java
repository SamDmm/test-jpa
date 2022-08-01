package com.samdml.jpatest.model;

import com.samdml.jpatest.exceptions.UserActionException;

public class UserActionSimpleFactory {

    public static UserAction create(UserActionValue userActionValue) {

        if (userActionValue.equals(UserActionValue.create)) {
            return new UserAction("1", userActionValue.toString());

        } else if (userActionValue.equals(UserActionValue.read)) {
            return new UserAction("2", userActionValue.toString());

        } else if (userActionValue.equals(UserActionValue.update)) {
            return new UserAction("3", userActionValue.toString());

        } else if (userActionValue.equals(UserActionValue.delete)) {
            return new UserAction("4", userActionValue.toString());

        } else {
            throw new UserActionException("Invalid UserAction.");
        }
    }

    public enum UserActionValue {
        create, read, update, delete
    }
}
