/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.ricardocolindres.vista;
import org.ricardocolindres.controlador.ControlDoctor;
import org.ricardocolindres.modelo.Doctor;

/**
 * Clase que contiene la Vista de Eliminar Doctor
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 * @see Doctor
 * @see ControlDoctor
 */
public class VistaEliminarDoctor extends javax.swing.JInternalFrame {
    /**
     * instancias nuevas
     */
    Doctor doctor = new Doctor();
    public ControlDoctor controlador = ControlDoctor.getInstancia();
    /**
     * Creates new form VistaEliminarDoctor
     */
    public VistaEliminarDoctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEliminarDoctor = new javax.swing.JPanel();
        lblIdDoctorEliminar = new javax.swing.JLabel();
        txtIdDoctorEliminar = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblIdDoctorEliminar.setText("Id del Doctor a Eliminar");

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarDoctorLayout = new javax.swing.GroupLayout(panelEliminarDoctor);
        panelEliminarDoctor.setLayout(panelEliminarDoctorLayout);
        panelEliminarDoctorLayout.setHorizontalGroup(
            panelEliminarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarDoctorLayout.createSequentialGroup()
                .addGroup(panelEliminarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEliminarDoctorLayout.createSequentialGroup()
                        .addComponent(lblIdDoctorEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdDoctorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelEliminarDoctorLayout.setVerticalGroup(
            panelEliminarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarDoctorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelEliminarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdDoctorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdDoctorEliminar))
                .addGap(26, 26, 26)
                .addComponent(botonEliminar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEliminarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEliminarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        /**
         * obtener los datos
         */

// TODO add your handling code here:
         controlador.eliminarDoctor(doctor);
        txtIdDoctorEliminar.setText(String.valueOf(doctor.getId()));
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel lblIdDoctorEliminar;
    private javax.swing.JPanel panelEliminarDoctor;
    private javax.swing.JTextField txtIdDoctorEliminar;
    // End of variables declaration//GEN-END:variables
}
