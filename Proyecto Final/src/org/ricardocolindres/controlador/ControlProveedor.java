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
import org.ricardocolindres.modelo.Proveedor;
/**
 *
 * @author colin
 */
public class ControlProveedor {
    private static ArrayList<Proveedor> citas;
    private static ControlProveedor instancia = null; 
    
    public ControlProveedor(){
        citas = new ArrayList<Proveedor>();
        enlistaProveedor();
    }
    public static ControlProveedor getInstancia(){
        if(instancia == null){
            instancia = new ControlProveedor();
        }
        return instancia;
    }
    public void agregarProveedor(Proveedor cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarProveedor(?,?);");
        sentencia.setString(1, cliente.getProveedor());
        sentencia.setBoolean(2, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha registraso en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }   
    }
    public void actualizarProveedor(Proveedor cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarProveedor(?,?,?);");
        sentencia.setInt(1, cliente.getId());
        sentencia.setString(2, cliente.getProveedor());
        sentencia.setBoolean(3, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un proveedor en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    
    public void eliminarProveedor(Proveedor cliente){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarProveedor(?);");
                sentencia.setInt(1, cliente.getId());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un proveedor de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaProveedor(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaCliente()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Proveedor cliente = new Proveedor();
            cliente.setId(resultado.getInt(1));
            cliente.setProveedor(resultado.getNString(2));
            cliente.setEstado(resultado.getBoolean(3));
            citas.add(cliente);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeProveedor(){
        return citas.size();
    }
    public ArrayList<Proveedor> listaDeProveedores(){
        return citas;
    }
}
