/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prosit3;

/**
 *
 * @author MDJMi
 */
public class Prosit3 {

    public static void main(String[] args) {
        Magasin mg = new Magasin(1, "MG Borj Cedria");
        mg.ajouterProduit(1, "Lait", "Delice", 1200, "20-11-2022");
        mg.ajouterProduit(7, "Yagourt", "Delice", 400, "15-11-2022");
        mg.ajouterProduit(1, "Lait", "Delice", 1200, "20-11-2022");
        mg.afficherChara();
        Produit p = new Produit(1, "Lait", "MG Borj Cedria", 1200);
        mg.supprimerProduit(p);
        mg.afficherChara();
        Magasin mg2 = new Magasin(2, "MG Borj Cedria");
        mg2.ajouterProduit(1, "Lait", "Delice", 1200, "20-11-2022");
        mg2.ajouterProduit(2, "Lait", "Delice", 1200, "20-11-2022");
        mg.comparerMagasin(mg, mg2);
        System.out.println("nombre total des produits dans tous magasin : " + Magasin.nbrProduits);

    }
}
