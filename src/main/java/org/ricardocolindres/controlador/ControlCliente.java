/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.modelo.Cliente;
import java.util.ArrayList;

/**
 *@author Ricardo Adrian Colindres Franco
 * @version  1.0
 * @see  Cliente
 */
public class ControlCliente {
    /**
	 * instancia y cliente crean instancias
	 */
    private static ControlCliente instancia;
    private ArrayList<Cliente> clientes;
     //declarar y definir métodos
	/**
	 * Metodos que nos sirven para crear el Arraylist e instanciar
	 */
    
    
    public ControlCliente(){
        clientes = new ArrayList<Cliente>();
    }//public ControlCliente()
    
    public ControlCliente(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
    public static ControlCliente getInstancia(){
        if(instancia  == null){
            instancia = new ControlCliente();
        }return instancia;
    }//public static  CotrolCliente
    
    public int cantidadDeClientes(){
        return clientes.size();
    }//
    public void agregarClientes(Cliente cliente){
        clientes.add(cliente);
    }//public void agregarClientes()
    
    public ArrayList<Cliente>listaDeClientes(){
        return clientes;
    }//public Arraylist<>
    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }//public void eliminarCliente()
    public void eliminarCliente(int indiceCliente){
        clientes.remove(indiceCliente);
    }//public void eliminarCliente()
    
    public Cliente buscarCliente(int idCliente){
        Cliente cliente = new Cliente();
            for(Cliente elemento : clientes){
            if (cliente.getIdCl()==idCliente)
                cliente = elemento;
            break;
        }return cliente;
    }//public Cliente buscarCliente
    
    public void actualizarCliente(Cliente antiguo, Cliente actualizado){
        int indice = clientes.indexOf(antiguo);
        if(indice >= 0)
            clientes.set(indice, actualizado);
    }//public void actualizarClinete()
}//public class ControlClinete
