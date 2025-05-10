package com.elias.core.Persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenceEntityManager {


    private static PersistenceEntityManager instance;
    private EntityManager entityManager;

    private PersistenceEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-pg");
        entityManager= emf.createEntityManager();

    }

    public static synchronized PersistenceEntityManager getInstance() {
        if(instance == null)
            instance = new PersistenceEntityManager();
        return instance;
    }


    public EntityManager getEntityManager() {
        return entityManager;
    }

}
