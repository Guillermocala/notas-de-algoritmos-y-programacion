/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author 57300
 */
public class Materia {
   private int codigo;
   private String nombre;
   private int creditos;
   private int nota;
   private int semestre;

   /**
    * @return the codigo
    */
   public int getCodigo() {
      return codigo;
   }

   /**
    * @param codigo the codigo to set
    */
   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   /**
    * @return the nombre
    */
   public String getNombre() {
      return nombre;
   }

   /**
    * @param nombre the nombre to set
    */
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   /**
    * @return the creditos
    */
   public int getCreditos() {
      return creditos;
   }

   /**
    * @param creditos the creditos to set
    */
   public void setCreditos(int creditos) {
      this.creditos = creditos;
   }

   /**
    * @return the nota
    */
   public int getNota() {
      return nota;
   }

   /**
    * @param nota the nota to set
    */
   public void setNota(int nota) {
      this.nota = nota;
   }

   /**
    * @return the semestre
    */
   public int getSemestre() {
      return semestre;
   }

   /**
    * @param semestre the semestre to set
    */
   public void setSemestre(int semestre) {
      this.semestre = semestre;
   }
}
