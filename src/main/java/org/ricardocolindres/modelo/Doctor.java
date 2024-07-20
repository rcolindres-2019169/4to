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
    private int id;
    private String nombre;
    private String apellido;
    private int numTelefono;
    private String especialidad;
    private String email;
    private String direccion;
    private int colegiado;
    
    /**
     * Valor vacio del constructor de Doctor
     */
   
    //metodos
    public Doctor(){}
    
    /**
     * Valor explicito de las caracteristicas de Doctor
     * @param id del Doctor
     * @param nombre del Doctor
     * @param apellido del Doctor
     * @param numTelefono del Doctor
     * @param especialidad del Doctor
     * @param email del Doctor
     * @param direccion del Doctor clinica
     * @param colegiado  del Doctor
     */
    public Doctor(int id, String nombre, String apellido, int numTelefono, String especialidad, String email, String direccion, int colegiado){
    	this.id = id;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.numTelefono = numTelefono;
    	this.especialidad = especialidad;
    	this.email = email;
    	this.direccion = direccion;
    	this.colegiado = colegiado;
    	}
    
    
    // getters y setters
     
    
    public int getId() {
    	return id;
    }
    public void setId(int idDoctor) {
    	this.id = idDoctor;
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

    public int getNumero() {
    	return numTelefono;
    }
    public void setNumero(int numDoctor) {
    	this.numTelefono = numDoctor;
    }

    public String getEspecialidad() {
    	return especialidad;
    }
    public void setEspecialidad(String espeDoctor) {
    	this.especialidad = espeDoctor;
    }

    public String getEmail() {
    	return email;
    }
    public void setEmail(String emailDoctor) {
    	this.email = emailDoctor;
    }

    public String getDireccion() {
    	return direccion;
    }
    public void setDireccion(String dirDoctor) {
    	this.direccion = dirDoctor;
    }

    public int getColegiado() {
    	return colegiado;
    }
    public void setColegiado(int colDoctor) {
    	this.colegiado = colDoctor;
    }
    
    
}