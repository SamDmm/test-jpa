package com.samdml.jpatest.model;

import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
public class AccessRight {

    private String id;
    private Set<UserAction> userActions = new HashSet<>();

    public AccessRight() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<UserAction> getUserActions() {
        return userActions;
    }

    public void setUserActions(Set<UserAction> userActions) {
        this.userActions = userActions;
    }

    public void addUserAction(UserAction userAction) {
        userActions.add(userAction);
    }
}
