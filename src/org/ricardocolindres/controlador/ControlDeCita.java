/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;

import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Cita;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author colin
 */
public class ControlDeCita {
    private static ArrayList<Cita> citas;
    private static ControlDeCita instancia = null;    
    
    public ControlDeCita(){
        citas = new ArrayList<Cita>();
        enlistaCita();
    }
    public static ControlDeCita getInstancia(){
        if(instancia == null){
            instancia = new ControlDeCita();
        }
        return instancia;
    }
    public void agregarCita(Cita cita){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarCita(?,?,?,?,?,?;?,?);");
        sentencia.setInt(1, cita.getIdCita());
        sentencia.setString(2, cita.getFecha());
        sentencia.setString(3, cita.getHora());
        sentencia.setInt(4, cita.getCosto());
        sentencia.setInt(5, cita.getCliente());
        sentencia.setInt(6, cita.getDoctor());
        sentencia.setInt(7, cita.getServicio());
        sentencia.setBoolean(8, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado una cita en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    public void actualizarCita(Cita cita){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCita(?,?,?,?,?;?,?);");
        sentencia.setString(1, cita.getFecha());
        sentencia.setString(2, cita.getHora());
        sentencia.setInt(3, cita.getCosto());
        sentencia.setInt(4, cita.getCliente());
        sentencia.setInt(5, cita.getDoctor());
        sentencia.setInt(6, cita.getServicio());
        sentencia.setBoolean(7, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado una cita en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarCita (Cita cita){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCita(?);");
                sentencia.setInt(1, cita.getIdCita());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado una cita de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaCita(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaCita()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Cita libro = new Cita();
            libro.setIdCita(resultado.getInt(1));
            libro.setFecha(resultado.getNString(2));
            libro.setHora(resultado.getNString(3));
            libro.setCosto(resultado.getInt(4));                
            libro.setCliente(resultado.getInt(5));  
            libro.setDoctor(resultado.getInt(6));
            libro.setServicio(resultado.getInt(7));  
            libro.setEstadoCita(resultado.getBoolean(8));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Cita> listaDeDireccions(){
        return citas;
    }
}
