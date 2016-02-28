/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.repository;

import com.gkopevski.model.FuelEntry;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gkopevski
 */
@Repository
public class FuelEntryRepository {

    // Injected database connection:
    @PersistenceContext
    private EntityManager em;

    // Stores a new guest: 
    public void save(FuelEntry fuelEntry) {
        em.persist(fuelEntry);
    }

    // Retrieves all the FuelEntries:
    public List<FuelEntry> getAllFuelEntries() {
        Query query = em.createQuery(
                "SELECT fe FROM FuelEntry fe ORDER BY fe.id", FuelEntry.class);
        return query.getResultList();
    }
    
    // Retrieves all the FuelEntries:
    public FuelEntry getLatestFuelEntry() {
        Query query = em.createQuery(
                "SELECT fe FROM FuelEntry fe ORDER BY fe.id desc", FuelEntry.class);
        query.setMaxResults(1);
        FuelEntry result = null;
        try {
            result = (FuelEntry) query.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
        }
        return result;
    }

//    public List<Product> findAll() {
//        return em.createQuery("SELECT p FROM Product p").getResultList();
//    }
}
