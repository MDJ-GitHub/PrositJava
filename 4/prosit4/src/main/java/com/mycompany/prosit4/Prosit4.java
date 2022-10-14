/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prosit4;

/**
 *
 * @author MDJMi
 */
public class Prosit4 {

    public static void main(String[] args) {
        

        Magasin mg1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin mg2 = new Magasin(2, "Monoprix", "Menzah 6");

        
        Caissier c1 = new Caissier(11234567, "Ahmed", "Tunis", 200,1);
        Caissier c2 = new Caissier(11234564, "Mohsen", "Borj Cedria", 170, 2);
        Vendeur v1 = new Vendeur(11234511, "Khmais", "Hammam Lif", 120, 100);
        Responsable r1 = new Responsable(11234211, "Marwen", "Bir Bai", 170, 20);

        Caissier c3 = new Caissier(31224567, "Ahmed", "Tunis", 122, 1);
        Vendeur v2 = new Vendeur(41234773, "Ghasan", "Hammamet", 50, 25);
        Vendeur v3 = new Vendeur(51134511, "Rami", "Tunis", 52, 18);
        Vendeur v4 = new Vendeur(41334511, "Amine", "Hammam Lif", 52, 15);
        Responsable r2 = new Responsable(11114211, "Soufien", "Megrin", 140, 10);
        
        mg1.ajouterEmployee(c1);
        mg1.ajouterEmployee(c2);
        mg1.ajouterEmployee(v1);
        mg1.ajouterEmployee(r1);

        mg2.ajouterEmployee(c3);
        mg2.ajouterEmployee(v2);
        mg2.ajouterEmployee(v3);
        mg2.ajouterEmployee(v4);
        mg2.ajouterEmployee(r2);

        
        mg1.ajouterProduit(1, "Lait", "Delice", 1200, "20-11-2022");
        mg1.ajouterProduit(2, "Yagourt", "Delice", 400, "15-11-2022");
        
        mg2.ajouterProduit(5, "Chocolate", "Said", 2000, "20-11-2022");
        mg2.ajouterProduit(7, "Yagourt", "Natile", 450, "15-11-2022");


        mg1.afficherChara();
        mg2.afficherChara();
        System.out.println("nombre total des produits dans tous magasin : " + Magasin.nbrProduits);

        
        c1.AfficherSalaire();
        c2.AfficherSalaire();
        v1.AfficherSalaire();
        r1.AfficherSalaire();
        c3.AfficherSalaire();
        v2.AfficherSalaire();
        v3.AfficherSalaire();
        v4.AfficherSalaire();
        r2.AfficherSalaire();

    }
}
