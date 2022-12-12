/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestionhopital;

/**
 *
 * @author MDJMi
 */
public interface InterfacePatient {
    public void ajouterPatient(Patient p);
public void supprimerPatient(Patient p);
public boolean rechercherPatient(Patient p);
public boolean rechercherPatient(int cin);
public void afficherPatients();
public void trierPatientsParNom();
    
}
