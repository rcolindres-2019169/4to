/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Proveeor representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Proveedor {
    //declara variables
    private int id_proveedor;
    private String nombre;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Proveedor
     */
    
    //metodos
    public Proveedor(){}
    
    public Proveedor(int id_proveedor, String nombre, boolean estado_activo){
           this.id_proveedor = id_proveedor;
           this.nombre = nombre;
           this.estado_activo = estado_activo;
    }
    //getters y setters
    public int getId(){
        return id_proveedor;
    }
    public void setId(int idProveedor){
        this.id_proveedor = idProveedor;
    }
    public String getProveedor(){
        return nombre;
    }
    public void setProveedor(String nombreProveedor){
        this.nombre = nombreProveedor;
    }
    public boolean getEstado(){
        return estado_activo;
    }
    public void setEstado(boolean estadoProveedor){
        this.estado_activo = estadoProveedor;
    }
}
