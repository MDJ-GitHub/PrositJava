/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author MDJMi
 */
public class Prosit2 {

    public static void main(String[] args) {
        Magasin mg = new Magasin(1, "MG Borj Cedria");
        mg.ajouterProduit(1, "Lait", "Delice", 1200, "20-11-2022");
        mg.ajouterProduit(7, "Yagourt", "Delice", 400, "15-11-2022");
                mg.ajouterProduit(1, "Lait", "Delice", 1200, "20-11-2022");
        mg.afficherChara();
    }
}
