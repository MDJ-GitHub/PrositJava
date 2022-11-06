/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author MDJMi
 */

public class EspritArrayList implements University {
    ArrayList <Etudiant> list ;

    @Override
    public void ajouterEtudiant(Etudiant e) {
       list.add(e) ;
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return list.contains(e) ;
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        return list.contains(nom) ;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        list.remove(e) ;
    }

    @Override
    public void displayEtudiants() {
      System.out.println(list);
    }

    @Override
    public void trierEtudiantsParId() {
            Collections.sort(list,new SortById()) ;
    }

    @Override
    public void trierEtudiantsParNom() {
           Collections.sort(list,new SortByNom()) ;
    }
    

    
}



