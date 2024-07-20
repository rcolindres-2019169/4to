/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Direccion   representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Direccion {
    //declarar variables
    private int id_direccion;
    private String direccion;
    private String departamento;
    private String municipio;
    private boolean estado_activo;

/**
     * Valor vacio del constructor de Direccion
     */
   
    //metodos
    public Direccion(){}
        /**
         * @param id_direccion de Direccion
         * @param direccion de Direccion
         * @param departamento de Direccion
         * @param municipio de Direccion
         * @param estado_activo de Direccion
         */
    
        public Direccion (int id_direccion, String direccion, String departamento, String municipio, boolean estado_activo){
            this.id_direccion = id_direccion;
            this.direccion = direccion;
            this.departamento = departamento;
            this.municipio = municipio;
            this.estado_activo = estado_activo;
        }
     // getters y setters
    public int getIdDireccion(){
         return id_direccion;
    }
    public void setIdDireccion(int idDireccion){
        this.id_direccion = idDireccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion (String direccionDir){
        this.direccion = direccionDir;
    }
    public String getDepartamento (){
        return departamento;
    }
    public void setDepartamento(String departamentoDir){
        this.departamento = departamentoDir;
    }
    public String getMunicipio(){
        return municipio;
    }
    public void setMunicipio(String municipioDir){
        this.municipio = municipioDir;
    }
    public boolean getEstadoDireccion(){
            return estado_activo;
    }
    public void setEstadoDireccion(boolean estado_activo){
            this.estado_activo = estado_activo;
    }
}