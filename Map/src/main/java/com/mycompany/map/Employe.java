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
public class Employe implements Comparator<Employe>  {

    private int cin;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe() {
    }

    public Employe(int cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public boolean equals(Object obj) {
        final Employe other = (Employe) obj;
        return this.cin == other.cin;
    }
    
    public int compare(Employe a, Employe b) {

        return Integer.compare(a.getCin(), b.getCin());
    }

    @Override
    public int hashCode() {
        return 5*this.cin*3+1/5-2*10 ;
    }
    

}
