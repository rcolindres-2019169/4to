/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Email;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author colin
 */
public class ControlDeEmail {
    private static ArrayList<Email> citas;
    private static ControlDeEmail instancia = null;    
    
    public ControlDeEmail(){
        citas = new ArrayList<Email>();
        enlistaEmail();
    }
    public static ControlDeEmail getInstancia(){
        if(instancia == null){
            instancia = new ControlDeEmail();
        }
        return instancia;
    }
    public void agregarEmail(Email email){
        try {
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarEmail(?,?,?);");
        sentencia.setString(1, email.getEmailPer());
        sentencia.setString(2, email.getEmailLab());
        sentencia.setBoolean(3, true);
        sentencia.execute();    
        JOptionPane.showMessageDialog(null, "Se ha guardado un email en la DB");
        } catch (Exception error) {
        error.printStackTrace();
        }
    }
    
    public void actualizarEmail(Email email){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarEmail(?,?,?,?);");
            sentencia.setInt(1, email.getIdEmail());
            sentencia.setString(2, email.getEmailPer());
            sentencia.setString(3, email.getEmailLab());
            sentencia.setBoolean(4, true);
            JOptionPane.showMessageDialog(null, "Se ha actualizado un email en la DB");
        } catch (Exception error) {
            error.printStackTrace();;
        }
    }
    
    public void eliminarEmail (Email email){
            try{
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarEmail(?);");
                sentencia.setInt(1, email.getIdEmail());
                sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un email de la BD");
            }catch(Exception error){
            error.printStackTrace();
            }
    }
    public void enlistaEmail(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaEmail()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Email libro = new Email();
            libro.setIdEmail(resultado.getInt(1));
            libro.setEmailPer(resultado.getNString(2));
            libro.setEmailLab(resultado.getNString(3));
            libro.setEstadoEmail(resultado.getBoolean(4));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Email> listaDeDireccions(){
        return citas;
    }
}
