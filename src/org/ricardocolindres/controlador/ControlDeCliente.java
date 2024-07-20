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
import org.ricardocolindres.modelo.Cliente;
/**
 *
 * @author colin
 */

    
public class ControlDeCliente {
    
    private static ArrayList<Cliente> citas;
    private static ControlDeCliente instancia = null;    
    
    public ControlDeCliente(){
        citas = new ArrayList<Cliente>();
        enlistaCliente();
    }
    public static ControlDeCliente getInstancia(){
        if(instancia == null){
            instancia = new ControlDeCliente();
        }
        return instancia;
    }
    public void agregarCliente(Cliente cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarCliente(?,?,?,?,?;?,?);");
        sentencia.setString(1, cliente.getNombreCli());
        sentencia.setString(2, cliente.getApellidoCli());
        sentencia.setInt(3, cliente.getIdEmail());
        sentencia.setInt(4, cliente.getTelefonoCliente());
        sentencia.setInt(5, cliente.getDireccionCliente());
        sentencia.setInt(6, cliente.getUsuarioCliente());
        sentencia.setBoolean(7, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado un cliente en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    public void actualizarCliente(Cliente cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCliente(?,?,?,?,?,?;?,?);");
        sentencia.setInt(1, cliente.getIdCliente());
        sentencia.setString(2, cliente.getNombreCli());
        sentencia.setString(3, cliente.getApellidoCli());
        sentencia.setInt(4, cliente.getIdEmail());
        sentencia.setInt(5, cliente.getTelefonoCliente());
        sentencia.setInt(6, cliente.getDireccionCliente());
        sentencia.setInt(7, cliente.getUsuarioCliente());
        sentencia.setBoolean(8, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un cliente en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarCliente (Cliente cliente){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCliente(?);");
                sentencia.setInt(1, cliente.getIdCliente());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un cliente de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
     public void enlistaCliente(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaCliente()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Cliente libro = new Cliente();
            libro.setIdCliente(resultado.getInt(1));
            libro.setNombreCli(resultado.getNString(2));
            libro.setApellidoCli(resultado.getNString(3));
            libro.setEmailCliente(resultado.getInt(4));                
            libro.setTelefonoCliente(resultado.getInt(5));  
            libro.setDireccionCliente(resultado.getInt(6));
            libro.setUsuarioCliente(resultado.getInt(7));  
            libro.setEstadoCliente(resultado.getBoolean(8));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
     public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Cliente> listaDeDireccions(){
        return citas;
    }
}
