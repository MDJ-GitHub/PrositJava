/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set;

import java.util.Comparator;

/**
 *
 * @author MDJMi
 */
public class SortById implements Comparator<Enseignant> {
    
        public int compare(Enseignant a, Enseignant b)
    {
 
  return Integer.compare(a.getId(), b.getId());
    }
    
}
