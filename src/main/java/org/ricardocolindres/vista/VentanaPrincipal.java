/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.ricardocolindres.vista;
/**
 *Clase que contiene los CRUDS 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    /**
     * Instancia de Vistas
     */
    
    private VistaAgregarDoctor instanciaAgregarDoctor = null;
    private VistaVerDoctores instanciaVerDoctor = null;
    private VistaActualizarDoctor instanciaActualizarDoctor = null;
    private VistaEliminarDoctor instanciaEliminarDoctor = null;
    private VistaAgregarCliente instanciaAgregarCliente = null;
    private VistaVerClientes instanciaVerClientes = null;
    private VistaActualizarCliente instanciaActualizarCliente = null;
    private VistaEliminarCliente instanciaEliminarCliente = null;
    private VistaAgregarMascota instanciaAgregarMascota = null;
    private VistaVerMascotas instanciaVerMascotas = null;
    private VistaActualizarMascota instanciaActualizarMascota = null;
    private VistaEliminarMascota instanciaEliminarMascota = null;
    private VistaAgregarCita instanciaAgregarCita = null;
    private VistaVerCitas instanciaVerCitas = null;
    private VistaActualizarCita instanciaActualizarCita = null;
    private VistaEliminarCita instanciaEliminarCita = null;
    

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        lookAndFeel();
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void lookAndFeel(){
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    //metodos con isntancias
    public synchronized VistaAgregarDoctor getInstanciaAgregarDoctor(){
        if (instanciaAgregarDoctor == null) {
            instanciaAgregarDoctor = new VistaAgregarDoctor();
            panelDeEscritorio.add(instanciaAgregarDoctor);
        }else if(instanciaAgregarDoctor.isVisible()==false)
            instanciaAgregarDoctor.setVisible(true);
        instanciaAgregarDoctor.show();
        return instanciaAgregarDoctor;
    }
    
    public synchronized VistaVerDoctores getInstanciaVerDoctores(){
        if (instanciaVerDoctor == null) {
            instanciaVerDoctor = new VistaVerDoctores();
            panelDeEscritorio.add(instanciaVerDoctor);
        }else if(instanciaVerDoctor.isVisible()==false)
            instanciaVerDoctor.setVisible(true);
        instanciaVerDoctor.show();
        return instanciaVerDoctor;
    }
    
    public synchronized VistaActualizarDoctor getInstanciaActualizarDoctor(){
        if (instanciaActualizarDoctor == null) {
            instanciaActualizarDoctor = new VistaActualizarDoctor();
            panelDeEscritorio.add(instanciaActualizarDoctor);
        }else if(instanciaActualizarDoctor.isVisible()==false)
            instanciaActualizarDoctor.setVisible(true);
        instanciaActualizarDoctor.show();
        return instanciaActualizarDoctor;
    }
    
    public synchronized VistaEliminarDoctor getInstanciaEliminarDoctor(){
        if (instanciaEliminarDoctor == null) {
            instanciaEliminarDoctor = new VistaEliminarDoctor();
            panelDeEscritorio.add(instanciaEliminarDoctor);
        }else if(instanciaEliminarDoctor.isVisible()==false)
            instanciaEliminarDoctor.setVisible(true);
        instanciaEliminarDoctor.show();
        return instanciaEliminarDoctor;
    }
    
    public synchronized VistaAgregarCliente getInstanciaAgregarCliente(){
        if (instanciaAgregarCliente == null) {
            instanciaAgregarCliente = new VistaAgregarCliente();
            panelDeEscritorio.add(instanciaAgregarCliente);
        }else if(instanciaAgregarCliente.isVisible()==false)
            instanciaAgregarCliente.setVisible(true);
        instanciaAgregarCliente.show();
        return instanciaAgregarCliente;
    }
    
    public synchronized VistaVerClientes getInstanciaVerClientes(){
        if (instanciaVerClientes == null) {
            instanciaVerClientes = new VistaVerClientes();
            panelDeEscritorio.add(instanciaVerClientes);
        }else if(instanciaVerClientes.isVisible()==false)
            instanciaVerClientes.setVisible(true);
        instanciaVerClientes.show();
        return instanciaVerClientes;
    }
    public synchronized VistaActualizarCliente getInstanciaActualizarCliente(){
        if(instanciaActualizarCliente == null){
            instanciaActualizarCliente = new VistaActualizarCliente();
            panelDeEscritorio.add(instanciaActualizarCliente);
        }else if(instanciaActualizarCliente.isVisible()==false)
            instanciaActualizarCliente.setVisible(true);
        instanciaActualizarCliente.show();
        return instanciaActualizarCliente;
    }
    public synchronized VistaEliminarCliente getInstanciaEliminarCliente(){
        if(instanciaEliminarCliente == null){
            instanciaEliminarCliente = new VistaEliminarCliente();
            panelDeEscritorio.add(instanciaEliminarCliente);
        }else if(instanciaEliminarCliente.isVisible()==false)
            instanciaEliminarCliente.setVisible(true);
        instanciaEliminarCliente.show();
        return instanciaEliminarCliente;
    }
    
    
    public synchronized VistaAgregarMascota getInstanciaAgregarMascota(){
        if (instanciaAgregarMascota == null) {
            instanciaAgregarMascota = new VistaAgregarMascota();
            panelDeEscritorio.add(instanciaAgregarMascota);
        }else if(instanciaAgregarMascota.isVisible()==false)
            instanciaAgregarMascota.setVisible(true);
        instanciaAgregarMascota.show();
        return instanciaAgregarMascota;   
    }
    public synchronized VistaVerMascotas getInstanciaVerMascota(){
        if (instanciaVerMascotas==null) {
            instanciaVerMascotas = new VistaVerMascotas();
            panelDeEscritorio.add(instanciaVerMascotas);
        }else if(instanciaVerMascotas.isVisible()==false)
            instanciaVerMascotas.setVisible(true);
        instanciaVerMascotas.show();
        return instanciaVerMascotas;  
    }
    public synchronized VistaActualizarMascota getInstanciaActualizarMascota(){
        if (instanciaActualizarMascota==null) {
            instanciaActualizarMascota = new VistaActualizarMascota();
            panelDeEscritorio.add(instanciaActualizarMascota);
        }else if(instanciaActualizarMascota.isVisible()==false)
            instanciaActualizarMascota.setVisible(true);
        instanciaActualizarMascota.show();
        return instanciaActualizarMascota;  
    }
    public synchronized VistaEliminarMascota getInstanciaEliminarMascota(){
        if (instanciaEliminarMascota==null) {
            instanciaEliminarMascota = new VistaEliminarMascota();
            panelDeEscritorio.add(instanciaEliminarMascota);
        }else if(instanciaEliminarMascota.isVisible()==false)
            instanciaEliminarMascota.setVisible(true);
        instanciaEliminarMascota.show();
        return instanciaEliminarMascota;  
    }
    
    public synchronized VistaAgregarCita getInstancAgregarCita(){
        if (instanciaAgregarCita==null) {
            instanciaAgregarCita = new VistaAgregarCita();
            panelDeEscritorio.add(instanciaAgregarCita);
        }else if(instanciaAgregarCita.isVisible()==false)
            instanciaAgregarCita.setVisible(true);
        instanciaAgregarCita.show();
        return instanciaAgregarCita;  
    }
    public synchronized VistaVerCitas getInstanciaVerCitas(){
        if (instanciaVerCitas==null) {
            instanciaVerCitas = new VistaVerCitas();
            panelDeEscritorio.add(instanciaVerCitas);
        }else if(instanciaVerCitas.isVisible()==false)
            instanciaVerCitas.setVisible(true);
        instanciaVerCitas.show();
        return instanciaVerCitas;  
    }
    public synchronized VistaActualizarCita getInstanciaActualizarCita(){
        if (instanciaActualizarCita==null) {
            instanciaActualizarCita = new VistaActualizarCita();
            panelDeEscritorio.add(instanciaActualizarCita);
        }else if(instanciaActualizarCita.isVisible()==false)
            instanciaActualizarCita.setVisible(true);
        instanciaActualizarCita.show();
        return instanciaActualizarCita;  
    }
    
    public synchronized VistaEliminarCita getInstanciaEliminarCita(){
        if(instanciaEliminarCita == null){
            instanciaEliminarCita = new VistaEliminarCita();
            panelDeEscritorio.add(instanciaEliminarCita);
        }else if(instanciaEliminarCita.isVisible()==false)
            instanciaEliminarCita.setVisible(true);
        instanciaEliminarCita.show();
        return instanciaEliminarCita;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        panelDeEscritorio = new javax.swing.JDesktopPane();
        barraDeMenu = new javax.swing.JMenuBar();
        menuDoctor = new javax.swing.JMenu();
        menuItemAgregarDoctor = new javax.swing.JMenuItem();
        menuItemVerDoctores = new javax.swing.JMenuItem();
        menuItemActualizarDoctor = new javax.swing.JMenuItem();
        menuItemEliminarDoctor = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuItemAgregarCliente = new javax.swing.JMenuItem();
        menuItemVerClientes = new javax.swing.JMenuItem();
        menuItemActualizarCliente = new javax.swing.JMenuItem();
        menuItemEliminarCliente = new javax.swing.JMenuItem();
        menuMascota = new javax.swing.JMenu();
        menuItemAgregarMascota = new javax.swing.JMenuItem();
        menuItemVerMascotas = new javax.swing.JMenuItem();
        menuItemActualizarMascota = new javax.swing.JMenuItem();
        menuItemEliminarMascota = new javax.swing.JMenuItem();
        menuCita = new javax.swing.JMenu();
        menuItemAgregarCita = new javax.swing.JMenuItem();
        menuItemVerCita = new javax.swing.JMenuItem();
        menuItemActualizarCita = new javax.swing.JMenuItem();
        menuItemEliminarCita = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crud de Veterinaria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelDeEscritorio.setBackground(new java.awt.Color(153, 255, 255));
        panelDeEscritorio.setToolTipText("");

        javax.swing.GroupLayout panelDeEscritorioLayout = new javax.swing.GroupLayout(panelDeEscritorio);
        panelDeEscritorio.setLayout(panelDeEscritorioLayout);
        panelDeEscritorioLayout.setHorizontalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        panelDeEscritorioLayout.setVerticalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        barraDeMenu.setBackground(new java.awt.Color(0, 51, 51));

        menuDoctor.setBackground(new java.awt.Color(0, 0, 0));
        menuDoctor.setText("Doctor");

        menuItemAgregarDoctor.setText("Agregar Doctor");
        menuItemAgregarDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuItemAgregarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(menuItemAgregarDoctor);

        menuItemVerDoctores.setText("Ver Doctores");
        menuItemVerDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerDoctoresActionPerformed(evt);
            }
        });
        menuDoctor.add(menuItemVerDoctores);

        menuItemActualizarDoctor.setText("Actualizar Doctor");
        menuItemActualizarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(menuItemActualizarDoctor);

        menuItemEliminarDoctor.setText("Eliminar Doctor");
        menuItemEliminarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(menuItemEliminarDoctor);

        barraDeMenu.add(menuDoctor);

        menuCliente.setText("Cliente");

        menuItemAgregarCliente.setText("Agregar Cliente");
        menuItemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemAgregarCliente);

        menuItemVerClientes.setText("Ver Clientes");
        menuItemVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerClientesActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemVerClientes);

        menuItemActualizarCliente.setText("Actualizar Clientes");
        menuCliente.add(menuItemActualizarCliente);

        menuItemEliminarCliente.setText("Eliminar Cliente");
        menuItemEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemEliminarCliente);

        barraDeMenu.add(menuCliente);

        menuMascota.setText("Mascota");

        menuItemAgregarMascota.setText("Agregar Mascota");
        menuItemAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarMascotaActionPerformed(evt);
            }
        });
        menuMascota.add(menuItemAgregarMascota);

        menuItemVerMascotas.setText("Ver Mascotas");
        menuItemVerMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerMascotasActionPerformed(evt);
            }
        });
        menuMascota.add(menuItemVerMascotas);

        menuItemActualizarMascota.setText("Actualizar Mascota");
        menuItemActualizarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarMascotaActionPerformed(evt);
            }
        });
        menuMascota.add(menuItemActualizarMascota);

        menuItemEliminarMascota.setText("Eliminar Mascota");
        menuItemEliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarMascotaActionPerformed(evt);
            }
        });
        menuMascota.add(menuItemEliminarMascota);

        barraDeMenu.add(menuMascota);

        menuCita.setText("Cita");

        menuItemAgregarCita.setText("Agregar Cita");
        menuItemAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarCitaActionPerformed(evt);
            }
        });
        menuCita.add(menuItemAgregarCita);

        menuItemVerCita.setText("Ver Citas");
        menuItemVerCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerCitaActionPerformed(evt);
            }
        });
        menuCita.add(menuItemVerCita);

        menuItemActualizarCita.setText("Actualizar Cita");
        menuItemActualizarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCitaActionPerformed(evt);
            }
        });
        menuCita.add(menuItemActualizarCita);

        menuItemEliminarCita.setText("Eliminar Cita");
        menuItemEliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCitaActionPerformed(evt);
            }
        });
        menuCita.add(menuItemEliminarCita);

        barraDeMenu.add(menuCita);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAgregarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarDoctorActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarDoctor();
    }//GEN-LAST:event_menuItemAgregarDoctorActionPerformed

    private void menuItemVerDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerDoctoresActionPerformed
        // TODO add your handling code here:
        getInstanciaVerDoctores();
        instanciaVerDoctor.mostrarDatosDoctores();
    }//GEN-LAST:event_menuItemVerDoctoresActionPerformed

    private void menuItemActualizarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarDoctorActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarDoctor();
    }//GEN-LAST:event_menuItemActualizarDoctorActionPerformed

    private void menuItemEliminarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarDoctorActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarDoctor();
    }//GEN-LAST:event_menuItemEliminarDoctorActionPerformed

    private void menuItemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarClienteActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCliente();
    }//GEN-LAST:event_menuItemAgregarClienteActionPerformed

    private void menuItemVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerClientesActionPerformed
        // TODO add your handling code here:
        getInstanciaVerClientes();
        instanciaVerClientes.mostrarDatosCliente();
    }//GEN-LAST:event_menuItemVerClientesActionPerformed

    private void menuItemAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarMascotaActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarMascota();
    }//GEN-LAST:event_menuItemAgregarMascotaActionPerformed

    private void menuItemVerMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerMascotasActionPerformed
        // TODO add your handling code here:
        getInstanciaVerMascota();
        instanciaVerMascotas.mostrarDatosMascotas();
    }//GEN-LAST:event_menuItemVerMascotasActionPerformed

    private void menuItemEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarClienteActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCliente();
    }//GEN-LAST:event_menuItemEliminarClienteActionPerformed
        
    private void menuItemActualizarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarMascotaActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarMascota();
    }//GEN-LAST:event_menuItemActualizarMascotaActionPerformed

    private void menuItemEliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarMascotaActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarMascota();
    }//GEN-LAST:event_menuItemEliminarMascotaActionPerformed

    private void menuItemAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarCitaActionPerformed
        // TODO add your handling code here:
        getInstancAgregarCita();
    }//GEN-LAST:event_menuItemAgregarCitaActionPerformed

    private void menuItemVerCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerCitaActionPerformed
        // TODO add your handling code here:
        getInstanciaVerCitas();
        instanciaVerCitas.mostrarDatosCita();
    }//GEN-LAST:event_menuItemVerCitaActionPerformed

    private void menuItemActualizarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCitaActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarCita();
    }//GEN-LAST:event_menuItemActualizarCitaActionPerformed

    private void menuItemEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCitaActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCita();
    }//GEN-LAST:event_menuItemEliminarCitaActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menuCita;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuDoctor;
    private javax.swing.JMenuItem menuItemActualizarCita;
    private javax.swing.JMenuItem menuItemActualizarCliente;
    private javax.swing.JMenuItem menuItemActualizarDoctor;
    private javax.swing.JMenuItem menuItemActualizarMascota;
    private javax.swing.JMenuItem menuItemAgregarCita;
    private javax.swing.JMenuItem menuItemAgregarCliente;
    private javax.swing.JMenuItem menuItemAgregarDoctor;
    private javax.swing.JMenuItem menuItemAgregarMascota;
    private javax.swing.JMenuItem menuItemEliminarCita;
    private javax.swing.JMenuItem menuItemEliminarCliente;
    private javax.swing.JMenuItem menuItemEliminarDoctor;
    private javax.swing.JMenuItem menuItemEliminarMascota;
    private javax.swing.JMenuItem menuItemVerCita;
    private javax.swing.JMenuItem menuItemVerClientes;
    private javax.swing.JMenuItem menuItemVerDoctores;
    private javax.swing.JMenuItem menuItemVerMascotas;
    private javax.swing.JMenu menuMascota;
    private javax.swing.JDesktopPane panelDeEscritorio;
    // End of variables declaration//GEN-END:variables
}
