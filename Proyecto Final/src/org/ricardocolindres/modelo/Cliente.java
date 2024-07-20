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
    //declarar variables
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private String telefono;
    private String nit;
    private String usuario;
    private String contraseña;
    private boolean rol;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Doctor
     */
   
    //metodos
    public Cliente(){}
    
    public Cliente(int id_cliente, String nombre, String apellido, String direccion, String email, String telefono, String nit, String usuario,
            String contraseña, boolean rol, boolean estado_activo){
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.nit = nit;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.estado_activo = estado_activo;
    }
    //getters y setters
    
    public int getId(){
        return id_cliente;
    }
    public void setId(int idCliente){
        this.id_cliente = idCliente;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreCliente){
        this.nombre = nombreCliente;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellidoCliente){
        this.apellido = apellidoCliente;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccionCliente){
        this.direccion = direccionCliente;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String emailCliente){
        this.email = emailCliente;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefonoCliente){
        this.telefono = telefonoCliente;
    }
    public String getNit(){
        return nit;
    }
    public void setNit(String nitCliente){
        this.nit = nitCliente;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuarioCliente){
        this.usuario = usuarioCliente;
    }
    public String getConstraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseñaCliente){
        this.contraseña = contraseñaCliente;
    }
    public boolean getRol(){
        return rol;
    }
    public void setRol(boolean rolCliente){
        this.rol = rolCliente;
    }
    public boolean getEstado(){
        return estado_activo;
    }
    public void setEstado (boolean  estadoCliente){
        this.estado_activo = estadoCliente;
    }
}
