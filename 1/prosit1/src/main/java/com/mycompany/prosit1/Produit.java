/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit1;

/**
 *
 * @author MDJMi
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Produit {

    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateexp;

    Produit(int i, String l, String m) {
        this.identifiant = i;
        this.libelle = l;
        this.marque = m;
    }

    Produit(int i, String l, String m, double p) {
        this.identifiant = i;
        this.libelle = l;
        this.marque = m;
        this.prix = p;
    }

    public void AfficherDetails() {
        System.out.println(this.identifiant + ", " + this.libelle + ", " + this.libelle + ", " + this.prix + ", " + this.dateexp);
    }

    public void setPrix(double p) {
        this.prix = p;
    }
    

        public String toString() {
        return (this.identifiant + ", " + this.libelle + ", " + this.libelle + ", " + this.prix + ", " + this.dateexp);
    }

    public void setDateexp(String d) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dd = formatter.parse(d);
        this.dateexp = dd;
    }

    public double getPrix() {
        return this.prix;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public String getMarque() {
        return this.marque;
    }

}
