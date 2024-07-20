/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Servicio representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Servicio{
    //declarar variables
    private int id_servicio;
    private String servicio;
    private String costo;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Servicio
     */
    
    //Metodos
    public Servicio(){}
        /** 
         * @param id_servicio de Servicio
         * @param servicio de Servicio
         * @param costo de Servicio
         * qparam estado_activo de Servicio
         */
    
    public Servicio(int id_servicio, String servicio, String costo, boolean estado_activo){
        this.id_servicio = id_servicio;
        this.servicio = servicio;
        this.costo = costo;
        this.estado_activo = estado_activo;
    }
    
    //getters y setters
    
    public int getIdServicio(){
        return  id_servicio;
    }
    public void setIdServicio(int idServicio){
        this.id_servicio = idServicio;
    }
    public String getServicio(){
        return servicio;
    }
    public void setServicio(String servicioSer){
        this.servicio = servicioSer;
    }
    public String getCosto(){
        return costo;
    }
    public void setCosto(String costoSer){
        this.costo = costoSer;
    }
    public boolean getServicioEstado(){
            return estado_activo;
    }
    public void setServicioEstado(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
}
