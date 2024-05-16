package com.example.hibernatedao.repository;

import com.example.hibernatedao.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Transactional
@Repository
public class DBRepository {
     @PersistenceContext
     private EntityManager entityManager;

     public List<Persons> getPersonsByCity(String city) {
         String query = "select p from Persons p where cityOfLiving = :city";

        List<Persons> personsList = entityManager
                 .createQuery(query, Persons.class)
                .setParameter("city", city)
                 .getResultList();

         return personsList;
     }
}
