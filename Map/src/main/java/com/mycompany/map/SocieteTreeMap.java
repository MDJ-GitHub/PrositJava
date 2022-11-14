/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.TreeMap;

/**
 *
 * @author MDJMi
 */
public class SocieteTreeMap implements InterfaceSociete{

        TreeMap<Employe, Departement> tmap;

    public SocieteTreeMap() {
        tmap = new TreeMap<Employe, Departement>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        tmap.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        tmap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (java.util.Map.Entry<Employe, Departement> e : tmap.entrySet()) {
            System.out.println(e);
        }

    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : tmap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : tmap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.print(tmap.get(e));

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
     return tmap.containsKey(e) ;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
      return tmap.containsValue(e) ; 
    }

}

