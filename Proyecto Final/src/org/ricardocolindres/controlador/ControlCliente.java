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
 * @author informatica
 */
public class ControlCliente {
    private static ArrayList<Cliente> citas;
    private static ControlCliente instancia = null; 
    
    
    public ControlCliente(){
        citas = new ArrayList<Cliente>();
        enlistaCliente();
    }
    public static ControlCliente getInstancia(){
        if(instancia == null){
            instancia = new ControlCliente();
        }
        return instancia;
    }
    public void agregarCliente(Cliente cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarCliente(?,?,?,?,?,?,?,?,?,?);");
        sentencia.setString(1, cliente.getNombre());
        sentencia.setString(2, cliente.getApellido());
        sentencia.setString(3, cliente.getDireccion());
        sentencia.setString(4, cliente.getEmail());
        sentencia.setString(5, cliente.getTelefono());
        sentencia.setString(6, cliente.getNit());
        sentencia.setString(7, cliente.getUsuario());
        sentencia.setString(8, cliente.getConstraseña());
        sentencia.setBoolean(9, false);
        sentencia.setBoolean(10, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha registraso en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }   
    }
    public void actualizarCliente(Cliente cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCliente(?,?,?,?,?,?;?,?,?,?,?);");
        sentencia.setInt(1, cliente.getId());
        sentencia.setString(2, cliente.getNombre());
        sentencia.setString(3, cliente.getApellido());
        sentencia.setString(4, cliente.getDireccion());
        sentencia.setString(5, cliente.getEmail());
        sentencia.setString(6, cliente.getTelefono());
        sentencia.setString(7, cliente.getNit());
        sentencia.setString(8, cliente.getUsuario());
        sentencia.setString(9, cliente.getConstraseña());
        sentencia.setBoolean(10, false);
        sentencia.setBoolean(11, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un cliente en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarCliente (Cliente cliente){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCliente(?);");
                sentencia.setInt(1, cliente.getId());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un cliente de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public boolean iniciarSesion(Cliente usuario){
        Cliente usuarioDB = new Cliente();  
        JOptionPane.showMessageDialog(null, usuario.getUsuario()+ usuario.getConstraseña().toString());
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_login(?,?);");
                sentencia.setString(1, usuario.getUsuario());
                sentencia.setString(2, usuario.getConstraseña());
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    usuarioDB.setUsuario(resultado.getNString(1));
                    usuarioDB.setContraseña(resultado.getNString(2));
                   if( usuario.getUsuario().equals(usuarioDB.getUsuario()) && String.valueOf(usuarioDB.getConstraseña()).equals(usuario.getConstraseña())) {
                    JOptionPane.showMessageDialog(null, "Ha iniciado sesion");
                    return true;
                    }
                }
            }catch(Exception error){
                error.printStackTrace();
            }
            return false;
    
    
    }
    
    public void enlistaCliente(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaCliente()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Cliente cliente = new Cliente();
            cliente.setId(resultado.getInt(1));
            cliente.setNombre(resultado.getNString(2));
            cliente.setApellido(resultado.getNString(3));
            cliente.setDireccion(resultado.getNString(4));
            cliente.setEmail(resultado.getNString(5));
            cliente.setTelefono(resultado.getNString(6));
            cliente.setNit(resultado.getNString(7));
            cliente.setUsuario(resultado.getNString(8));
            cliente.setContraseña(resultado.getNString(9));
            cliente.setRol(resultado.getBoolean(10));
            cliente.setEstado(resultado.getBoolean(11));
            citas.add(cliente);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeCliente(){
        return citas.size();
    }
    public ArrayList<Cliente> listaDeClientes(){
        return citas;
    }
}
