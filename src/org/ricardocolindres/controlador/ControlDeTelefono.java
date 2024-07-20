/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Telefono;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author colin
 */
public class ControlDeTelefono {
    private static ArrayList<Telefono> citas;
    private static ControlDeTelefono instancia = null;    
    
    public ControlDeTelefono(){
        citas = new ArrayList<Telefono>();
        enlistaTelefono();
    }
    public static ControlDeTelefono getInstancia(){
        if(instancia == null){
            instancia = new ControlDeTelefono();
        }
        return instancia;
    }
    public void agregarTelefono(Telefono telefono){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarTelefono(?,?,?);");
        sentencia.setString(1, telefono.getTelefonoPer());
        sentencia.setString(2, telefono.getTelefonoLab());
        sentencia.setBoolean(3, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado un telefono en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    public void actualizarTelefono(Telefono telefono){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarTelefono(?,?,?,?);");
            sentencia.setInt(1, telefono.getIdTelefono());
            sentencia.setString(2, telefono.getTelefonoPer());
            sentencia.setString(3, telefono.getTelefonoLab());
            sentencia.setBoolean(4, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un telefono en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarTelefono(Telefono telefono){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarTelefono(?);");
                sentencia.setInt(1, telefono.getIdTelefono());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un telefono de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
     public void enlistaTelefono(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaTelefono()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Telefono libro = new Telefono();
            libro.setIdTelefono(resultado.getInt(1));
            libro.setTelefonoPer(resultado.getNString(2));
            libro.setTelefonoLab(resultado.getNString(3));
            libro.setEstadoTelefono(resultado.getBoolean(4));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
     public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Telefono> listaDeDireccions(){
        return citas;
    }
}
