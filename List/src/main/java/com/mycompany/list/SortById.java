/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.list;

import java.util.Comparator;

/**
 *
 * @author MDJMi
 */
public class SortById implements Comparator<Etudiant> {
    
        public int compare(Etudiant a, Etudiant b)
    {
 
  return Integer.compare(a.getId(), b.getId());
    }
    
}
