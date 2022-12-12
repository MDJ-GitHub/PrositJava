/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionhopital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author MDJMi
 */
public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        this.medecinPatiens = new HashMap<Medecin, ListPatients>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, null);
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            Set x = medecinPatiens.entrySet();
            x.add(p);
            medecinPatiens.put(m, (ListPatients) x);
        } else {
            System.out.println("Medecin n'existe pas !");
        }
    }

    public void afficherMap() {
        medecinPatiens.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }

    public void afficherMedcinPatients(Medecin m) {
        var x = medecinPatiens.get(m);

        for (Patient p : x.listP) {
            if (p.getNom() == "Mohamed") {
                System.out.println(p);
            }
        }
    }

    public List<String> RetournerNomPatients() {

        List b = new ArrayList<String>();
        for (Map.Entry<Medecin, ListPatients> entry : medecinPatiens.entrySet()) {

            for (Patient p : entry.getValue().listP) {
                if (p.getNumSecuriteSociale() == 1) {
                    b.add(p.getNom());
                }
            }
        }

        return b;
    }
;
}
