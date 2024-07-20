
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
    private int id;
    private String nombre;
    private String apellido;
    private int numTelefono;
    private String email;
    private String duenio;
    /**
     * Valor vacio del constructor de Cliente
     */
    
    public Cliente(){}
    
    /**
     * Valor explicito del constructor de Cliente
     * @param id id de Cliente
     * @param nombre de Cliente
     * @param apellido de Cliente
     * @param numTelefono de Cliente
     * @param email email de Cliente
     * @param duenio  duenoi de la mascota del Cliente
     */
    public Cliente(int id, String nombre, String apellido, int numTelefono,  String email, String duenio){
    	this.id = id;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.email = email;
    	this.duenio = duenio;
    	}
    
    // getters y setters
    
    public int getIdCl(){
        return id;
    }
    public void setIdCl(int idCliente){
        this.id = idCliente;
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
    public int getNumCliente(){
        return numTelefono;
    }
    public void setNumCliente(int numeroCliente){
        this.numTelefono = numeroCliente;
    }
    public String getEmailClie(){
        return email;
    }
    public void setEmailClie(String emailCliente){
        this.email = emailCliente;
    }
    public String getDuenioClie(){
        return duenio;
    }
    public void setDuenioClie(String duenioCliente){
        this.duenio = duenioCliente;
    }

    
}
