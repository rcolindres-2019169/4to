/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Producto representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Producto {
    //declara vaariables
    private int id_producto;
    private String nombre;
    private String precio;
    private int proveedor;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Producto
     */
    
    //metodos
    public Producto(){}
    
    public Producto(int id_producto, String nombre, String precio, int proveedor, boolean estado_activo){
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.estado_activo = estado_activo;
    }
    
    //getters y setters
    public int getId(){
        return id_producto;
    }
    public void setId(int idProducto){
        this.id_producto = idProducto;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreProducto){
        this.nombre = nombreProducto;
    }
    public String getPrecio(){
        return precio;
    }
    public void setPrecio(String precioProducto){
        this.precio = precioProducto;
    }
    public int getProveedor(){
        return proveedor;
    }
    public void setProveedor(int nombreProducto){
        this.proveedor = nombreProducto;
    }
    public boolean getEstado(){
        return estado_activo;
    }
    public void setEstado(boolean estadoProducto){
        this.estado_activo = estadoProducto;
    }
}
