/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.ricardocolindres.db.Conexion;
import org.ricardocolindres.modelo.Direccion;

/**
 *
 * @author colin
 */
public class ControlDeDireccion {
     private static ArrayList<Direccion> citas;
    private static ControlDeDireccion instancia = null;    
    
    public ControlDeDireccion(){
        citas = new ArrayList<Direccion>();
        enlistaDireccion();
    }
    public static ControlDeDireccion getInstancia(){
        if(instancia == null){
            instancia = new ControlDeDireccion();
        }
        return instancia;
    }
    public void enlistaDireccion(){        
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_enlistaDireccion()");
        ResultSet resultado = sentencia.executeQuery();
        while(resultado.next()){
            Direccion libro = new Direccion();
            libro.setIdDireccion(resultado.getInt(1));
            libro.setDireccion(resultado.getNString(2));
            libro.setDepartamento(resultado.getNString(3));
            libro.setMunicipio(resultado.getNString(4)); 
            libro.setEstadoDireccion(resultado.getBoolean(5));
            citas.add(libro);
        }
        }catch(Exception error){
            error.printStackTrace();
        }        
    }
    public int cantidadDeDireccion(){
        return citas.size();
    }
    public ArrayList<Direccion> listaDeDireccions(){
        return citas;
    }
}
