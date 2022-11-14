/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.Comparator;

/**
 *
 * @author MDJMi
 */
public class Departement implements Comparator<Departement> {

    private int identifiant;
    private String nom;

    public Departement() {
    }

    public Departement(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" + "identifiant=" + identifiant + ", nom=" + nom + '}';
    }

    @Override
    public boolean equals(Object obj) {
        final Departement other = (Departement) obj;
        return this.identifiant == other.identifiant;
    }

    public int compare(Departement a, Departement b) {

        return Integer.compare(a.getIdentifiant(), b.getIdentifiant());
    }
    
        @Override
    public int hashCode() {
        return 10*this.identifiant*3+1/5-2*10 ;
    }

}
