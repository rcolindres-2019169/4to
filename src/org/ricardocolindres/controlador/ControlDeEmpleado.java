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
import org.ricardocolindres.modelo.Empleado;

/**
 *
 * @author colin
 */
public class ControlDeEmpleado {
    private static ArrayList<Empleado> citas;
    private static ControlDeEmpleado instancia = null;    
    
    public ControlDeEmpleado(){
        citas = new ArrayList<Empleado>();
        enlistaEmpleado();
    }
    public static ControlDeEmpleado getInstancia(){
        if(instancia == null){
            instancia = new ControlDeEmpleado();
        }
        return instancia;
    }
    public void agregarEmpleado(Empleado empleado){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarEmpleado(?,?,?,?,?;?,?);");
        sentencia.setString(1, empleado.getNombre());
        sentencia.setString(2, empleado.getApellido());
        sentencia.setInt(3, empleado.getIdTelefono());
        sentencia.setInt(4, empleado.getIdEmail());
        sentencia.setInt(5, empleado.getIdRol());
        sentencia.setInt(6, empleado.getIdUsuario());
        sentencia.setBoolean(7, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado un empleado en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    public void actualizarEmpleado(Empleado empleado){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarEmpleado(?,?,?,?,?,?;?,?);");
        sentencia.setInt(1, empleado.getId());
        sentencia.setString(2, empleado.getNombre());
        sentencia.setString(3, empleado.getApellido());
        sentencia.setInt(4, empleado.getIdTelefono());
        sentencia.setInt(5, empleado.getIdEmail());
        sentencia.setInt(6, empleado.getIdRol());
        sentencia.setInt(7, empleado.getIdUsuario());
        sentencia.setBoolean(8, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un empleado en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    public void eliminarEmpleado (Empleado empleado){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarEmpleado(?);");
                sentencia.setInt(1, empleado.getId());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un empleado de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaEmpleado(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaEmpleado()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Empleado libro = new Empleado();
            libro.setId(resultado.getInt(1));
            libro.setNombre(resultado.getNString(2));
            libro.setApellido(resultado.getNString(3));
            libro.setIdEmail(resultado.getInt(4));
            libro.setIdTelefono(resultado.getInt(5));
            libro.setIdRol(resultado.getInt(6));
            libro.setIdUsuario(resultado.getInt(7));
            libro.setEstadoEmpleado(resultado.getBoolean(8));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Empleado> listaDeDireccions(){
        return citas;
    }
}
