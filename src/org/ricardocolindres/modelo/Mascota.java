/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 *La clase Mascota tiene las caracteristica de la clase.
 * 
 * @author Ricardo Adrián Colindres Franco
 * @version  1.0
 */
public class Mascota {
    //declarar variables
    /**
     * id, nombre, duenio, especie y raza son las caracteristicas de Mascota
     */
    private int id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String edad;
    private String genero;
    private int id_cliente;
    private boolean estado_activo;
    
    /**
     * Valor vacio de Mascota
     */
    
    public Mascota(){}
    
    /**
     * Valor de cada uno de las caracteristicas
     * @param id_mascota de Mascota
     * @param nombre de la Mascota
     * @param especie  de la Mascota
     * @param raza de la Mascota
     * @oaram edad de mascota
     * @param genero de mascota
     * @param id_cliente de mascota
     * @param estado_activo de mascota
     */
    public Mascota(int id_mascota, String nombre, String especie, String raza, String edad, String genero, int id_cliente, boolean estado_activo){
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.id_cliente = id_cliente;
        this.estado_activo = estado_activo;
    }
    
    //getters y setters
    
    public int getIdMascota(){
        return id_mascota;
    }
    public void setIdMascota(int idMascota){
        this.id_mascota = idMascota;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreMascota){
        this.nombre = nombreMascota;
    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especieMascota){
        this.especie = especieMascota;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String razaMascota){
        this.raza = razaMascota;
    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edadMascota){
        this.edad = edadMascota;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String generoMascota){
        this.genero = generoMascota;
    }
    public int getClienteMascota(){
        return id_cliente;
    }
    public void setClienteMascota(int idClienteMascota){
        this.id_cliente = idClienteMascota;
    }
    public boolean getEstadoMascota(){
            return estado_activo;
    }
    public void setEstadoMascota(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
    
    
}
