/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.ricardocolindres.vista;
import org.ricardocolindres.controlador.ControlDoctor;
import org.ricardocolindres.modelo.Doctor;

/**
 * Clase que contiene la Vista de Actualizar Doctor
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 * @see Doctor
 * @see ControlDoctor
 */
public class VistaActualizarDoctor extends javax.swing.JInternalFrame {
    /**
     * instancias nuevas
     */
    
    Doctor doctorAntiguo = new Doctor();
    Doctor doctorActualizado = new Doctor();
    ControlDoctor controlador = ControlDoctor.getInstancia();

    /**
     * Creates new form VistaActualizarDoctor
     */
    public VistaActualizarDoctor() {
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

        panelActualizarDoctor = new javax.swing.JPanel();
        lblIdDoctorActualizar = new javax.swing.JLabel();
        lblNombreDoctorActualizar = new javax.swing.JLabel();
        lblApellidoDoctorActualizar = new javax.swing.JLabel();
        lblNumeroTelefonoActualizar = new javax.swing.JLabel();
        lblEspecialidadDoctorActualizar = new javax.swing.JLabel();
        lblEmailDoctorActualizar = new javax.swing.JLabel();
        lblDireccionDoctorActualizar = new javax.swing.JLabel();
        lblColegiadoDoctorActualizar = new javax.swing.JLabel();
        txtidDoctorActualizar = new javax.swing.JTextField();
        txtNombreDoctorActualizar = new javax.swing.JTextField();
        txtApellidoDoctorActualizar = new javax.swing.JTextField();
        txtNumTelefonoDoctorActualizar = new javax.swing.JTextField();
        txtEspecialidadActualizar = new javax.swing.JTextField();
        txtEmailDoctorActualizar = new javax.swing.JTextField();
        txtDireccionDoctorActualizar = new javax.swing.JTextField();
        txtColegiadoDoctorActualizar = new javax.swing.JTextField();
        separadorActualizarDoctor = new javax.swing.JSeparator();
        separadorIdDoctorActualizar = new javax.swing.JSeparator();
        idDoctorActualizarBuscar = new javax.swing.JLabel();
        txtIdDoctorActualizarBuscar = new javax.swing.JTextField();
        botonBuscarDoctorActualizar = new javax.swing.JButton();
        botonActualizarDoctor = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblIdDoctorActualizar.setText("Id Doctor");

        lblNombreDoctorActualizar.setText("Nombre Doctor");

        lblApellidoDoctorActualizar.setText("Apellido Doctor");

        lblNumeroTelefonoActualizar.setText("Numero de Telefono");

        lblEspecialidadDoctorActualizar.setText("Especialidad");

        lblEmailDoctorActualizar.setText("Email");

        lblDireccionDoctorActualizar.setText("Direccion");

        lblColegiadoDoctorActualizar.setText("Colegiado");

        idDoctorActualizarBuscar.setText("Id del Doctor a actualizar");

        botonBuscarDoctorActualizar.setText("Buscar");
        botonBuscarDoctorActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarDoctorActualizarActionPerformed(evt);
            }
        });

        botonActualizarDoctor.setText("Actualizar Datos");
        botonActualizarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarDoctorLayout = new javax.swing.GroupLayout(panelActualizarDoctor);
        panelActualizarDoctor.setLayout(panelActualizarDoctorLayout);
        panelActualizarDoctorLayout.setHorizontalGroup(
            panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarDoctorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addComponent(lblNumeroTelefonoActualizar)
                                .addGap(281, 281, 281))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarDoctorLayout.createSequentialGroup()
                                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblApellidoDoctorActualizar)
                                    .addComponent(lblEspecialidadDoctorActualizar, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(312, 312, 312))))
                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorIdDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailDoctorActualizar)
                            .addComponent(lblDireccionDoctorActualizar)
                            .addComponent(lblColegiadoDoctorActualizar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorActualizarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idDoctorActualizarBuscar)
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addComponent(botonBuscarDoctorActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdDoctorActualizarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdDoctorActualizar)
                                    .addComponent(lblNombreDoctorActualizar))
                                .addGap(63, 63, 63)
                                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtidDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumTelefonoDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEspecialidadActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtColegiadoDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarDoctorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonActualizarDoctor)
                .addGap(155, 155, 155))
        );
        panelActualizarDoctorLayout.setVerticalGroup(
            panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdDoctorActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreDoctorActualizar))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoDoctorActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroTelefonoActualizar)
                    .addComponent(txtNumTelefonoDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidadDoctorActualizar)
                    .addComponent(txtEspecialidadActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailDoctorActualizar)
                    .addComponent(txtEmailDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionDoctorActualizar)
                    .addComponent(txtDireccionDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColegiadoDoctorActualizar)
                    .addComponent(txtColegiadoDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separadorActualizarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonActualizarDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorIdDoctorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(idDoctorActualizarBuscar)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(botonBuscarDoctorActualizar))
                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdDoctorActualizarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActualizarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActualizarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarDoctorActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarDoctorActualizarActionPerformed
        /**
         * obtener todos los datos
         */
