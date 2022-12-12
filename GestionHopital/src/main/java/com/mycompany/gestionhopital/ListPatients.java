/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionhopital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author MDJMi
 */
public class ListPatients implements InterfacePatient {

    List<Patient> listP;

    public ListPatients() {
        this.listP = new ArrayList<Patient>();
    }

    @Override
    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    @Override
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    @Override
    public boolean rechercherPatient(Patient p) {
        return listP.stream().anyMatch((a) -> a.equals(p));
    }

    @Override
    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch((p) -> p.getCin() == cin);
    }

    @Override
    public void afficherPatients() {
 listP.stream().forEach((p) -> System.out.print(p));

    }

    @Override
    public void trierPatientsParNom() {
        listP = listP.stream().sorted((p1, p2) -> p1.getNom().compareTo(p2.getNom())).collect(Collectors.toList());
    }

    public void PatientSansRedondance() {
        listP.stream().distinct().forEach((p) -> System.out.print(p));
    }

}
