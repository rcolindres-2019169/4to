/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Rol;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author colin
 */
public class ControlDeRol {
    private static ArrayList<Rol> citas;
    private static ControlDeRol instancia = null;    
    
    public ControlDeRol(){
        citas = new ArrayList<Rol>();
        enlistaRol();
    }
    public static ControlDeRol getInstancia(){
        if(instancia == null){
            instancia = new ControlDeRol();
        }
        return instancia;
    }
    public void agregarRol(Rol rol){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarRol(?,?);");
            sentencia.setString(1, rol.getRol());
            sentencia.setBoolean(2, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se ha guardado un rol en la BD");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    
    public void actualizarRol (Rol rol){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarRol(?,?,?);");
                sentencia.setInt(1, rol.getIRol());
                sentencia.setString(2, rol.getRol());
                sentencia.setBoolean(3, true);
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un rol de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void eliminarRol(Rol rol){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarRol(?)");
            sentencia.setInt(1, rol.getIRol());
            JOptionPane.showMessageDialog(null, "Ha eliminado un rol de la BD");
        } catch (Exception e) {
        }
    }
    public void enlistaRol(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaRol()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Rol libro = new Rol();
            libro.setIdRol(resultado.getInt(1));
            libro.setRol(resultado.getNString(2));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Rol> listaDeDireccions(){
        return citas;
    }
}
