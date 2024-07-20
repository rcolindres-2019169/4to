/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Cliente representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */

public class Cliente {
    
    /**
     * id, nombre, apellido, numTelefono, email, direccion y deuenio son las caracteristicas del Cliente
     */
    private int id_cliente;
    private String nombre;
    private String apellido;
    private int id_email;
    private int id_telefono;
    private int id_direccion;
    private int id_usuario;
    private boolean estado_activo;
    /**
     * Valor vacio del constructor de Cliente
     */
    
    public Cliente(){}
    
    /**
     * Valor explicito del constructor de Cliente
     * @param id_cliente de Cliente
     * @param nombre de Cliente
     * @param apellido de Cliente   
     * @param id_email de Cliente
     * @param id_telefono de Cliente
     * @param id_direccion del Cliente
     * @param id_usuario del Cliente
     * @param estado_activo del Cliente
     */
    public Cliente(int id_cliente, String nombre, String apellido, int id_email, int id_telefono, int id_direccion, int id_usuario, boolean estado_activo){
    	this.id_cliente = id_cliente;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.id_email = id_email;
    	this.id_telefono = id_telefono;
        this.id_direccion = id_direccion;
        this.id_usuario = id_usuario;
        this.estado_activo = estado_activo;
    	}
    
    // getters y setters
    
    public int getIdCliente(){
        return id_cliente;
    }
    public void setIdCliente(int idCliente){
        this.id_cliente = idCliente;
    }
    public String getNombreCli(){
        return nombre;
    }
    public void setNombreCli(String nombreCliente){
        this.nombre = nombreCliente;
    }
    public String getApellidoCli(){
        return apellido;
    }
    public void setApellidoCli(String apellidoCliente){
        this.apellido = apellidoCliente;
    }
    public int getIdEmail(){
        return id_email;
    }
    public void setEmailCliente(int emailCliente){
        this.id_email = emailCliente;
    }
    public int getTelefonoCliente(){
        return id_telefono;
    }
    public void setTelefonoCliente(int telefonoCliente){
        this.id_telefono = telefonoCliente;
    }
    public int getDireccionCliente(){
        return id_direccion;
    }
    public void setDireccionCliente(int direccionCliente){
        this.id_direccion = direccionCliente;
    }
    public int getUsuarioCliente(){
        return id_usuario;
    }
    public void setUsuarioCliente(int usuarioCliente){
        this.id_usuario = usuarioCliente;
    }
    public boolean getEstadoCliente(){
            return estado_activo;
    }
    public void setEstadoCliente(boolean estado_activo){
            this.estado_activo = estado_activo;
    }

    
}
