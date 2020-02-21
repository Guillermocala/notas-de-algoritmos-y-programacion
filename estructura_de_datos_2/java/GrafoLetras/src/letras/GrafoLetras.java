/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import Principal.Grafo;
import Principal.GrafoCollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
//import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author 57300
 */
public class GrafoLetras implements Serializable{
   public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {      
      Grafo<String> gra;
      Persistencia archivo = new Persistencia();
      File recover = new File("archivo.ch");
      if(recover.exists())
      {
         gra = (Grafo<String>) archivo.recuperar("archivo.ch");
      }
      else
      {
         gra = new GrafoCollections<>();
      }
      int sw = 1;
      String temp, temp2, temp3;
      String menu = "1- Insertar vertice \n2- Insertar arista \n3- mostrar \n0- salir";      
      do {
         String opcion = JOptionPane.showInputDialog(menu);
         int opcion2 = Integer.parseInt(opcion);
         switch(opcion2)
         {
            case 1:
               temp = JOptionPane.showInputDialog(null, "Ingrese el dato del vertice: ");
               gra.insVertice(temp);
               break;
            case 2:
               temp = JOptionPane.showInputDialog(null, "Ingrese el num del vertice de partida: ");
               int data = Integer.parseInt(temp);
               temp2 = JOptionPane.showInputDialog(null, "Ingrese el num del vertice de llegada: ");
               int data2 = Integer.parseInt(temp2);
               temp3 = JOptionPane.showInputDialog(null, "Ingrese el dato: ");
               int data3 = Integer.parseInt(temp3);
               
               gra.insArista(data, data2, data3);
               break;
            case 3:               
               JOptionPane.showMessageDialog(null, gra.mostrar());
               break;
            case 0:
               sw = 0;
               archivo.guardar(gra);
               break;
            default:
               JOptionPane.showMessageDialog(null, "Dato incorrecto!");
               break;
         }
      } while(sw != 0);
   }
}
