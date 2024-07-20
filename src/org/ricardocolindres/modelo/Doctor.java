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

public class Doctor {
    
    /**
     * id, nombre, apellido, especialidad, email, direccion y colegiado son las caracteristicas de Doctor
     */
//declarar variables
    private int id_doctor;
    private String nombre;
    private String apellido;
    private String especialidad;
    private int id_email;
    private int id_telefono;
    private int id_direccion;
    private int id_usuario;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Doctor
     */
   
    //metodos
    public Doctor(){}
    
    /**
     * Valor explicito de las caracteristicas de Doctor
     * @param id_doctor del Doctor
     * @param nombre del Doctor
     * @param apellido del Doctor
     * @param especialidad del Doctor
     * @param id_email del Doctor
     * @param id_telefono del Doctor
     * @param id_direccion del Doctor clinica
     * @param id_usuario del Doctor
     * @param estado_activo del Doctor
     */
    public Doctor(int id_doctor, String nombre, String apellido, String especialidad, int id_email, int id_telefono, int id_direccion, int id_usuario, boolean estado_activo){
    	this.id_doctor = id_doctor;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.especialidad = especialidad;
    	this.id_email = id_email;
    	this.id_telefono = id_telefono;
    	this.id_direccion = id_direccion;
        this.id_usuario = id_usuario;
        this.estado_activo = estado_activo;
    	}
    
    
    // getters y setters
     
    
    public int getId() {
    	return id_doctor;
    }
    public void setId(int idDoctor) {
    	this.id_doctor = idDoctor;
    }

    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nomDoctor) {
    	this.nombre = nomDoctor;
    }

    public String getApellido() {
    	return apellido;
    }
    public void setApellido(String apeDoctor) {
    	this.apellido = apeDoctor;
    }

    public String getEspecialidad(){
    	return especialidad;
    }
    public void setEspecialidad(String rolDoctor) {
    	this.especialidad = rolDoctor;
    }

    public int getIdEmail() {
    	return id_email;
    }
    public void setIdEmail(int emailDoctor) {
    	this.id_email = emailDoctor;
    }
    public int getIdTelefono(){
        return id_telefono;
    }
    public void setIdTelefono(int telDoctor){
        this.id_telefono = telDoctor;
    }
    public int getIdDireccion(){
        return id_direccion;
    }
    public void setIdDireccion(int dirDoctor){
        this.id_direccion = dirDoctor;
    }
    public int getIdUsuario(){
        return id_usuario;
    }
    public void setIdUsuario(int usuarioDoctor){
        this.id_usuario = usuarioDoctor;
    }
    public boolean getEstadoDoctor(){
            return estado_activo;
        }
        public void setEstadoDoctor(boolean estado_activo){
            this.estado_activo = estado_activo;
        }
}