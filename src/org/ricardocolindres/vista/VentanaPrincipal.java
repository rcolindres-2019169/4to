/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.ricardocolindres.vista;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author colin
 */

    
public class VentanaPrincipal extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();
    
    /**
     * Creates new form VentanaPrincipal
     */
    
    
    private VistaAgregarRol instanciaAgregarRol = null;
    private VistaAgregarUsuario instanciaAgregarUsuario = null;
    private VistaAgregarServicio instanciaAgregarServicio = null;
    private VistaAgregarEmail instanciaAgregarEmail = null;
    private VistaAgregarTelefono instanciaAgregarTelefono = null;
    private VistaAgregarCita instanciaAgregarCita = null;
    private VistaAgregarEmpleado instanciaAgregarEmpleado = null;
    private VistaAgregarCliente instanciaAgregarCliente = null;
    private VistaAgregarMascota instanciaAgregarMascota = null;
    private VistaAgregarDoctor instanciaAgregarDoctor = null;
    private VistaActualizarRol instanciaActualizarRoll = null;
    private VistaActualizarUsuario instanciaActualizarUsuario = null;
    private VistaActualizarServicio instanciaaActualizarServicio = null;
    private VistaActualizarEmail instanciaActualizarEmaill = null;
    private VistaActualizarTelefono instanciaActualizarTelefono = null;
    private VistaActualizarCita instanciaActualizarCita = null;
    private VistaActualizarEmpleado instanciaActualizarEmpleado = null;
    private VistaActualizarCliente instanciaActualizarCliente = null;
    private VistaActualizarMascota instanciaActualizarMascota = null;
    private VistaActualizarDoctor instanciaActualizarDoctor = null;
    private VistaEliminarRol instanciaEliminarRol = null;
    private VistaEliminarUsuario instanciaEliminarUsuario = null;
    private VistaEliminarServicio instanciaEliminarServicio = null;
    private VistaEliminarEmail instanciaEliminarEmail = null;
    private VistaEliminarTelefono instanciaEliminarTelefono = null;
    private VistaEliminarCita instanciaEliminarCita = null;
    private VistaEliminarEmpleado instanciaEliminarEmpleado = null;
    private VistaEliminarCliente instanciaEliminarCliente = null;
    private VistaEliminarMascota instanciaEliminarMascota = null;
    private VistaEliminarDoctor instanciaEliminarDoctor = null;
    private VistaVerDireccion instanciaVerDireccion = null;
    private VistaVerCita instanciaVerCita = null;
    private VistaVerRol instanciaVerRol = null;
    private VistaVerUsuario instanciaVerUsuario = null;
    private VistaVerServicio instanciaVerServicio = null;
    private VistaVerEmail instanciaVerEmail = null;
    private VistaVerTelefono instanciaVerTelefono = null;
    private VistaVerEmpleado instanciaVerEmpleado = null;
    private VistaVerCliente instanciaVerCliente = null;
    private VistaVerMascota instanciaVerMascota = null;
    private VistaVerDoctor instanciaVerDoctor = null;
    
    public VentanaPrincipal() {
        this.setContentPane(fondo);
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
    
    public synchronized VistaAgregarRol getInstanciaAgregarRol(){
        if (instanciaAgregarRol == null) {
            instanciaAgregarRol = new VistaAgregarRol();
            panelDeEscritorio.add(instanciaAgregarRol);
        }else if(instanciaAgregarRol.isVisible()==false)
            instanciaAgregarRol.setVisible(true);
        instanciaAgregarRol.show();
        return instanciaAgregarRol;
    }
    
    public synchronized VistaAgregarUsuario getInstanciaAgregarUsuario(){
        if (instanciaAgregarUsuario == null) {
            instanciaAgregarUsuario = new VistaAgregarUsuario();
            panelDeEscritorio.add(instanciaAgregarUsuario);
        }else if(instanciaAgregarUsuario.isVisible()==false)
            instanciaAgregarUsuario.setVisible(true);
        instanciaAgregarUsuario.show();
        return instanciaAgregarUsuario;
    }
    
    public synchronized VistaAgregarServicio getInstanciaAgregarServicio(){
        if (instanciaAgregarServicio == null) {
            instanciaAgregarServicio = new VistaAgregarServicio();
            panelDeEscritorio.add(instanciaAgregarServicio);
        }else if(instanciaAgregarServicio.isVisible()==false)
            instanciaAgregarServicio.setVisible(true);
        instanciaAgregarServicio.show();
        return instanciaAgregarServicio;
    }
    public synchronized VistaAgregarEmail getInstanciaAgregarEmail(){
        if (instanciaAgregarEmail == null) {
            instanciaAgregarEmail = new VistaAgregarEmail();
            panelDeEscritorio.add(instanciaAgregarEmail);
        }else if(instanciaAgregarEmail.isVisible()==false)
            instanciaAgregarEmail.setVisible(true);
        instanciaAgregarEmail.show();
        return instanciaAgregarEmail;
    }
    public synchronized VistaAgregarTelefono getInstanciaAgregarTelefono(){
        if (instanciaAgregarTelefono == null) {
            instanciaAgregarTelefono = new VistaAgregarTelefono();
            panelDeEscritorio.add(instanciaAgregarTelefono);
        }else if(instanciaAgregarTelefono.isVisible()==false)
            instanciaAgregarTelefono.setVisible(true);
        instanciaAgregarTelefono.show();
        return instanciaAgregarTelefono;
    }
    public synchronized VistaAgregarCita getInstanciaAgregarCita(){
        if (instanciaAgregarCita == null) {
            instanciaAgregarCita = new VistaAgregarCita();
            panelDeEscritorio.add(instanciaAgregarCita);
        }else if(instanciaAgregarCita.isVisible()==false)
            instanciaAgregarCita.setVisible(true);
        instanciaAgregarCita.show();
        return instanciaAgregarCita;
    }
    public synchronized VistaAgregarEmpleado getInstanciaAgregarEmpleado(){
        if (instanciaAgregarEmpleado == null) {
            instanciaAgregarEmpleado = new VistaAgregarEmpleado();
            panelDeEscritorio.add(instanciaAgregarEmpleado);
        }else if(instanciaAgregarEmpleado.isVisible()==false)
            instanciaAgregarEmpleado.setVisible(true);
        instanciaAgregarEmpleado.show();
        return instanciaAgregarEmpleado;
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
    public synchronized VistaAgregarMascota getInstanciaAgregarMascota(){
        if (instanciaAgregarMascota == null) {
            instanciaAgregarMascota = new VistaAgregarMascota();
            panelDeEscritorio.add(instanciaAgregarMascota);
        }else if(instanciaAgregarMascota.isVisible()==false)
            instanciaAgregarMascota.setVisible(true);
        instanciaAgregarMascota.show();
        return instanciaAgregarMascota;
    }
    public synchronized VistaAgregarDoctor getInstanciaAgregarDoctor(){
        if (instanciaAgregarDoctor == null) {
            instanciaAgregarDoctor = new VistaAgregarDoctor();
            panelDeEscritorio.add(instanciaAgregarDoctor);
        }else if(instanciaAgregarDoctor.isVisible()==false)
            instanciaAgregarDoctor.setVisible(true);
        instanciaAgregarDoctor.show();
        return instanciaAgregarDoctor;
    }
    public synchronized VistaActualizarRol getInstanciaActualizarRol(){
        if (instanciaActualizarRoll == null) {
            instanciaActualizarRoll = new VistaActualizarRol();
            panelDeEscritorio.add(instanciaActualizarRoll);
        }else if(instanciaActualizarRoll.isVisible()==false)
            instanciaActualizarRoll.setVisible(true);
        instanciaActualizarRoll.show();
        return instanciaActualizarRoll;
    }
    public synchronized VistaActualizarUsuario getInstanciaActualizarUsuario(){
        if (instanciaActualizarUsuario == null) {
            instanciaActualizarUsuario = new VistaActualizarUsuario();
            panelDeEscritorio.add(instanciaActualizarUsuario);
        }else if(instanciaActualizarUsuario.isVisible()==false)
            instanciaActualizarUsuario.setVisible(true);
        instanciaActualizarUsuario.show();
        return instanciaActualizarUsuario;
    }
    public synchronized VistaActualizarServicio getInstanciaActualizarServicio(){
        if (instanciaaActualizarServicio == null) {
            instanciaaActualizarServicio = new VistaActualizarServicio();
            panelDeEscritorio.add(instanciaaActualizarServicio);
        }else if(instanciaaActualizarServicio.isVisible()==false)
            instanciaaActualizarServicio.setVisible(true);
        instanciaaActualizarServicio.show();
        return instanciaaActualizarServicio;
    }
    public synchronized VistaActualizarEmail getInstanciaActualizarEmail(){
        if (instanciaActualizarEmaill == null) {
            instanciaActualizarEmaill = new VistaActualizarEmail();
            panelDeEscritorio.add(instanciaActualizarEmaill);
        }else if(instanciaActualizarEmaill.isVisible()==false)
            instanciaActualizarEmaill.setVisible(true);
        instanciaActualizarEmaill.show();
        return instanciaActualizarEmaill;
    }
    public synchronized VistaActualizarTelefono getInstanciaActualizarTelefono(){
        if (instanciaActualizarTelefono == null) {
            instanciaActualizarTelefono = new VistaActualizarTelefono();
            panelDeEscritorio.add(instanciaActualizarTelefono);
        }else if(instanciaActualizarTelefono.isVisible()==false)
            instanciaActualizarTelefono.setVisible(true);
        instanciaActualizarTelefono.show();
        return instanciaActualizarTelefono;
    }
    public synchronized VistaActualizarCita getInstanciaActualizarCita(){
        if (instanciaActualizarCita == null) {
            instanciaActualizarCita = new VistaActualizarCita();
            panelDeEscritorio.add(instanciaActualizarCita);
        }else if(instanciaActualizarCita.isVisible()==false)
            instanciaActualizarCita.setVisible(true);
        instanciaActualizarCita.show();
        return instanciaActualizarCita;
    }
    public synchronized VistaActualizarEmpleado getInstanciaActualizarEmpleado(){
        if (instanciaActualizarEmpleado == null) {
            instanciaActualizarEmpleado = new VistaActualizarEmpleado();
            panelDeEscritorio.add(instanciaActualizarEmpleado);
        }else if(instanciaActualizarEmpleado.isVisible()==false)
            instanciaActualizarEmpleado.setVisible(true);
        instanciaActualizarEmpleado.show();
        return instanciaActualizarEmpleado;
    }
    public synchronized VistaActualizarCliente getInstanciaActualizarCliente(){
        if (instanciaActualizarCliente == null) {
            instanciaActualizarCliente = new VistaActualizarCliente();
            panelDeEscritorio.add(instanciaActualizarCliente);
        }else if(instanciaActualizarCliente.isVisible()==false)
            instanciaActualizarCliente.setVisible(true);
        instanciaActualizarCliente.show();
        return instanciaActualizarCliente;
    }
    public synchronized VistaActualizarMascota getInstanciaActualizarMascota(){
        if (instanciaActualizarMascota == null) {
            instanciaActualizarMascota = new VistaActualizarMascota();
            panelDeEscritorio.add(instanciaActualizarMascota);
        }else if(instanciaActualizarMascota.isVisible()==false)
            instanciaActualizarMascota.setVisible(true);
        instanciaActualizarMascota.show();
        return instanciaActualizarMascota;
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
    public synchronized VistaEliminarRol getInstanciaEliminarRol(){
        if (instanciaEliminarRol == null) {
            instanciaEliminarRol = new VistaEliminarRol();
            panelDeEscritorio.add(instanciaEliminarRol);
        }else if(instanciaEliminarRol.isVisible()==false)
            instanciaEliminarRol.setVisible(true);
        instanciaEliminarRol.show();
        return instanciaEliminarRol;
    }
    public synchronized VistaEliminarUsuario getInstanciaEliminarUsuario(){
        if (instanciaEliminarUsuario == null) {
            instanciaEliminarUsuario= new VistaEliminarUsuario();
            panelDeEscritorio.add(instanciaEliminarUsuario);
        }else if(instanciaEliminarUsuario.isVisible()==false)
            instanciaEliminarUsuario.setVisible(true);
        instanciaEliminarUsuario.show();
        return instanciaEliminarUsuario;
    }
    public synchronized VistaEliminarServicio getInstanciaEliminarServicio(){
        if (instanciaEliminarServicio == null) {
            instanciaEliminarServicio= new VistaEliminarServicio();
            panelDeEscritorio.add(instanciaEliminarServicio);
        }else if(instanciaEliminarServicio.isVisible()==false)
            instanciaEliminarServicio.setVisible(true);
        instanciaEliminarServicio.show();
        return instanciaEliminarServicio;
    }
    public synchronized VistaEliminarEmail getInstanciaEliminarEmail(){
        if (instanciaEliminarEmail == null) {
            instanciaEliminarEmail = new VistaEliminarEmail();
            panelDeEscritorio.add(instanciaEliminarEmail);
        }else if(instanciaEliminarEmail.isVisible()==false)
            instanciaEliminarEmail.setVisible(true);
        instanciaEliminarEmail.show();
        return instanciaEliminarEmail;
    }
    public synchronized VistaEliminarTelefono getInstanciaEliminarTelefono(){
        if (instanciaEliminarTelefono == null) {
            instanciaEliminarTelefono = new VistaEliminarTelefono();
            panelDeEscritorio.add(instanciaEliminarTelefono);
        }else if(instanciaEliminarTelefono.isVisible()==false)
            instanciaEliminarTelefono.setVisible(true);
        instanciaEliminarTelefono.show();
        return instanciaEliminarTelefono;
    }
    public synchronized VistaEliminarCita getInstanciaEliminarCita(){
        if (instanciaEliminarCita == null) {
            instanciaEliminarCita = new VistaEliminarCita();
            panelDeEscritorio.add(instanciaEliminarCita);
        }else if(instanciaEliminarCita.isVisible()==false)
            instanciaEliminarCita.setVisible(true);
        instanciaEliminarCita.show();
        return instanciaEliminarCita;
    }
    public synchronized VistaEliminarEmpleado getInstanciaEliminarEmpleado(){
        if (instanciaEliminarEmpleado == null) {
            instanciaEliminarEmpleado = new VistaEliminarEmpleado();
            panelDeEscritorio.add(instanciaEliminarEmpleado);
        }else if(instanciaEliminarEmpleado.isVisible()==false)
            instanciaEliminarEmpleado.setVisible(true);
        instanciaEliminarEmpleado.show();
        return instanciaEliminarEmpleado;
    }
    public synchronized VistaEliminarCliente getInstanciaEliminarCliente(){
        if (instanciaEliminarCliente == null) {
            instanciaEliminarCliente = new VistaEliminarCliente();
            panelDeEscritorio.add(instanciaEliminarCliente);
        }else if(instanciaEliminarCliente.isVisible()==false)
            instanciaEliminarCliente.setVisible(true);
        instanciaEliminarCliente.show();
        return instanciaEliminarCliente;
    }
    public synchronized VistaEliminarMascota getInstanciaEliminarMascota(){
        if (instanciaEliminarMascota == null) {
            instanciaEliminarMascota = new VistaEliminarMascota();
            panelDeEscritorio.add(instanciaEliminarMascota);
        }else if(instanciaEliminarMascota.isVisible()==false)
            instanciaEliminarMascota.setVisible(true);
        instanciaEliminarMascota.show();
        return instanciaEliminarMascota;
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
    public synchronized VistaVerDireccion getInstanciaVerDireccion(){
        if (instanciaVerDireccion == null) {
            instanciaVerDireccion = new VistaVerDireccion();
            panelDeEscritorio.add(instanciaVerDireccion);
        }else if(instanciaVerDireccion.isVisible()==false)
            instanciaVerDireccion.setVisible(true);
        instanciaVerDireccion.show();
        return instanciaVerDireccion;
    }
    public synchronized VistaVerCita getInstanciaVerCita(){
        if (instanciaVerCita == null) {
            instanciaVerCita = new VistaVerCita();
            panelDeEscritorio.add(instanciaVerCita);
        }else if(instanciaVerCita.isVisible()==false)
            instanciaVerCita.setVisible(true);
        instanciaVerCita.show();
        return instanciaVerCita;
    }
    public synchronized VistaVerRol getInstanciaVerRol(){
        if (instanciaVerRol == null) {
            instanciaVerRol = new VistaVerRol();
            panelDeEscritorio.add(instanciaVerRol);
        }else if(instanciaVerRol.isVisible()==false)
            instanciaVerRol.setVisible(true);
        instanciaVerRol.show();
        return instanciaVerRol;
    }
    public synchronized VistaVerUsuario getInstanciaVerUsuario(){
        if (instanciaVerUsuario == null) {
            instanciaVerUsuario= new VistaVerUsuario();
            panelDeEscritorio.add(instanciaVerUsuario);
        }else if(instanciaVerUsuario.isVisible()==false)
            instanciaVerUsuario.setVisible(true);
        instanciaVerUsuario.show();
        return instanciaVerUsuario;
    }
    public synchronized VistaVerServicio getInstanciaVerServicio(){
        if (instanciaVerServicio == null) {
            instanciaVerServicio = new VistaVerServicio();
            panelDeEscritorio.add(instanciaVerServicio);
        }else if(instanciaVerServicio.isVisible()==false)
            instanciaVerServicio.setVisible(true);
        instanciaVerServicio.show();
        return instanciaVerServicio;
    }
    public synchronized VistaVerEmail getInstanciaVerEmail(){
        if (instanciaVerEmail == null) {
            instanciaVerEmail = new VistaVerEmail();
            panelDeEscritorio.add(instanciaVerEmail);
        }else if(instanciaVerEmail.isVisible()==false)
            instanciaVerEmail.setVisible(true);
        instanciaVerEmail.show();
        return instanciaVerEmail;
    }
    public synchronized VistaVerTelefono getInstanciaVerTelefono(){
        if (instanciaVerTelefono == null) {
            instanciaVerTelefono = new VistaVerTelefono();
            panelDeEscritorio.add(instanciaVerTelefono);
        }else if(instanciaVerTelefono.isVisible()==false)
            instanciaVerTelefono.setVisible(true);
        instanciaVerTelefono.show();
        return instanciaVerTelefono;
    }
    public synchronized VistaVerEmpleado getInstanciaVerEmpleado(){
        if (instanciaVerEmpleado == null) {
            instanciaVerEmpleado = new VistaVerEmpleado();
            panelDeEscritorio.add(instanciaVerEmpleado);
        }else if(instanciaVerEmpleado.isVisible()==false)
            instanciaVerEmpleado.setVisible(true);
        instanciaVerEmpleado.show();
        return instanciaVerEmpleado;
    }
    public synchronized VistaVerCliente getInstanciaVerCliente(){
        if (instanciaVerCliente == null) {
            instanciaVerCliente = new VistaVerCliente();
            panelDeEscritorio.add(instanciaVerCliente);
        }else if(instanciaVerCliente.isVisible()==false)
            instanciaVerCliente.setVisible(true);
        instanciaVerCliente.show();
        return instanciaVerCliente;
    }
    public synchronized VistaVerDoctor getInstanciaVerDoctor(){
        if (instanciaVerDoctor == null) {
            instanciaVerDoctor = new VistaVerDoctor();
            panelDeEscritorio.add(instanciaVerDoctor);
        }else if(instanciaVerDoctor.isVisible()==false)
            instanciaVerDoctor.setVisible(true);
        instanciaVerDoctor.show();
        return instanciaVerDoctor;
    }
    public synchronized VistaVerMascota getInstanciaVerMascota(){
        if (instanciaVerMascota == null) {
            instanciaVerMascota = new VistaVerMascota();
            panelDeEscritorio.add(instanciaVerMascota);
        }else if(instanciaVerMascota.isVisible()==false)
            instanciaVerMascota.setVisible(true);
        instanciaVerMascota.show();
        return instanciaVerMascota;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //metodos con instancias
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        panelDeEscritorio = new javax.swing.JDesktopPane();
        menuItemVentanta = new javax.swing.JMenuBar();
        menuAgregar = new javax.swing.JMenu();
        itemAgregarRol = new javax.swing.JMenuItem();
        itemAgregarUsuario = new javax.swing.JMenuItem();
        itemAgregarServicio = new javax.swing.JMenuItem();
        itemAgregarEmail = new javax.swing.JMenuItem();
        itemAgregarTelefono = new javax.swing.JMenuItem();
        itemAgregarCita = new javax.swing.JMenuItem();
        itemAgregarEmpleado = new javax.swing.JMenuItem();
        itemAgregarCliente = new javax.swing.JMenuItem();
        itemAgregarMascota = new javax.swing.JMenuItem();
        itemAgregarDoctor = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenu();
        itemActualizarRol = new javax.swing.JMenuItem();
        itemActualizarUsuario1 = new javax.swing.JMenuItem();
        itemActualizarServicio1 = new javax.swing.JMenuItem();
        itemActualizarEmail1 = new javax.swing.JMenuItem();
        itemActualizarTelefono1 = new javax.swing.JMenuItem();
        itemActualizarCita1 = new javax.swing.JMenuItem();
        itemActualizarEmpleado1 = new javax.swing.JMenuItem();
        itemActualizarCliente1 = new javax.swing.JMenuItem();
        itemActualizarMascota1 = new javax.swing.JMenuItem();
        itemActualizarDoctor1 = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        itemVerDireccion = new javax.swing.JMenuItem();
        itemEliminarRol2 = new javax.swing.JMenuItem();
        itemEliminarUsuario3 = new javax.swing.JMenuItem();
        itemEliminarServicio3 = new javax.swing.JMenuItem();
        itemEliminarEmail3 = new javax.swing.JMenuItem();
        itemEliminarTelefono3 = new javax.swing.JMenuItem();
        itemEliminarCita3 = new javax.swing.JMenuItem();
        itemEliminarEmpleado3 = new javax.swing.JMenuItem();
        itemEliminarCliente3 = new javax.swing.JMenuItem();
        itemEliminarMascota3 = new javax.swing.JMenuItem();
        itemEliminarrDoctor3 = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenu();
        itemEliminarRol1 = new javax.swing.JMenuItem();
        itemEliminarUsuario2 = new javax.swing.JMenuItem();
        itemEliminarServicio2 = new javax.swing.JMenuItem();
        itemEliminarEmail2 = new javax.swing.JMenuItem();
        itemEliminarTelefono2 = new javax.swing.JMenuItem();
        itemEliminarCita2 = new javax.swing.JMenuItem();
        itemEliminarEmpleado2 = new javax.swing.JMenuItem();
        itemEliminarCliente2 = new javax.swing.JMenuItem();
        itemEliminarMascota2 = new javax.swing.JMenuItem();
        itemEliminarrDoctor2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENTANA PRINCIPAL");

        panelDeEscritorio.setBackground(new java.awt.Color(0, 0, 0));
        panelDeEscritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDeEscritorio.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelDeEscritorioLayout = new javax.swing.GroupLayout(panelDeEscritorio);
        panelDeEscritorio.setLayout(panelDeEscritorioLayout);
        panelDeEscritorioLayout.setHorizontalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1484, Short.MAX_VALUE)
        );
        panelDeEscritorioLayout.setVerticalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );

        menuAgregar.setText("Agregar");

        itemAgregarRol.setText("Agregar Rol");
        itemAgregarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarRolActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarRol);

        itemAgregarUsuario.setText("Agregar Usuario");
        itemAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarUsuarioActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarUsuario);

        itemAgregarServicio.setText("Agregar Servicio");
        itemAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarServicioActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarServicio);

        itemAgregarEmail.setText("Agregar Email");
        itemAgregarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEmailActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarEmail);

        itemAgregarTelefono.setText("Agregar Teléfono");
        itemAgregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarTelefonoActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarTelefono);

        itemAgregarCita.setText("Agregar Cita");
        itemAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarCitaActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarCita);

        itemAgregarEmpleado.setText("Agregar Empleado");
        itemAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEmpleadoActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarEmpleado);

        itemAgregarCliente.setText("Agregar Cliente");
        itemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarClienteActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarCliente);

        itemAgregarMascota.setText("Agregar Mascota");
        itemAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarMascotaActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarMascota);

        itemAgregarDoctor.setText("Agregar Doctor");
        itemAgregarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarDoctorActionPerformed(evt);
            }
        });
        menuAgregar.add(itemAgregarDoctor);

        menuItemVentanta.add(menuAgregar);

        menuActualizar.setText("Actualizar");

        itemActualizarRol.setText("Actualizar Rol");
        itemActualizarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarRolActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarRol);

        itemActualizarUsuario1.setText("Actualizar Usuario");
        itemActualizarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarUsuario1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarUsuario1);

        itemActualizarServicio1.setText("Actualizar Servicio");
        itemActualizarServicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarServicio1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarServicio1);

        itemActualizarEmail1.setText("Actualizar Email");
        itemActualizarEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarEmail1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarEmail1);

        itemActualizarTelefono1.setText("Actualizar Teléfono");
        itemActualizarTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarTelefono1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarTelefono1);

        itemActualizarCita1.setText("Actualizar Cita");
        itemActualizarCita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarCita1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarCita1);

        itemActualizarEmpleado1.setText("Actualizar Empleado");
        itemActualizarEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarEmpleado1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarEmpleado1);

        itemActualizarCliente1.setText("Actualizar Cliente");
        itemActualizarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarCliente1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarCliente1);

        itemActualizarMascota1.setText("Actualizar Mascota");
        itemActualizarMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarMascota1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarMascota1);

        itemActualizarDoctor1.setText("Actualizar Doctor");
        itemActualizarDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarDoctor1ActionPerformed(evt);
            }
        });
        menuActualizar.add(itemActualizarDoctor1);

        menuItemVentanta.add(menuActualizar);

        menuVer.setText("Ver");

        itemVerDireccion.setText("Ver Direcciones");
        itemVerDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerDireccionActionPerformed(evt);
            }
        });
        menuVer.add(itemVerDireccion);

        itemEliminarRol2.setText("Ver Rol");
        itemEliminarRol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarRol2ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarRol2);

        itemEliminarUsuario3.setText("Ver Usuario");
        itemEliminarUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarUsuario3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarUsuario3);

        itemEliminarServicio3.setText("Ver Servicio");
        itemEliminarServicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarServicio3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarServicio3);

        itemEliminarEmail3.setText("Ver Email");
        itemEliminarEmail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarEmail3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarEmail3);

        itemEliminarTelefono3.setText("Ver Telefono");
        itemEliminarTelefono3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarTelefono3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarTelefono3);

        itemEliminarCita3.setText("Ver Cita");
        itemEliminarCita3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCita3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarCita3);

        itemEliminarEmpleado3.setText("Ver Empleado");
        itemEliminarEmpleado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarEmpleado3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarEmpleado3);

        itemEliminarCliente3.setText("Ver Cliente");
        itemEliminarCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCliente3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarCliente3);

        itemEliminarMascota3.setText("Ver Mascota");
        itemEliminarMascota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarMascota3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarMascota3);

        itemEliminarrDoctor3.setText("Ver Doctor");
        itemEliminarrDoctor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarrDoctor3ActionPerformed(evt);
            }
        });
        menuVer.add(itemEliminarrDoctor3);

        menuItemVentanta.add(menuVer);

        menuEliminar.setText("Eliminar");

        itemEliminarRol1.setText("Eliminar Rol");
        itemEliminarRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarRol1ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarRol1);

        itemEliminarUsuario2.setText("Eliminar Usuario");
        itemEliminarUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarUsuario2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarUsuario2);

        itemEliminarServicio2.setText("Eliminar Servicio");
        itemEliminarServicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarServicio2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarServicio2);

        itemEliminarEmail2.setText("Eliminar Email");
        itemEliminarEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarEmail2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarEmail2);

        itemEliminarTelefono2.setText("Eliminar Teléfono");
        itemEliminarTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarTelefono2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarTelefono2);

        itemEliminarCita2.setText("Eliminar Cita");
        itemEliminarCita2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCita2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarCita2);

        itemEliminarEmpleado2.setText("Eliminar Empleado");
        itemEliminarEmpleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarEmpleado2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarEmpleado2);

        itemEliminarCliente2.setText("Eliminar Cliente");
        itemEliminarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCliente2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarCliente2);

        itemEliminarMascota2.setText("Eliminar Mascota");
        itemEliminarMascota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarMascota2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarMascota2);

        itemEliminarrDoctor2.setText("Eliminar Doctor");
        itemEliminarrDoctor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarrDoctor2ActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarrDoctor2);

        menuItemVentanta.add(menuEliminar);

        setJMenuBar(menuItemVentanta);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeEscritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarRolActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarRol();
    }//GEN-LAST:event_itemAgregarRolActionPerformed

    private void itemAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarUsuarioActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarUsuario();
    }//GEN-LAST:event_itemAgregarUsuarioActionPerformed

    private void itemAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarServicioActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarServicio();
    }//GEN-LAST:event_itemAgregarServicioActionPerformed

    private void itemAgregarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEmailActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarEmail();
    }//GEN-LAST:event_itemAgregarEmailActionPerformed

    private void itemAgregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarTelefonoActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarTelefono();
    }//GEN-LAST:event_itemAgregarTelefonoActionPerformed

    private void itemAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarCitaActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCita();
    }//GEN-LAST:event_itemAgregarCitaActionPerformed

    private void itemAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEmpleadoActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarEmpleado();
    }//GEN-LAST:event_itemAgregarEmpleadoActionPerformed

    private void itemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarClienteActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCliente();
    }//GEN-LAST:event_itemAgregarClienteActionPerformed

    private void itemAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarMascotaActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarMascota();
    }//GEN-LAST:event_itemAgregarMascotaActionPerformed

    private void itemAgregarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarDoctorActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarDoctor();
    }//GEN-LAST:event_itemAgregarDoctorActionPerformed

    private void itemActualizarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarRolActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarRol();
    }//GEN-LAST:event_itemActualizarRolActionPerformed

    private void itemActualizarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarUsuario1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarUsuario();
    }//GEN-LAST:event_itemActualizarUsuario1ActionPerformed

    private void itemActualizarServicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarServicio1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarServicio();
    }//GEN-LAST:event_itemActualizarServicio1ActionPerformed

    private void itemActualizarEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarEmail1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarEmail();
    }//GEN-LAST:event_itemActualizarEmail1ActionPerformed

    private void itemActualizarTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarTelefono1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarTelefono();
    }//GEN-LAST:event_itemActualizarTelefono1ActionPerformed

    private void itemActualizarCita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarCita1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarCita();
    }//GEN-LAST:event_itemActualizarCita1ActionPerformed

    private void itemActualizarEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarEmpleado1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarEmpleado();
    }//GEN-LAST:event_itemActualizarEmpleado1ActionPerformed

    private void itemActualizarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarCliente1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarCliente();
    }//GEN-LAST:event_itemActualizarCliente1ActionPerformed

    private void itemActualizarMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarMascota1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarMascota();
    }//GEN-LAST:event_itemActualizarMascota1ActionPerformed

    private void itemActualizarDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarDoctor1ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarDoctor();
    }//GEN-LAST:event_itemActualizarDoctor1ActionPerformed

    private void itemEliminarRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarRol1ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarRol();
    }//GEN-LAST:event_itemEliminarRol1ActionPerformed

    private void itemEliminarUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarUsuario2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarUsuario();
    }//GEN-LAST:event_itemEliminarUsuario2ActionPerformed

    private void itemEliminarServicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarServicio2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarServicio();
    }//GEN-LAST:event_itemEliminarServicio2ActionPerformed

    private void itemEliminarEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarEmail2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarEmail();
    }//GEN-LAST:event_itemEliminarEmail2ActionPerformed

    private void itemEliminarTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarTelefono2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarTelefono();
    }//GEN-LAST:event_itemEliminarTelefono2ActionPerformed

    private void itemEliminarCita2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCita2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCita();
    }//GEN-LAST:event_itemEliminarCita2ActionPerformed

    private void itemEliminarEmpleado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarEmpleado2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarEmpleado();
    }//GEN-LAST:event_itemEliminarEmpleado2ActionPerformed

    private void itemEliminarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCliente2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCliente();
    }//GEN-LAST:event_itemEliminarCliente2ActionPerformed

    private void itemEliminarMascota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarMascota2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarMascota();
    }//GEN-LAST:event_itemEliminarMascota2ActionPerformed

    private void itemEliminarrDoctor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarrDoctor2ActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarDoctor();
    }//GEN-LAST:event_itemEliminarrDoctor2ActionPerformed

    private void itemVerDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerDireccionActionPerformed
        // TODO add your handling code here:
        getInstanciaVerDireccion();
    }//GEN-LAST:event_itemVerDireccionActionPerformed

    private void itemEliminarRol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarRol2ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerRol();
    }//GEN-LAST:event_itemEliminarRol2ActionPerformed

    private void itemEliminarUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarUsuario3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerUsuario();
    }//GEN-LAST:event_itemEliminarUsuario3ActionPerformed

    private void itemEliminarServicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarServicio3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerServicio();
    }//GEN-LAST:event_itemEliminarServicio3ActionPerformed

    private void itemEliminarEmail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarEmail3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerEmail();
    }//GEN-LAST:event_itemEliminarEmail3ActionPerformed

    private void itemEliminarTelefono3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarTelefono3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerTelefono();
    }//GEN-LAST:event_itemEliminarTelefono3ActionPerformed

    private void itemEliminarCita3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCita3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerCita();
    }//GEN-LAST:event_itemEliminarCita3ActionPerformed

    private void itemEliminarEmpleado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarEmpleado3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerEmpleado();
    }//GEN-LAST:event_itemEliminarEmpleado3ActionPerformed

    private void itemEliminarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCliente3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerCliente();
    }//GEN-LAST:event_itemEliminarCliente3ActionPerformed

    private void itemEliminarMascota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarMascota3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerMascota();
    }//GEN-LAST:event_itemEliminarMascota3ActionPerformed

    private void itemEliminarrDoctor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarrDoctor3ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerDoctor();
    }//GEN-LAST:event_itemEliminarrDoctor3ActionPerformed


    class FondoPanel extends  JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/org/ricardocolindres/recurso/login.jpg")).getImage();
            
            g.drawImage(imagen, 1500, 750, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemActualizarCita1;
    private javax.swing.JMenuItem itemActualizarCliente1;
    private javax.swing.JMenuItem itemActualizarDoctor1;
    private javax.swing.JMenuItem itemActualizarEmail1;
    private javax.swing.JMenuItem itemActualizarEmpleado1;
    private javax.swing.JMenuItem itemActualizarMascota1;
    private javax.swing.JMenuItem itemActualizarRol;
    private javax.swing.JMenuItem itemActualizarServicio1;
    private javax.swing.JMenuItem itemActualizarTelefono1;
    private javax.swing.JMenuItem itemActualizarUsuario1;
    private javax.swing.JMenuItem itemAgregarCita;
    private javax.swing.JMenuItem itemAgregarCliente;
    private javax.swing.JMenuItem itemAgregarDoctor;
    private javax.swing.JMenuItem itemAgregarEmail;
    private javax.swing.JMenuItem itemAgregarEmpleado;
    private javax.swing.JMenuItem itemAgregarMascota;
    private javax.swing.JMenuItem itemAgregarRol;
    private javax.swing.JMenuItem itemAgregarServicio;
    private javax.swing.JMenuItem itemAgregarTelefono;
    private javax.swing.JMenuItem itemAgregarUsuario;
    private javax.swing.JMenuItem itemEliminarCita2;
    private javax.swing.JMenuItem itemEliminarCita3;
    private javax.swing.JMenuItem itemEliminarCliente2;
    private javax.swing.JMenuItem itemEliminarCliente3;
    private javax.swing.JMenuItem itemEliminarEmail2;
    private javax.swing.JMenuItem itemEliminarEmail3;
    private javax.swing.JMenuItem itemEliminarEmpleado2;
    private javax.swing.JMenuItem itemEliminarEmpleado3;
    private javax.swing.JMenuItem itemEliminarMascota2;
    private javax.swing.JMenuItem itemEliminarMascota3;
    private javax.swing.JMenuItem itemEliminarRol1;
    private javax.swing.JMenuItem itemEliminarRol2;
    private javax.swing.JMenuItem itemEliminarServicio2;
    private javax.swing.JMenuItem itemEliminarServicio3;
    private javax.swing.JMenuItem itemEliminarTelefono2;
    private javax.swing.JMenuItem itemEliminarTelefono3;
    private javax.swing.JMenuItem itemEliminarUsuario2;
    private javax.swing.JMenuItem itemEliminarUsuario3;
    private javax.swing.JMenuItem itemEliminarrDoctor2;
    private javax.swing.JMenuItem itemEliminarrDoctor3;
    private javax.swing.JMenuItem itemVerDireccion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu menuActualizar;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenuBar menuItemVentanta;
    private javax.swing.JMenu menuVer;
    private javax.swing.JDesktopPane panelDeEscritorio;
    // End of variables declaration//GEN-END:variables
}
