/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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

            Produit q = new Produit(identifiant, libelle, marque, prix);

            if (chercher(q) == true) {
                System.out.println("Produit Existe !");
            } else {
                this.nbrProduits++;
                this.ensprod[this.capacite] = q;
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date dd;
                try {
                    dd = formatter.parse(dateexp);
                    this.ensprod[this.capacite].setDateexp(dd);
                } catch (ParseException ex) {
                    Logger.getLogger(Magasin.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.capacite++;
            }
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
     
    }

    public boolean chercher(Produit p) {
        var x = false;
        if (this.capacite != 0) {
            for (int i = 0; i < this.capacite; i++) {
                x = p.comparer(this.ensprod[i], p);
                if (x == true) {
                    break;
                }
            }
        }
        return x;

    }

    public void supprimerProduit(Produit p) {
        var x = false;
        if (this.capacite != 0) {
            for (int i = 0; i < this.capacite; i++) {
                x = p.comparer(this.ensprod[i], p);
                if (x == true) {
                    for (int j = i; j < this.capacite; j++) {
                        if (j + 1 < this.capacite) {
                            this.ensprod[j] = this.ensprod[j + 1];
                        } else {
                            this.ensprod[j] = null;
                        }

                    }
                    this.capacite--;
                    i = this.capacite;;
                    nbrProduits--;

                }
            }

        }
    }

    public static void comparerMagasin(Magasin p1, Magasin p2) {
        if (p1.getCapacite() > p2.getCapacite()) {
            System.out.println("Magasin " + p1.getIdentifiant() + " ( " + p1.getAddresse() + " ) a plus produits que magasin " + p2.getIdentifiant() + " ( " + p2.getAddresse() + ")");
        } else if (p1.getCapacite() < p2.getCapacite()) {
            System.out.println("Magasin " + p2.getIdentifiant() + " ( " + p2.getAddresse() + " ) a plus produits que magasin " + p1.getIdentifiant() + " ( " + p1.getAddresse() + ")");
        } else {
            System.out.println("Magasin " + p1.getIdentifiant() + " ( " + p1.getAddresse() + " ) a le meme nombre des produits de magasin " + p2.getIdentifiant() + " ( " + p2.getAddresse() + ")");
        }
    }

}
