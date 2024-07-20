/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Usuario representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Usuario {
    //declarar variables
    private int id_usuario;
    private String usuario;
    private String contrasenia;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Usuario
     */
    
    //Metodos
    public Usuario(){}
        /** 
         * @param id_usuario de Usuario
         * @param usuario de Usuario
         * @param contrasenia de Usuario
         * @param estado_activo de Usuario
         */
    
    public Usuario(int id_usuario, String usuario, String contrasenia, boolean estado_activo){
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.estado_activo = estado_activo;
    }
    
    //getters y setters
    
    public int getIUsuario(){
        return id_usuario;
    }
    public void setIdUsuario(int idUsuario){
        this.id_usuario = idUsuario;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuarioUser){
        this.usuario = usuarioUser;  
    }
    public String getContrasenia(){
        return contrasenia;
    }
    public void setContrasenia(String contraseniaUser){
        this.contrasenia = contraseniaUser;
    }
    public boolean getEstadoUusario(){
            return estado_activo;
    }
    public void setEstadoUsuario(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
}

