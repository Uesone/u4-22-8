package com.example.DAO;

import com.example.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class PartitaDiCalcioDAO {

    private EntityManager em;

    public PartitaDiCalcioDAO(EntityManager em) {
        this.em = em;
    }

    // Named Query 1: Partite vinte in casa
    public List<PartitaDiCalcio> getPartiteVinteInCasa() {
        TypedQuery<PartitaDiCalcio> query = em.createNamedQuery("PartitaDiCalcio.findVinteInCasa", PartitaDiCalcio.class);
        return query.getResultList();
    }

    // Named Query 2: Partite vinte in trasferta
    public List<PartitaDiCalcio> getPartiteVinteInTrasferta() {
        TypedQuery<PartitaDiCalcio> query = em.createNamedQuery("PartitaDiCalcio.findVinteInTrasferta", PartitaDiCalcio.class);
        return query.getResultList();
    }
}
