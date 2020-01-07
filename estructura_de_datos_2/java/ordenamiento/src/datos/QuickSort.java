/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author 57300
 */
public class QuickSort {
   public int[] generarVec(int n) {
      int v[] = new int[n];
      for (int i = 0; i < v.length; i++) {
         v[i] = (int) (Math.random() * 1000);
      }
      return v;
   }
   public String mostrarVec(int v[]) {
      String lis = "";
      for (int i = 0; i < v.length; i++) {
         lis += v[i] + " - "; 
      }
      return lis;
   }
   public void ordenarVec(int v[], int ini, int fin) {      
      int pivot = v[ini];
      int i = ini;
      int j = fin;
      int temp;
      while (i < j) {
         while (v[i] <= pivot && i<j) i++;
         while (v[j] > pivot) j--;  
         if (i < j) {
            temp = v[i];
            v[i] = v[j];
            v[j] = temp;
         }
      }
      v[ini] = v[j];
      v[j] = pivot;
      if (ini < (j - 1)) {
         ordenarVec(v, ini, (j - 1));
      }
      else if ((j + 1) < fin) {
         ordenarVec(v, j + 1, fin);
      }
   }
   public LinkedList<Integer> generarList(int n) {
      LinkedList<Integer> lista = new LinkedList<>();
      for (int i = 0; i < n; i++) {
         lista.add((int) (Math.random() * 1000));
      }
      return lista;
   }
   public String mostrarList(LinkedList<Integer> temp) {
      String lis = "";
      for (int i = 0; i < temp.size(); i++) {
         lis += temp.get(i) + " - "; 
      }
      return lis;
   }
   public void ordenarList(LinkedList<Integer> lis, int ini, int fin) {
      int pivot = lis.get(ini);
      int i = ini;
      int j = fin;
      int temp;
      while (i < j) {
         while (lis.get(i) <= pivot && i < j) i++;
         while (lis.get(j) > pivot) j--;  
         if (i < j) {
            temp = lis.get(i);
            lis.set(i, lis.get(j));
            lis.set(j, temp);
         }
      }
      lis.set(ini, lis.get(j));
      lis.set(j, lis.get(j));      
      if (ini < (j - 1)) {
         ordenarList(lis, ini, (j - 1));
      }
      else if ((j + 1) < fin) {
         ordenarList(lis, j + 1, fin);
      }
   }
   public ArrayList<Integer> generarCol(int n) {
      ArrayList<Integer> lista = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         lista.add((int) (Math.random() * 1000));
      }
      return lista;
   }
   public String mostrarCol(ArrayList<Integer> temp) {
      String lis = "";
      for (int i = 0; i < temp.size(); i++) {
         lis += temp.get(i) + " - "; 
      }
      return lis;
   }
   public void ordenarCol(ArrayList<Integer> lis, int ini, int fin) {
      int pivot = lis.get(ini);
      int i = ini;
      int j = fin;
      int temp;
      while (i < j) {
         while (lis.get(i) <= pivot && i<j) i++;
         while (lis.get(j) > pivot) j--;  
         if (i < j) {
            temp = lis.get(i);
            lis.set(i, lis.get(j));
            lis.set(j, temp);            
         }
      }
      lis.set(ini, lis.get(j));
      lis.set(j, pivot);
      if (ini < (j - 1)) {
         ordenarCol(lis, ini, (j - 1));
      }
      else if ((j + 1) < fin) {
         ordenarCol(lis, j + 1, fin);
      }
   }
   public static void main(String[] args) {
      QuickSort nuevo = new QuickSort();     
      String showMe, tamanio;
      int sw = 1, tamanio1;
      JTextArea textarea;
      JScrollPane scroll;
      String menu = "QUICKSORT SORTING METHOD\n1- Vector \n2- List \n3- Collection \n0- Exit";      
      do {
         showMe = "";
         String opcion = JOptionPane.showInputDialog(menu);
         int opcion2 = Integer.parseInt(opcion);
         switch(opcion2)
         {
            case 1:
               tamanio = JOptionPane.showInputDialog("Enter the length: ");
               tamanio1 = Integer.parseInt(tamanio);
               int vector[] = nuevo.generarVec(tamanio1);
               showMe += nuevo.mostrarVec(vector);
               long timeInit = System.nanoTime();
               nuevo.ordenarVec(vector, 0, (vector.length - 1));
               long timeFinal = System.nanoTime();
               long timeElapsed = timeFinal - timeInit;
               showMe += "\nOrdered\n" + nuevo.mostrarVec(vector);
               showMe += "\nTime elapsed: " + timeElapsed + " Nanoseconds";
               textarea = new JTextArea(showMe);
               scroll = new JScrollPane(textarea);
               textarea.setLineWrap(true);
               scroll.setPreferredSize(new Dimension(600, 600));
               JOptionPane.showMessageDialog(null, scroll, "Quicksort Vect", 0);
               break;
            case 2:
               tamanio = JOptionPane.showInputDialog("Enter the length: ");
               tamanio1 = Integer.parseInt(tamanio);
               LinkedList<Integer> lista2 = nuevo.generarList(tamanio1);               
               showMe += nuevo.mostrarList(lista2);
               timeInit = System.nanoTime();
               nuevo.ordenarList(lista2, 0, (lista2.size() - 1));
               timeFinal = System.nanoTime();
               timeElapsed = timeFinal - timeInit;
               showMe += "\nOrdered\n" + nuevo.mostrarList(lista2);
               showMe += "\nTime elapsed: " + timeElapsed + " Nanoseconds";
               textarea = new JTextArea(showMe);
               scroll = new JScrollPane(textarea);
               textarea.setLineWrap(true);
               scroll.setPreferredSize(new Dimension(600, 600));
               JOptionPane.showMessageDialog(null, scroll, "Quicksort List", 0);
               break;
            case 3:
               tamanio = JOptionPane.showInputDialog("Enter the length: ");
               tamanio1 = Integer.parseInt(tamanio);
               ArrayList<Integer> col = nuevo.generarCol(tamanio1);
               showMe += nuevo.mostrarCol(col);
               timeInit = System.nanoTime();
               nuevo.ordenarCol(col, 0, (col.size() - 1));
               timeFinal = System.nanoTime();
               timeElapsed = timeFinal - timeInit;
               showMe += "\nOrdered\n" + nuevo.mostrarCol(col);
               showMe += "\nTime elapsed: " + timeElapsed + " Nanoseconds";
               textarea = new JTextArea(showMe);
               scroll = new JScrollPane(textarea);
               textarea.setLineWrap(true);
               scroll.setPreferredSize(new Dimension(600, 600));
               JOptionPane.showMessageDialog(null, scroll, "Quicksort Collections", 0);
               break;
            case 0:
               sw = 0;               
               break;
            default:
               JOptionPane.showMessageDialog(null, "Dato incorrecto!");
               break;
         }
      } while(sw != 0);
   }
}
