/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Mascota;
/**
 *
 * @author colin
 */
public class ControlDeMascota {
    private static ArrayList<Mascota> citas;
    private static ControlDeMascota instancia = null;    
    
    public ControlDeMascota(){
        citas = new ArrayList<Mascota>();
        enlistaMascota();
    }
    public static ControlDeMascota getInstancia(){
        if(instancia == null){
            instancia = new ControlDeMascota();
        }
        return instancia;
    }
    public void agregarMascota(Mascota mascota){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarMascota(?,?,?,?,?;?,?);");
        sentencia.setString(1, mascota.getNombre());
        sentencia.setString(2, mascota.getEspecie());
        sentencia.setString(3, mascota.getRaza());
        sentencia.setString(4, mascota.getEdad());
        sentencia.setString(5, mascota.getGenero());
        sentencia.setInt(6, mascota.getClienteMascota());
        sentencia.setBoolean(7, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado una mascota en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    
    public void actualizarMascota(Mascota mascota){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarMascota(?,?,?,?,?,?;?,?);");
        sentencia.setInt(1, mascota.getIdMascota());
        sentencia.setString(2, mascota.getNombre());
        sentencia.setString(3, mascota.getEspecie());
        sentencia.setString(4, mascota.getRaza());
        sentencia.setString(5, mascota.getEdad());
        sentencia.setString(6, mascota.getGenero());
        sentencia.setInt(7, mascota.getClienteMascota());
        sentencia.setBoolean(8, true);
        sentencia.execute(); 
            JOptionPane.showMessageDialog(null, "Se ha actualizado una mascota en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarMascota(Mascota mascota){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarMascota(?);");
                sentencia.setInt(1, mascota.getIdMascota());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado una mascota de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaMascota(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaMascota()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Mascota libro = new Mascota();
            libro.setIdMascota(resultado.getInt(1));
            libro.setNombre(resultado.getNString(2));
            libro.setEspecie(resultado.getNString(3));
            libro.setRaza(resultado.getNString(4));
            libro.setEdad(resultado.getNString(5));
            libro.setGenero(resultado.getNString(6));
            libro.setClienteMascota(resultado.getInt(7));
            libro.setEstadoMascota(resultado.getBoolean(8));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Mascota> listaDeDireccions(){
        return citas;
    }
}
