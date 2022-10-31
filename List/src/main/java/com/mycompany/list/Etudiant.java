/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.list;

/**
 *
 * @author MDJMi
 */
public class Etudiant {
    private int id;
    private String nom ;
    private String prenom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public boolean equals(Object obj) {
        return ( ((Etudiant)obj).id == this.id) ;
    }

    @Override
    public String toString() {
        return ("Etudiant "+this.id+ " : "+this.prenom+" "+this.nom) ;
    }
    
    
}
