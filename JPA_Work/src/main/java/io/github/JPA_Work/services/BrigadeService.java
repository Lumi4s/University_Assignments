package io.github.JPA_Work.services;

import io.github.JPA_Work.models.Brigade;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BrigadeService {
    public EntityManager em = Persistence.createEntityManagerFactory("JPA_Work").createEntityManager();

    public Brigade add(Brigade brigade){
        em.getTransaction().begin();
        Brigade brigadeFromDB = em.merge(brigade);
        em.getTransaction().commit();
        return brigadeFromDB;
    }

    public void delete(int id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Brigade get(int id){
        return em.find(Brigade.class, id);
    }

    public void update(Brigade brigade){
        em.getTransaction().begin();
        em.merge(brigade);
        em.getTransaction().commit();
    }

    public List<Brigade> getAll(){
        TypedQuery<Brigade> namedQuery = em.createNamedQuery("Brigade.getAll", Brigade.class);
        return namedQuery.getResultList();
    }
}