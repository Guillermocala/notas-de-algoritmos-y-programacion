/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.ArrayList;

/**
 *
 * @author 57300
 * @param <E>
 */
public interface Grafo<E> {
   void insVertice(E x);
   E obtVertice(int pos);
   void insArista(int vi, int vf, int dato);
   int obtArista(int vi, int vf);
   void elimArista(int vi, int vf);
   int orden();
   ArrayList<E> sucesores(int pos);
   String mostrar();
}
