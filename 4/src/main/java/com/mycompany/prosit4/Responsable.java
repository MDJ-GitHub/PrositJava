/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit4;

/**
 *
 * @author MDJMi
 */
public class Responsable extends Employe {

    private float prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, float prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public void AfficherDetails() {
        System.out.println(this.getIdentifiant() + ", " + this.getNom() + ", " + this.getAdresse() + ", " + this.getNbr_heures() + ", " + this.prime);
    }

    public void AfficherSalaire() {

        if (this.getNbr_heures() > 160) {
            System.out.println("la salaire de l'employee (responsable) " + this.getIdentifiant() + " ( " + this.getNom() + " ) : " + ((160 * 10) + this.prime + ((this.getNbr_heures() - 160) * 12)));
        } else {
            System.out.println("la salaire de l'employee (responsable) " + this.getIdentifiant() + " ( " + this.getNom() + " ) : " + ((this.getNbr_heures() * 10) + this.prime));
        }

    }
}
