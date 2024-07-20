/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Rol representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Rol {
    //declarar variables
    private int id_rol;
    private String rol;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Rol
     */
    
    //Metodos
    public Rol(){}
        /** 
         * @param id_rol de Rol
         * @param rol de Rol
         * @param estado_activo de Rol
         */
    
    public Rol(int id_rol, String rol, boolean estado_activo){
        this.id_rol = id_rol;
        this.rol = rol;
        this.estado_activo = estado_activo;
    }
    
    //getters y setters
    
    public int getIRol(){
        return id_rol;
    }
    public void setIdRol(int idRol){
        this.id_rol = idRol;
    }
    public String getRol(){
        return rol;
    }
    public void setRol(String rolRol){
        this.rol = rolRol;  
    }
    public boolean getEstadoRol(){
            return estado_activo;
    }
    public void setEstadoRol(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
}
