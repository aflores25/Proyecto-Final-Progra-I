/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logina;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrea
 */
public class ConsultaProfesor extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaProfesor
     */
    public ConsultaProfesor() {
        initComponents();

        DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre", "Apellido", "Especialidad", "Usuario", "Password"}, LoginA.profesores.size());
        jTable1.setModel(data);

        int row = 0;

        for (Profesor p : LoginA.profesores) {
            jTable1.setValueAt(p.nombre, row, 0);
            jTable1.setValueAt(p.apellido, row, 1);
            jTable1.setValueAt(p.especialidad, row, 2);
            jTable1.setValueAt(p.usuario, row, 3);
            jTable1.setValueAt(p.password, row, 4);
            row++;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PROFESORES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Carga Masiva CSV");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guardar Archivo CSV");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EditarProfesor p = new EditarProfesor(jTable1.getSelectedRow());
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this, "Cargar");
        if (retorno == JFileChooser.APPROVE_OPTION) {
            leerArchivoTextoProfesores(archivo.getSelectedFile().toPath().toString());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String datos = new String();
        for(Profesor p: LoginA.profesores){
            
            datos+= p.usuario +",";
            datos+= p.nombre+",";
            datos+= p.apellido+",";
            datos+= p.password+",";
            datos+= p.especialidad+"\n";
        }
        
        
       JFileChooser archivo = new JFileChooser();
       int retorno = archivo.showDialog(this, "Cargar");
       if(retorno==JFileChooser.APPROVE_OPTION){
           generarArchivo(archivo.getSelectedFile().toPath().toString(),datos);
       }
    }//GEN-LAST:event_jButton4ActionPerformed
    public void leerArchivoTextoProfesores(String rutaConNombre) {
        try {
            File f = new File(rutaConNombre);
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Profesor p = new Profesor();
                p.nombre = datos[0];
                p.apellido = datos[1];
                p.especialidad = datos[2];
                p.usuario = datos[3];
                p.password = datos[4];
                LoginA.profesores.add(p);

            }
            DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre", "Apellido", "Especialidad", "Usuario", "Password"}, LoginA.profesores.size());
            jTable1.setModel(data);

            int row = 0;

            for (Profesor p : LoginA.profesores) {
                jTable1.setValueAt(p.nombre, row, 0);
                jTable1.setValueAt(p.apellido, row, 1);
                jTable1.setValueAt(p.especialidad, row, 2);
                jTable1.setValueAt(p.usuario, row, 3);
                jTable1.setValueAt(p.password, row, 4);
                row++;
            }
            fr.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void generarArchivo (String ruta, String datos){
        try{
            FileWriter fw = new FileWriter(ruta);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(datos);
            pw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}