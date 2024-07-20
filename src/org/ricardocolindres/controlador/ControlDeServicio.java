/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Servicio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author colin
 */
public class   ControlDeServicio{ 
    private static ArrayList<Servicio> citas;
    private static ControlDeServicio instancia = null;    
    
    public ControlDeServicio(){
        citas = new ArrayList<Servicio>();
        enlistaServicio();
    }
    public static ControlDeServicio getInstancia(){
        if(instancia == null){
            instancia = new ControlDeServicio();
        }
        return instancia;
    }
    public void agregarServicio(Servicio servicio){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarServicio(?,?,?);");
        sentencia.setString(1, servicio.getServicio());
        sentencia.setString(2, servicio.getCosto());
        sentencia.setBoolean(3, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado un servicio en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    
    public void actualizarServicio(Servicio servicio){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarServicio(?,?,?,?);");
            sentencia.setInt(1, servicio.getIdServicio());
            sentencia.setString(2, servicio.getServicio());
            sentencia.setString(2, servicio.getCosto());
            sentencia.setBoolean(4, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un servicio en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    
    public void eliminarServicio (Servicio servicio){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarServicio(?);");
                sentencia.setInt(1, servicio.getIdServicio());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un servicio de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaServicio(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaServicio()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Servicio libro = new Servicio();
            libro.setIdServicio(resultado.getInt(1));
            libro.setServicio(resultado.getNString(2));
            libro.setCosto(resultado.getNString(3));
            libro.setServicioEstado(resultado.getBoolean(4));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Servicio> listaDeDireccions(){
        return citas;
    }

}