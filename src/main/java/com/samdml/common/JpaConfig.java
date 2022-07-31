package com.samdml.common;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaConfig {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
