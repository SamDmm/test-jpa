package com.samdml.jpatest.model;

import jakarta.persistence.Entity;

@Entity
public class UserAction {

    private String id;
    private String name;

    UserAction(String id, String name) {
        this.id = id;
        this.name = name;
    }

    UserAction() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
