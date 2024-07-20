/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.modelo.Cita;
import java.util.ArrayList;

/**
 *
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 * @see  Cita
 */
public class ControlCita {
    /**
	 * instancia y citass crean instancias
	 */
    private static ControlCita instancia;
    private ArrayList<Cita> citas;
    //declarar y definir métodos
	/**
	 * Metodos que nos sirven para crear el Arraylist e instanciar
	 */
    
    public ControlCita(){
        citas = new ArrayList<Cita>();
    }
    
    public ControlCita(ArrayList<Cita> citas){
        this.citas = citas;
    }//public ControlCita()
    public static ControlCita getInstancia(){
        if (instancia == null) {
            instancia = new ControlCita();
        }return instancia;
    }// public static ControlCita
    
    public int cantidadDeCitas(){
        return citas.size();
    }//public int cantidaDeCItas
    public void agregarCitas(Cita cita){
        citas.add(cita);
    }//public voidAgregarCitas
    
    public ArrayList<Cita>listaCitas(){
        return citas;
    }//public Arraylist
    public void eliminarCita(Cita cita){
        citas.remove(cita);
    }//public void eliminarCita()
    public void eliminarCita(int indiceCita){
        citas.remove(indiceCita);
    }//public void eliminarCita()
    
    public Cita buscarCita(int idCita){
        Cita cita = new Cita();
        for(Cita elemento : citas){
            if (cita.getId()==idCita)
                cita = elemento;
            break;
        }return cita;
    }//public void buscarCita()
    public void actualizarCita(Cita antiguo, Cita actualizado){
        int indice = citas.indexOf(antiguo);
        if (indice >= 0) 
            citas.set(indice, actualizado);
    }//public void actualizarCita()
}
