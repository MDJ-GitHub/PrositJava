/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MDJMi
 */
public class SocieteHashMap implements InterfaceSociete {

    HashMap<Employe, Departement> hmap;

    public SocieteHashMap() {
        hmap = new HashMap<Employe, Departement>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hmap.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        hmap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> e : hmap.entrySet()) {
            System.out.println(e);
        }

    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : hmap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : hmap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.print(hmap.get(e));

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
     return hmap.containsKey(e) ;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
      return hmap.containsValue(e) ; 
    }

}
