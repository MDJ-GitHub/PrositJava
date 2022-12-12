/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionhopital;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MDJMi
 */
public class SetMedecins {

    private Set<Medecin> setM;

    public SetMedecins() {
        this.setM = new HashSet<Medecin>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }

    public boolean rechercherMedecin(int cin) {

        return setM.stream().anyMatch((m) -> m.getCin() == cin);

    }

    /* Avec l’api Stream */
    public void afficherMedecins() {
        setM.stream().forEach((t) -> System.out.print(t));
    }

    /* Avec l’api Stream */
    public long nombreMedecins() {
        return setM.stream().count();
    }

}
