/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit6;

import java.text.ParseException;

/**
 *
 * @author MDJMi
 */
public class ProduitFruit extends Produit implements Critere {

    private String saison;
    private float quantite;

    public ProduitFruit(int identifiant, String libelle, String marque, double prix, String dateexp, String saison, float quantite) throws ParseException {
        super(identifiant, libelle, marque, prix, dateexp);
        this.saison = saison;
        this.quantite = quantite;
    }

    public String getSaison() {
        return this.saison;
    }

    public float getQuantite() {
        return this.quantite;
    }

    public boolean estFrais(String saison) {
        if (saison == this.saison) {
            return true;
        } else {
            return false;
        }
    }
}

