/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.list;

/**
 *
 * @author MDJMi
 */
public interface University {
public void ajouterEtudiant(Etudiant e);
public boolean rechercherEtudiant(Etudiant e);
public boolean rechercherEtudiant(String nom);
public void supprimerEtudiant(Etudiant e);
public void displayEtudiants();
public void trierEtudiantsParId();
public void trierEtudiantsParNom();
    
}
