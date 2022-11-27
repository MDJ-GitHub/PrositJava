/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author MDJMi
 */

public interface GestionEtudiant {

public void afficherEtudiants(List<Etudiant> etudiants,
Consumer<Etudiant> consumer);

public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants,
Predicate<Etudiant> predicate, Consumer<Etudiant> cons);

public String afficherNomEtudiant(List<Etudiant> etudiants,
Function<Etudiant, String> f);

public Etudiant creeEtudiant(Supplier<Etudiant> supp);

public Stream convertListStream(List<Etudiant> l);
}
