package com.samdml.jpatest.jpa;

import com.samdml.jpatest.common.JpaConfig;
import com.samdml.jpatest.model.*;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;

public class JpaTest {

    @Test
    public void test() {
        EntityManager entityManager = JpaConfig.getEntityManager();
        entityManager.getTransaction().begin();

        UserAction userAction = UserActionSimpleFactory.create(UserActionSimpleFactory.UserActionValue.read);

        AccessRight accessRight = new AccessRight();
        accessRight.setId("1");
        accessRight.addUserAction(userAction);

        Role role = new Role();
        role.setId("1");
        role.addAccessRight(accessRight);

        User user = new User();
        user.setId("1");
        user.setFirstName("testFirstName");
        user.setLastName("testLastName");
        user.setEmail("test@test.com");
        user.addRole(role);

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
