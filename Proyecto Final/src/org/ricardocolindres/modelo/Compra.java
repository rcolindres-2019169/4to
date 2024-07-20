/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.modelo;

/**
 * La clase Compra representa las carcteristicas.
 * 
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 */
public class Compra {
    //declara vaariables
    private int id_compra;
    private String fecha;
    private int producto;
    private int cliente;
    private boolean estado_activo;
    
    /**
     * Valor vacio del constructor de Producto
     */
    
    //metodos
    
    public Compra(){}
    
    public Compra(int id_compra, String fecha, int producto, int cliente, boolean estado_activo){
        this.id_compra = id_compra;
        this.fecha = fecha;
        this.producto = producto;
        this.cliente = cliente;
        this.estado_activo = estado_activo;
    }
    
    //getters y setters 
    public int getId(){
        return id_compra;
    }
    public void setId(int idCompra){
        this.id_compra = idCompra;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fechaCompra){
        this.fecha = fechaCompra;
    }
    public int getProducto(){
        return producto;
    }
    public void setProducto(int productoCompra){
        this.producto = productoCompra;
    }
    public int getCliente(){
        return cliente;
    }
    public void setCliente(int productoCliente){
        this.cliente = productoCliente;
    }
    public boolean getEstado(){
        return estado_activo;
    }
    public void setEstado(boolean estadoCompra){
        this.estado_activo = estadoCompra;
    }
}
