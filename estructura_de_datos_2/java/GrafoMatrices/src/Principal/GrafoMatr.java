/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 57300
 */
public class GrafoMatr<E> implements Grafo<E>, Serializable{
   private int[][] aristas = new int[100][100];
   private ArrayList<E> vertices = new ArrayList();
   
   public GrafoMatr() {
      for(int i = 0; i < 100; ++i) {
         for(int j = 0; j < 100; ++j) {
            if (i != j) {
               this.aristas[i][j] = 999999;
            }
         }
      }

   }
   
   @Override
   public void insVertice(E x) {
      this.vertices.add(x);
   }

   @Override
   public E obtVertice(int pos) {
      return this.vertices.get(pos);
   }

   @Override
   public void insArista(int vI, int vF, int dato) {
      this.aristas[vI][vF] = dato;
   }

   @Override
   public int obtArista(int vI, int vF) {
      return this.aristas[vI][vF];
   }

   @Override
   public void elimArista(int vI, int vF) {
      this.aristas[vI][vF] = 999999;
   }

   @Override
   public int orden() {
      return this.vertices.size();
   }

   @Override
   public ArrayList<E> sucesores(int pos) {
      ArrayList<E> suces = new ArrayList();
      for(int i = 0; i < this.orden(); ++i) {
         if (this.aristas[pos][i] != 999999 && i != pos) {
            suces.add(this.obtVertice(i));
         }
      }
      return suces;
   }

   @Override
   public String mostrar() {
      String con = "";
      for(int i = 0; i < this.orden(); ++i) {
         con += "Vertice: " + this.obtVertice(i);
         for(int j = 0; j < this.orden(); ++j) {
            con += "-" + this.obtArista(i, j);
         }
         con +="\n";
      }
      return con;
   }
}
