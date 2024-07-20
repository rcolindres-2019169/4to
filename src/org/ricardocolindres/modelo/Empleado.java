/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Doctor representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Empleado {
    //declarar variables
    private int id_empleado;
    private String nombre;
    private String apellido;
    private int id_telefono;
    private int id_email;
    private int id_rol;
    private int id_usuario;
    private boolean estado_activo;

/**
     * Valor vacio del constructor de Doctor
     */
   
    //metodos
    public Empleado(){}
    
    /**
     * Valor explicito de las caracteristicas de Doctor
     * @param id_empleado del Empleado
     * @param nombre del Empleado
     * @param apellido del Empleado
     * @param id_telefono del Empleado
     * @param id_email del Empleado
     * @param id_rol del Empelado
     * @param id_usuario del Empleado
     * @param estado_activo del Empleado
     */
    public Empleado(int id_empleado, String nombre, String apellido, int id_telefono, int id_email, int id_rol, int id_usuario, boolean estado_activo){
    	this.id_empleado = id_empleado;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.id_telefono = id_telefono;
    	this.id_email = id_email;
    	this.id_rol = id_rol;
        this.id_usuario = id_usuario;
        this.estado_activo = estado_activo;
    	}
    // getters y setters
     
    
    public int getId() {
    	return id_empleado;
    }
    public void setId(int idEmpleado) {
    	this.id_empleado = idEmpleado;
    }

    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nomEmpleado) {
    	this.nombre = nomEmpleado;
    }

    public String getApellido() {
    	return apellido;
    }
    public void setApellido(String apeEmpleado) {
    	this.apellido = apeEmpleado;
    }
    public int getIdTelefono(){
        return id_telefono;
    }
    public void setIdTelefono(int telEmpleado){
        this.id_telefono = telEmpleado;
    }
    public int getIdEmail() {
    	return id_email;
    }
    public void setIdEmail(int emailEmpleado) {
    	this.id_email = emailEmpleado;
    }
    public int getIdRol(){
        return id_rol;
    }
    public void setIdRol(int rolEmpleado){
        this.id_rol = rolEmpleado;
    }
    public int getIdUsuario(){
        return id_usuario;
    }
    public void setIdUsuario(int usuarioEmpleado){
        this.id_usuario = usuarioEmpleado;
    }
    public boolean getEstadoEmpleado(){
            return estado_activo;
    }
    public void setEstadoEmpleado(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
   
}