// TODO add your handling code here:
        doctorAntiguo = controlador.buscarDoctor(Integer.parseInt(txtidDoctorActualizar.getText()));
        txtidDoctorActualizar.setText(String.valueOf(doctorAntiguo.getId()));
        txtNombreDoctorActualizar.setText(doctorAntiguo.getNombre());
        txtApellidoDoctorActualizar.setText(doctorAntiguo.getApellido());
        txtNumTelefonoDoctorActualizar.setText(String.valueOf(doctorAntiguo.getNumero()));
        txtEspecialidadActualizar.setText(doctorAntiguo.getEspecialidad());
        txtEmailDoctorActualizar.setText(doctorAntiguo.getEmail());
        txtDireccionDoctorActualizar.setText(doctorAntiguo.getDireccion());
        txtColegiadoDoctorActualizar.setText(String.valueOf(doctorAntiguo.getColegiado()));
    }//GEN-LAST:event_botonBuscarDoctorActualizarActionPerformed

    private void botonActualizarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarDoctorActionPerformed
        // TODO add your handling code here:
        doctorActualizado.setId(Integer.parseInt(txtidDoctorActualizar.getText()));
        doctorActualizado.setNombre(txtNombreDoctorActualizar.getText());
        doctorActualizado.setApellido(txtApellidoDoctorActualizar.getText());
        doctorActualizado.setNumero(Integer.parseInt(txtNumTelefonoDoctorActualizar.getText()));
        doctorActualizado.setEspecialidad(txtEspecialidadActualizar.getText());
        doctorActualizado.setEmail(txtEmailDoctorActualizar.getText());
        doctorActualizado.setDireccion(txtDireccionDoctorActualizar.getText());
        doctorActualizado.setColegiado(Integer.parseInt(txtColegiadoDoctorActualizar.getText()));
        
        controlador.actualizarDoctor(doctorAntiguo, doctorActualizado);
        setVisible(false);
    }//GEN-LAST:event_botonActualizarDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarDoctor;
    private javax.swing.JButton botonBuscarDoctorActualizar;
    private javax.swing.JLabel idDoctorActualizarBuscar;
    private javax.swing.JLabel lblApellidoDoctorActualizar;
    private javax.swing.JLabel lblColegiadoDoctorActualizar;
    private javax.swing.JLabel lblDireccionDoctorActualizar;
    private javax.swing.JLabel lblEmailDoctorActualizar;
    private javax.swing.JLabel lblEspecialidadDoctorActualizar;
    private javax.swing.JLabel lblIdDoctorActualizar;
    private javax.swing.JLabel lblNombreDoctorActualizar;
    private javax.swing.JLabel lblNumeroTelefonoActualizar;
    private javax.swing.JPanel panelActualizarDoctor;
    private javax.swing.JSeparator separadorActualizarDoctor;
    private javax.swing.JSeparator separadorIdDoctorActualizar;
    private javax.swing.JTextField txtApellidoDoctorActualizar;
    private javax.swing.JTextField txtColegiadoDoctorActualizar;
    private javax.swing.JTextField txtDireccionDoctorActualizar;
    private javax.swing.JTextField txtEmailDoctorActualizar;
    private javax.swing.JTextField txtEspecialidadActualizar;
    private javax.swing.JTextField txtIdDoctorActualizarBuscar;
    private javax.swing.JTextField txtNombreDoctorActualizar;
    private javax.swing.JTextField txtNumTelefonoDoctorActualizar;
    private javax.swing.JTextField txtidDoctorActualizar;
    // End of variables declaration//GEN-END:variables
}
