package io.github.JPA_Work.services;

import io.github.JPA_Work.models.Sample;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class SampleService {
    public EntityManager em = Persistence.createEntityManagerFactory("JPA_Work").createEntityManager();

    public Sample add(Sample sample){
        em.getTransaction().begin();
        Sample sampleFromDB = em.merge(sample);
        em.getTransaction().commit();
        return sampleFromDB;
    }

    public void delete(int id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Sample get(int id){
        return em.find(Sample.class, id);
    }

    public void update(Sample sample){
        em.getTransaction().begin();
        em.merge(sample);
        em.getTransaction().commit();
    }

    public List<Sample> getAll(){
        TypedQuery<Sample> namedQuery = em.createNamedQuery("Sample.getAll", Sample.class);
        return namedQuery.getResultList();
    }


    public List<Object[]> getAllWithBrigade() {
        return em.createQuery("""
        SELECT s, b
        FROM Sample s
        LEFT JOIN s.brigade b
        """, Object[].class)
                .getResultList();
    }

}
