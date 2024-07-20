
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
    private int id;
    private String nombre;
    private String duenio;
    private String especie;
    private String raza;
    
    /**
     * Valor vacio de Mascota
     */
    
    public Mascota(){}
    
    /**
     * Valor de cada uno de las caracteristicas
     * @param id de Mascota
     * @param nombre de la Mascota
     * @param duenio duenio de la Mascota
     * @param especie especie de la Mascota
     * @param raza de la mascota
     */
    public Mascota(int id, String nombre, String duenio, String especie, String raza){
        this.id = id;
        this.nombre = nombre;
        this.duenio = duenio;
        this.especie = especie;
        this.raza = raza;
    }
    
    //getters y setters
    
    public int getId(){
        return id;
    }
    public void setId(int idMascota){
        this.id = idMascota;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreMascota){
        this.nombre = nombreMascota;
    }
    public String getDuenio(){
        return duenio;
    }
    public void setDuenio(String duenioMascota){
        this.duenio = duenioMascota;
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
    
    
    
}
