/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private int id_cita;
    private String fecha;
    private String hora;
    private int costo_total;
    private int id_cliente;
    private int id_doctor;
    private int id_servicio;
    private boolean estado_activo;
    
    /** 
     * Valor vacio de Cita
     */
    
    public Cita(){}
    
    /**
     * Valor de las carcteristicas de Cita
     * @param id_cita Cita
     * @param fecha de Cita
     * @param hora de cita
     * @param costo_total de cita
     * @param id_cliente cliente cita
     * @param id_doctor de la cita
     * @param id_servicio de cita
     * @param estado_activo de cita
     */
    public Cita(int id_cita, String fecha, String hora, int costo_total, int id_cliente, int id_doctor, int id_servicio, boolean estado_activo){
        this.id_cita = id_cita;
        this.fecha = fecha;
        this.hora = hora;
        this.costo_total = costo_total;
        this.id_cliente = id_cliente;
        this.id_doctor= id_doctor;
        this.id_servicio = id_servicio;
        this.estado_activo = estado_activo;
    }
    
    
    // getters y setters
     
    public int getIdCita(){
        return id_cita;
    }
    public void setIdCita(int idCita){
        this.id_cita = idCita;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fechaCita){
        this.fecha = fechaCita;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String horaCita){
        this.hora = horaCita;
    }
    public int getCosto(){
        return costo_total;
    }
    public void setCosto(int costoCita){
        this.costo_total = costoCita;
    }
    public int getCliente(){
        return id_cliente;
    }
    public void setCliente(int clienteCita){
        this.id_cliente = clienteCita;
    }
    public int getDoctor(){
        return id_doctor;
    }
    public void setDoctor(int doctorCita){
        this.id_doctor = doctorCita;
    }
    public int getServicio (){
        return id_servicio;
    }
    public void setServicio(int servicioCita){
        this.id_servicio = servicioCita;
    }
    public boolean getEstadoCita(){
            return estado_activo;
    }
    public void setEstadoCita(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
}
