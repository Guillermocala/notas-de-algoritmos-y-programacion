/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ESTUDIANTE
 */
public class Persistencia {
   public void guardar(ArbolMaterias x) throws FileNotFoundException, IOException {
      ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("archivo.ch"));
      ob.writeObject(x);
      ob.close();
   }
   public ArbolMaterias recuperar(String nom) throws FileNotFoundException, IOException, ClassNotFoundException{
      ObjectInputStream ob = new ObjectInputStream(new FileInputStream(nom));
      ArbolMaterias ar = (ArbolMaterias) ob.readObject();
      ob.close();
      return ar;
   }
   public void guardarEst(String x) throws FileNotFoundException, IOException {
      ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("archivoEst.ch"));
      ob.writeObject(x);
      ob.close();
   }
   public String recuperarEst(String nom) throws FileNotFoundException, IOException, ClassNotFoundException{
      ObjectInputStream ob = new ObjectInputStream(new FileInputStream(nom));
      String ar = (String) ob.readObject();
      ob.close();
      return ar;
   }
   public void guardarCod(String x) throws FileNotFoundException, IOException {
      ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("archivoCod.ch"));
      ob.writeObject(x);
      ob.close();
   }
   public String recuperarCod(String nom) throws FileNotFoundException, IOException, ClassNotFoundException{
      ObjectInputStream ob = new ObjectInputStream(new FileInputStream(nom));
      String ar = (String) ob.readObject();
      ob.close();
      return ar;
   }
}
