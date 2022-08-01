package com.samdml.jpatest.model;

import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    private String id;
    private Set<AccessRight> accessRights = new HashSet<>();

    public Role() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<AccessRight> getAccessRights() {
        return accessRights;
    }

    public void setAccessRights(Set<AccessRight> accessRights) {
        this.accessRights = accessRights;
    }

    public void addAccessRight(AccessRight accessRight) {
        accessRights.add(accessRight);
    }
}
