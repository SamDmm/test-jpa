package com.samdml.jpa;

import com.samdml.common.JpaConfig;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;

public class JpaTest {

    @Test
    public void test() {
        EntityManager entityManager = JpaConfig.getEntityManager();
        entityManager.getTransaction().begin();


        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
