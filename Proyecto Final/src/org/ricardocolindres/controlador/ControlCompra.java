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
import org.ricardocolindres.modelo.Compra;
/**
 *
 * @author colin
 */
public class ControlCompra {
    private static ArrayList<Compra> citas;
    private static ControlCompra instancia = null; 
    
    public ControlCompra(){
        citas = new ArrayList<Compra>();
        enlistaCompra();
    }
    public static ControlCompra getInstancia(){
        if(instancia == null){
            instancia = new ControlCompra();
        }
        return instancia;
    }
    public void agregarCompra(Compra cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarCompra(?,?,?,?);");
        sentencia.setString(1, cliente.getFecha());
        sentencia.setInt(2, cliente.getProducto());
        sentencia.setInt(3, cliente.getCliente());
        sentencia.setBoolean(4, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha registraso en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }   
    }
    public void actualizarCompra(Compra cliente){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCompra(?,?,?,?,?);");
        sentencia.setInt(1, cliente.getId());
        sentencia.setString(2, cliente.getFecha());
        sentencia.setInt(3, cliente.getProducto());
        sentencia.setInt(4, cliente.getCliente());
        sentencia.setBoolean(5, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado una compra en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarCompra(Compra cliente){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCompra(?);");
                sentencia.setInt(1, cliente.getId());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado una compra de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaCompra(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaCompra()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Compra cliente = new Compra();
            cliente.setId(resultado.getInt(1));
            cliente.setFecha(resultado.getNString(2));
            cliente.setProducto(resultado.getInt(3));
            cliente.setCliente(resultado.getInt(4));
            cliente.setEstado(resultado.getBoolean(5));
            citas.add(cliente);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeCompra(){
        return citas.size();
    }
    public ArrayList<Compra> listaDeCompras(){
        return citas;
    }
}
