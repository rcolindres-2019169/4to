/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Telefono  representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Telefono {
    //declarar variables
    private int id_telefono;
    private String telefono_personal;
    private String telefono_laboral;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Telefono
     */
   
    //metodos
    public Telefono(){}
    /**
     * @param id_telefono de Telefono
     * @param telefono_personal de Telefono
     * @param telefono_laboral de Telefono
     * @param estado_activo de Telefono
     */
    
    public Telefono(int id_telefono, String telefono_personal, String telefono_laboral, boolean estado_activo){
        this.id_telefono = id_telefono;
        this.telefono_personal = telefono_personal;
        this.telefono_laboral = telefono_laboral;  
        this.estado_activo = estado_activo;
    }
    
    //geters y setters
    
    public int getIdTelefono(){
        return id_telefono;
    }
    public void setIdTelefono(int idTelefono){
        this.id_telefono = idTelefono;
    }
    public String getTelefonoPer(){
        return telefono_personal;
    }
    public void setTelefonoPer(String telPersonal){
        this.telefono_personal = telPersonal;
    }
    public String getTelefonoLab(){
        return telefono_laboral;
    }
    public void setTelefonoLab(String telLaboral){
        this.telefono_laboral = telLaboral;
    }
    public boolean getEstadoTelefono(){
            return estado_activo;
    }
    public void setEstadoTelefono(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
}
