/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.Admin;

import Datos.Central;
import Ventanas.Principal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guillermo
 */
public class ReportEmpenio extends javax.swing.JFrame {
   private static Central datos;
   /**
    * Creates new form ReportEmpenio
    * @param data
    */
   public ReportEmpenio(Central data) {
      initComponents();
      this.datos = data;
      llenaTabla();
      this.setLocationRelativeTo(null);
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
      jButtonAtras = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTableEmpenados = new javax.swing.JTable();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Reporte de Articulos Empeñados");
      setLocation(new java.awt.Point(0, 0));
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setPreferredSize(new java.awt.Dimension(670, 400));

      jButtonAtras.setText("Atras");
      jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAtrasActionPerformed(evt);
         }
      });

      jTableEmpenados.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "N°", "Nombre", "Precio", "Fecha Ingreso", "Fecha Retiro", "Cantidad"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
         };
         boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jScrollPane1.setViewportView(jTableEmpenados);
      if (jTableEmpenados.getColumnModel().getColumnCount() > 0) {
         jTableEmpenados.getColumnModel().getColumn(0).setResizable(false);
         jTableEmpenados.getColumnModel().getColumn(0).setPreferredWidth(7);
         jTableEmpenados.getColumnModel().getColumn(1).setResizable(false);
         jTableEmpenados.getColumnModel().getColumn(1).setPreferredWidth(250);
         jTableEmpenados.getColumnModel().getColumn(2).setResizable(false);
         jTableEmpenados.getColumnModel().getColumn(2).setPreferredWidth(50);
         jTableEmpenados.getColumnModel().getColumn(3).setResizable(false);
         jTableEmpenados.getColumnModel().getColumn(3).setPreferredWidth(100);
         jTableEmpenados.getColumnModel().getColumn(4).setResizable(false);
         jTableEmpenados.getColumnModel().getColumn(4).setPreferredWidth(100);
         jTableEmpenados.getColumnModel().getColumn(5).setResizable(false);
         jTableEmpenados.getColumnModel().getColumn(5).setPreferredWidth(50);
      }

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jButtonAtras)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(jButtonAtras)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
      Principal princi = new Principal(datos);
      princi.setVisible(true);
      dispose();
   }//GEN-LAST:event_jButtonAtrasActionPerformed
   private void llenaTabla(){
      DefaultTableModel modelo = (DefaultTableModel) jTableEmpenados.getModel();
      for (int i = 0; i < datos.getEmpeniados().size(); i++) {
         modelo.addRow(new Object[]{(i + 1), datos.getEmpeniados().get(i).getNombre(), datos.getEmpeniados().get(i).getValor()
                 , datos.getEmpeniados().get(i).getFechaIngreso(), datos.getEmpeniados().get(i).getFechaSalida(), 
                 datos.getEmpeniados().get(i).getCantidad()});
      }
   }
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(ReportEmpenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(ReportEmpenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(ReportEmpenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(ReportEmpenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new ReportEmpenio(datos).setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButtonAtras;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTableEmpenados;
   // End of variables declaration//GEN-END:variables
}
