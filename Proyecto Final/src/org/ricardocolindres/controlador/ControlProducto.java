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
import org.ricardocolindres.modelo.Producto;
/**
 *
 * @author colin
 */
public class ControlProducto {
    private static ArrayList<Producto> citas;
    private static ControlProducto instancia = null; 
    
    public ControlProducto(){
        citas = new ArrayList<Producto>();
        enlistaProducto();
    }
    public static ControlProducto getInstancia(){
        if(instancia == null){
            instancia = new ControlProducto();
        }
        return instancia;
    }
    public void agregarProducto(Producto cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarProducto(?,?,?,?);");
        sentencia.setString(1, cliente.getNombre());
        sentencia.setString(2, cliente.getPrecio());
        sentencia.setInt(3, cliente.getProveedor());
        sentencia.setBoolean(4, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha registraso en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }   
    }
    public void actualizarProducto(Producto cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarProducto(?,?,?,?,?);");
        sentencia.setInt(1, cliente.getId());
        sentencia.setString(2, cliente.getNombre());
        sentencia.setString(3, cliente.getPrecio());
        sentencia.setInt(4, cliente.getProveedor());
        sentencia.setBoolean(5, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un producto en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarProducto(Producto cliente){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarProducto(?);");
                sentencia.setInt(1, cliente.getId());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un producto de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaProducto(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaProducto()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Producto cliente = new Producto();
            cliente.setId(resultado.getInt(1));
            cliente.setNombre(resultado.getNString(2));
            cliente.setPrecio(resultado.getNString(3));
            cliente.setProveedor(resultado.getInt(4));
            cliente.setEstado(resultado.getBoolean(5));
            citas.add(cliente);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeProducto(){
        return citas.size();
    }
    public ArrayList<Producto> listaDeProductos(){
        return citas;
    }
}
