/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.set;

/**
 *
 * @author MDJMi
 */
public class Set {

    public static void main(String[] args) {
        EspritTreeSet x = new EspritTreeSet();

        Enseignant a2 = new Enseignant(2, "Jebali", "Hiba");
        Enseignant a1 = new Enseignant(1, "Link", "Zelda");

        x.ajouterEnseignant(a1);
        x.ajouterEnseignant(a2);
        x.ajouterEnseignant(a2);

        x.displayEnseignants();

    }
}
