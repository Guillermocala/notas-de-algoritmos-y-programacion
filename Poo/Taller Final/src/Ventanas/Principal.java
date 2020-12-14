/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Datos.Central;
import Datos.Persistencia;
import Ventanas.Admin.EmpeniadosVencidos;
import Ventanas.Admin.Inventario;
import Ventanas.Admin.ModificaFecha;
import Ventanas.Admin.ReportEmpenio;
import Ventanas.Admin.ReportVentas;
import Ventanas.Empleado.Compra;
import Ventanas.Empleado.Empenio;
import Ventanas.Empleado.Venta;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo
 */
public class Principal extends javax.swing.JFrame {
   private static Central datos;
   
   /**
    * Creates new form Principal
    * @param data
    */
   public Principal(Central data) {
      initComponents();
      this.datos = data;
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jTabbedPane1 = new javax.swing.JTabbedPane();
      jPanel2 = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      jButtonVentas = new javax.swing.JButton();
      jButtonEmpenados = new javax.swing.JButton();
      jButtonInventario = new javax.swing.JButton();
      jButtonEmpenadoVencidos = new javax.swing.JButton();
      jButtonModFecha = new javax.swing.JButton();
      jPanel4 = new javax.swing.JPanel();
      jPanel5 = new javax.swing.JPanel();
      jButtonCompra = new javax.swing.JButton();
      jButtonVenta = new javax.swing.JButton();
      jButtonEmpeno = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("COMPRA Y VENTA");
      setLocation(new java.awt.Point(300, 200));
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));

      jButtonVentas.setText("Reporte de Ventas");
      jButtonVentas.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonVentasActionPerformed(evt);
         }
      });

      jButtonEmpenados.setText("Reporte de Articulos Empeñados");
      jButtonEmpenados.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEmpenadosActionPerformed(evt);
         }
      });

      jButtonInventario.setText("Inventario");
      jButtonInventario.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonInventarioActionPerformed(evt);
         }
      });

      jButtonEmpenadoVencidos.setText("Articulos Empeñados Vencidos");
      jButtonEmpenadoVencidos.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEmpenadoVencidosActionPerformed(evt);
         }
      });

      jButtonModFecha.setText("Modificar Fecha");
      jButtonModFecha.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonModFechaActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(66, 66, 66)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
               .addComponent(jButtonInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButtonEmpenadoVencidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButtonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButtonEmpenados)
               .addComponent(jButtonModFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(192, 192, 192))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addComponent(jButtonInventario)
            .addGap(18, 18, 18)
            .addComponent(jButtonEmpenadoVencidos)
            .addGap(18, 18, 18)
            .addComponent(jButtonVentas)
            .addGap(18, 18, 18)
            .addComponent(jButtonEmpenados)
            .addGap(18, 18, 18)
            .addComponent(jButtonModFecha)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      jTabbedPane1.addTab("Administrador", jPanel2);

      jButtonCompra.setText("Compra de Articulo");
      jButtonCompra.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCompraActionPerformed(evt);
         }
      });

      jButtonVenta.setText("Venta de Articulo");
      jButtonVenta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonVentaActionPerformed(evt);
         }
      });

      jButtonEmpeno.setText("Empeño de Articulo");
      jButtonEmpeno.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEmpenoActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(95, 95, 95)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jButtonVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButtonCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButtonEmpeno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(110, Short.MAX_VALUE))
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addComponent(jButtonCompra)
            .addGap(18, 18, 18)
            .addComponent(jButtonVenta)
            .addGap(18, 18, 18)
            .addComponent(jButtonEmpeno)
            .addContainerGap(104, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      jTabbedPane1.addTab("Empleado", jPanel4);

      jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel1.setText("Compra y venta la U");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(87, 87, 87)
            .addComponent(jLabel1)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(jTabbedPane1))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentasActionPerformed
      if (datos.getVendidos().isEmpty()) {
         JOptionPane.showMessageDialog(null, "No hay datos para mostrar");
      }
      else{
         ReportVentas ventanaRepoVen = new ReportVentas(datos);
         ventanaRepoVen.setVisible(true);
         dispose();
      }
   }//GEN-LAST:event_jButtonVentasActionPerformed

   private void jButtonEmpenadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpenadosActionPerformed
      if (datos.getEmpeniados().isEmpty()) {
         JOptionPane.showMessageDialog(null, "No hay datos para mostrar");
      }
      else{
         ReportEmpenio ventanaRepoEmpe = new ReportEmpenio(datos);
         ventanaRepoEmpe.setVisible(true);
         dispose();
      }
     
   }//GEN-LAST:event_jButtonEmpenadosActionPerformed

   private void jButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventarioActionPerformed
      if (datos.getInventario().isEmpty()) {
         JOptionPane.showMessageDialog(null, "No hay datos para mostrar");
      }
      else{
         Inventario ventanaInven = new Inventario(datos);
         ventanaInven.setVisible(true);
         dispose();
      }
   }//GEN-LAST:event_jButtonInventarioActionPerformed

   private void jButtonEmpenadoVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpenadoVencidosActionPerformed
      if (datos.getEmpeniadosVencidos().isEmpty()) {
         JOptionPane.showMessageDialog(null, "No hay datos para mostrar");
      }
      else{
         EmpeniadosVencidos ventanaEmpe = new EmpeniadosVencidos(datos);
         ventanaEmpe.setVisible(true);
         dispose();
      }
   }//GEN-LAST:event_jButtonEmpenadoVencidosActionPerformed

   private void jButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompraActionPerformed
      Compra ventanaCompra = new Compra(datos);
      ventanaCompra.setVisible(true);
      dispose();
   }//GEN-LAST:event_jButtonCompraActionPerformed

   private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
      if (datos.inventario().isEmpty()) {
         JOptionPane.showMessageDialog(null, "No hay articulos para vender");
      }
      else{
         Venta ventanaVenta = new Venta(datos);
         ventanaVenta.setVisible(true);
         dispose();
      }
   }//GEN-LAST:event_jButtonVentaActionPerformed

   private void jButtonEmpenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpenoActionPerformed
      Empenio ventanaEmpe = new Empenio(datos);
      ventanaEmpe.setVisible(true);
      dispose();
   }//GEN-LAST:event_jButtonEmpenoActionPerformed

   private void jButtonModFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModFechaActionPerformed
      ModificaFecha ventanaMod = new ModificaFecha(datos);
      ventanaMod.setVisible(true);
      dispose();
   }//GEN-LAST:event_jButtonModFechaActionPerformed
 
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException {
      Persistencia archivo = new Persistencia();
      File angel = new File("informacion.ch");
      if (angel.exists()) {
         datos = archivo.recuperar("informacion.ch");
         System.out.println("informacion cargada");
      }
      else{
         datos = new Datos.Central();
         System.out.println("creando archivo");
      }
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Principal(datos).setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButtonCompra;
   private javax.swing.JButton jButtonEmpenadoVencidos;
   private javax.swing.JButton jButtonEmpenados;
   private javax.swing.JButton jButtonEmpeno;
   private javax.swing.JButton jButtonInventario;
   private javax.swing.JButton jButtonModFecha;
   private javax.swing.JButton jButtonVenta;
   private javax.swing.JButton jButtonVentas;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JTabbedPane jTabbedPane1;
   // End of variables declaration//GEN-END:variables
}
