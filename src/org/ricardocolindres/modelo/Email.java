/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Email  representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Email {
    //declarar variables
    private int id_email;
    private String email_personal;
    private String email_laboral;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Email
     */
   
    //metodos
    public Email(){}
    /**
     * @param id_email de Email
     * @param email_personal de Email
     * @param email_laboral de Email
     * @param estado_activo de Email
     */
    
    public Email(int id_email, String email_personal, String email_laboral, boolean estado_activo){
        this.id_email = id_email;
        this.email_personal = email_personal;
        this.email_laboral = email_laboral;   
        this.estado_activo  = estado_activo;
    }
    
    //geters y setters
    
    public int getIdEmail(){
        return id_email;
    }
    public void setIdEmail(int idEmail){
        this.id_email = idEmail;
    }
    public String getEmailPer(){
        return email_personal;
    }
    public void setEmailPer(String emailPersonal){
        this.email_personal = emailPersonal;
    }
    public String getEmailLab(){
        return email_laboral;
    }
    public void setEmailLab(String emailLaboral){
        this.email_laboral = emailLaboral;
    }
    public boolean getEstadoEmail(){
            return estado_activo;
    }
    public void setEstadoEmail(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
    
}
