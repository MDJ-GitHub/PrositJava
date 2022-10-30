/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prosit6;

/**
 *
 * @author MDJMi
 */
public class Prosit6 {

    public static void main(String[] args) {
        try {
        Produit p3 = new Produit(3250, "Tomate", "Sicam", -1.200);

        Magasin mg1 = new Magasin(1, "Carrefour", "Centre-Ville");
        mg1.ajouterProduit(p3);
        
        } catch (Exception e){

		}
        
        

    }
}
