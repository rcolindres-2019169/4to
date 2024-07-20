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
import org.ricardocolindres.modelo.Doctor;
/**
 *
 * @author colin
 */
public class ControlDeDoctor {
    private static ArrayList<Doctor> citas;
    private static ControlDeDoctor instancia = null;    
    
    public ControlDeDoctor(){
        citas = new ArrayList<Doctor>();
        enlistaDoctor();
    }
    public static ControlDeDoctor getInstancia(){
        if(instancia == null){
            instancia = new ControlDeDoctor();
        }
        return instancia;
    }
    public void agregarDoctor(Doctor doctor){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarDoctor(?,?,?,?,?;?,?,?);");
        sentencia.setString(1, doctor.getNombre());
        sentencia.setString(2, doctor.getApellido());
        sentencia.setString(3, doctor.getEspecialidad());
        sentencia.setInt(4, doctor.getIdEmail());
        sentencia.setInt(5, doctor.getIdTelefono());
        sentencia.setInt(6, doctor.getIdDireccion());
        sentencia.setInt(7, doctor.getIdUsuario());
        sentencia.setBoolean(8, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado un doctor en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    public void actualizarDoctor(Doctor doctor){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarDoctor(?,?,?,?,?,?;?,?,?);");
        sentencia.setInt(1, doctor.getId());
        sentencia.setString(2, doctor.getNombre());
        sentencia.setString(3, doctor.getApellido());
        sentencia.setString(4, doctor.getEspecialidad());
        sentencia.setInt(5, doctor.getIdEmail());
        sentencia.setInt(6, doctor.getIdTelefono());
        sentencia.setInt(7, doctor.getIdDireccion());
        sentencia.setInt(8, doctor.getIdUsuario());
        sentencia.setBoolean(9, true);
        sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado una doctor en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarDoctor(Doctor doctor){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarDoctor(?);");
                sentencia.setInt(1,doctor.getId());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un doctor de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaDoctor(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaDoctor()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Doctor libro = new Doctor();
            libro.setId(resultado.getInt(1));
            libro.setNombre(resultado.getNString(2));
            libro.setApellido(resultado.getNString(3));
            libro.setEspecialidad(resultado.getNString(4));
            libro.setIdEmail(resultado.getInt(5));                
            libro.setIdTelefono(resultado.getInt(6));  
            libro.setIdDireccion(resultado.getInt(7));
            libro.setIdUsuario(resultado.getInt(8));  
            libro.setEstadoDoctor(resultado.getBoolean(9));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Doctor> listaDeDireccions(){
        return citas;
    }
}
