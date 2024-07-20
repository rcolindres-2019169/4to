/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.ricardocolindres.vista;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.ricardocolindres.controlador.ControlDeEmpleado;
import org.ricardocolindres.modelo.Empleado;

/**
 *
 * @author colin
 */
public class VistaVerEmpleado extends javax.swing.JInternalFrame {
    private final ControlDeEmpleado controlador = ControlDeEmpleado.getInstancia();
    /**
     * Creates new form VistaVerEmpleado
     */
    public VistaVerEmpleado() {
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

        scrollpanel = new javax.swing.JScrollPane();
        tblCita = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        tblCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "Nombre", "Apellido", "Email", "Telefono", "Rol", "Usuario", "Estado"
            }
        ));
        scrollpanel.setViewportView(tblCita);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mostrarLibrosEnTabla(){        
        int cantidadDeRegistros = controlador.cantidadDeDireccion();
        String [] encabezados = {"Id Empleado","Nombre", "Apellido","Email","Telefono","Rol","Usuario", "Estado"};        
        DefaultTableModel cabecera = new DefaultTableModel(encabezados,cantidadDeRegistros);
        tblCita.setModel(cabecera);
        TableModel tablaDeLibros = tblCita.getModel();
        for(int i=0; i<cantidadDeRegistros; i++){
            Empleado libro = controlador.listaDeDireccions().get(i);
            tablaDeLibros.setValueAt(libro.getId(), i, 0);
            tablaDeLibros.setValueAt(libro.getNombre(), i, 1);
            tablaDeLibros.setValueAt(libro.getApellido(), i, 2);
            tablaDeLibros.setValueAt(libro.getIdEmail(), i, 3);
            tablaDeLibros.setValueAt(libro.getIdTelefono(), i, 4);
            tablaDeLibros.setValueAt(libro.getIdRol(), i, 5);
            tablaDeLibros.setValueAt(libro.getIdUsuario(), i, 6);
            tablaDeLibros.setValueAt(libro.getEstadoEmpleado(), i, 7);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollpanel;
    private javax.swing.JTable tblCita;
    // End of variables declaration//GEN-END:variables
}
