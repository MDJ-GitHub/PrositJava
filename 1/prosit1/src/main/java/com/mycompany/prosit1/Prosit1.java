/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prosit1;

/**
 *
 * @author MDJMi
 */
import java.text.ParseException;

public class Prosit1 {

    public static void main(String[] args) throws ParseException {
        System.out.println("Prosit 1 : ////");

        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Lait", "Vitalait");
        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200);

        p1.AfficherDetails();
        p2.AfficherDetails();
        p3.AfficherDetails();

        p1.setPrix(0.700);

        p2.setPrix(0.500);

        System.out.println("/// Avec Modification ///");
        p2.AfficherDetails();
        p3.AfficherDetails();

        System.out.println("/// Avec toString ///");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p1.setDateexp("28-9-2022");
        p2.setDateexp("25-9-2022");
        p3.setDateexp("30-11-2022");

        System.out.println("/// Avec Date ///");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }

}
