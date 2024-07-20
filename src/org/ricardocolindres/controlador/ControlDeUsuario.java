/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author colin
 */
public class ControlDeUsuario {
    private static ArrayList<Usuario> usuarios;
    private static ControlDeUsuario instancia = null;
    
    public ControlDeUsuario(){
        usuarios = new ArrayList<Usuario>();
        enlistaUsuario();
        //iniciarSesion();
    }
    public static ControlDeUsuario getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeUsuario();
        }
        return instancia;
    }
    
    public int cantidadDeInicio(){
        return usuarios.size();
    }
    
    public ArrayList<Usuario> listaDeInicio(){
        return usuarios;
    }
    
    public void agregarUsuario(Usuario usuario){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarUsuario(?,?,?);");
            sentencia.setString(1, usuario.getUsuario());
            sentencia.setString(2, usuario.getContrasenia());
            sentencia.setBoolean(3, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se ha guardado un usuario en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    public void actualizarUsuario (Usuario usuario){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarUsuario(?,?,?,?);");
                sentencia.setInt(1, usuario.getIUsuario());
                sentencia.setString(2, usuario.getUsuario());
                sentencia.setString(3, usuario.getContrasenia());
                sentencia.setBoolean(4, true);
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un usuario de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void eliminarUsuario (Usuario usuario){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarUsuario(?);");
                sentencia.setInt(1, usuario.getIUsuario());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un usuario de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    
    public boolean iniciarSesion(Usuario usuario){
        Usuario usuarioDB = new Usuario();
        JOptionPane.showMessageDialog(null, usuario.getUsuario()+ usuario.getContrasenia().toString());
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_login(?,?);");
                sentencia.setString(1, usuario.getUsuario());
                sentencia.setString(2, usuario.getContrasenia());
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    usuarioDB.setUsuario(resultado.getNString(1));
                    usuarioDB.setContrasenia(resultado.getNString(2));
                   if( usuario.getUsuario().equals(usuarioDB.getUsuario()) && String.valueOf(usuarioDB.getContrasenia()).equals(usuario.getContrasenia())) {
                    JOptionPane.showMessageDialog(null, "Ha iniciado sesion");
                    return true;
                    }
                }
            }catch(Exception error){
                error.printStackTrace();
            }
            return false;
    
    
    }
    
    public void enlistaUsuario(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaUsuario()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Usuario libro = new Usuario();
            libro.setIdUsuario(resultado.getInt(1));
            libro.setUsuario(resultado.getNString(2));
            libro.setContrasenia(resultado.getNString(3));
            libro.setEstadoUsuario(resultado.getBoolean(4));
            usuarios.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return usuarios.size();
    }
    public ArrayList<Usuario> listaDeDireccions(){
        return usuarios;
    }
}
