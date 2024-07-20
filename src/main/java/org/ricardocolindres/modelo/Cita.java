
package org.ricardocolindres.modelo;

/**
 *La clase Cita tiene las caracteristica de la clase.
 * 
 * @author Ricardo Adrián Colindres Franco
 * @version  1.0
 */
public class Cita {
    //declarar variables
    /**
     * id, dia, mes, anio, cliente y hora son caracteristicas de Cita
     */
    private int id;
    private int dia;
    private String mes;
    private int anio;
    private String cliente;
    private String hora;
    
    /** 
     * Valor vacio de Cita
     */
    
    public Cita(){}
    
    /**
     * Valor de las carcteristicas de Cita
     * @param id Id Cita
     * @param dia dia de Cita
     * @param mes mes de cita
     * @param anio año de cita
     * @param cliente nombre de cliente cita
     * @param hora hora de la cita
     */
    public Cita(int id, int dia, String mes, int anio, String cliente, String hora){
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cliente = cliente;
        this.hora = hora;
    }
    
    
    // getters y setters
     
    public int getId(){
        return id;
    }
    public void setId(int idCita){
        this.id = idCita;
    }
    public int getDia(){
        return dia;
    }
    public void setDia(int diaCita){
        this.dia = diaCita;
    }
    public String getMes(){
        return mes;
    }
    public void setMes(String mesCita){
        this.mes = mesCita;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anioCita){
        this.anio = anioCita;
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String clienteCita){
        this.cliente = clienteCita;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String horaCita){
        this.hora = horaCita;
    }
    
}
