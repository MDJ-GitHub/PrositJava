/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author MDJMi
 */
public class ListEtudiant implements GestionEtudiant {

    ArrayList<Etudiant> list;

    public ListEtudiant() {
        this.list = new ArrayList<Etudiant>();
    }

    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
        consumer = (p) -> System.out.println(list);
        consumer.accept((Etudiant) etudiants);
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons) {
        predicate = (et) -> et.getAge() > 18;
        List<Etudiant> etlist = list.stream().filter(predicate).collect(Collectors.toList());
        cons = (p) -> System.out.println(etlist);
        cons.accept((Etudiant) etudiants);
    }

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
f = str -> Etudiant.getNom() ;
        return str ;
    }

    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
        list.add((Etudiant) supp);
        return (Etudiant) supp;
    }

    @Override
    public Stream convertListStream(List<Etudiant> l) {
        l = list;
        return l.stream();
    }

}
