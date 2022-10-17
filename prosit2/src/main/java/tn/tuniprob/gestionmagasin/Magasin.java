/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MDJMi
 */
public class Magasin {

    private int identifiant;
    private String addresse;
    private int capacite = 0;
    private Produit[] ensprod = new Produit[50];
    public static int nbrProduits = 0;

    Magasin(int identifiant, String addresse) {
        this.identifiant = identifiant;
        this.addresse = addresse;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void ajouterProduit(int identifiant, String libelle, String marque, double prix, String dateexp) {
        if (this.capacite < 50) {
            this.nbrProduits++;
            this.ensprod[this.capacite] = new Produit();
            this.ensprod[this.capacite].setIdentifiant(identifiant);
            this.ensprod[this.capacite].setLibelle(libelle);
            this.ensprod[this.capacite].setMarque(marque);
            this.ensprod[this.capacite].setPrix(prix);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date dd;
            try {
                dd = formatter.parse(dateexp);
                this.ensprod[this.capacite].setDateexp(dd);
            } catch (ParseException ex) {
                Logger.getLogger(Magasin.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.capacite++;
        } else {
            System.out.println("Capacité Max !");
        }

    }

    public void afficherChara() {
        System.out.println("Magasin no : " + this.identifiant + " | " + this.addresse + " | " + this.capacite);
        System.out.println("ces produits ----- : ");
        for (int i = 0; i <= this.capacite - 1; i++) {
            System.out.println("Produit no : " + this.ensprod[i].getIdentifiant() + " | " + this.ensprod[i].getLibelle() + " | " + this.ensprod[i].getPrix() + " | " + this.ensprod[i].getDateexp());
        }
        System.out.println("nombre total des produits : " + this.nbrProduits);
    }

}
