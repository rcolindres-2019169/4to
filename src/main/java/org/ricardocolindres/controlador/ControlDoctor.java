/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ricardocolindres.controlador;
import org.ricardocolindres.modelo.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Ricardo Adrian Colindres Franco
 * @version  1.0
 * @see  Doctor
 */
public class ControlDoctor {
    /**
	 * instancia y doctores crean instancias
	 */
    private static ControlDoctor instancia;
    private ArrayList<Doctor> doctores;
    //declarar y definir métodos
	/**
	 * Metodos que nos sirven para crear el Arraylist e instanciar
	 */
    
    public ControlDoctor(){
        doctores = new ArrayList<Doctor>();
    }//public ControlDoctor

    public ControlDoctor(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }//public ControlDoctor
    public static ControlDoctor getInstancia(){
        if (instancia == null) {
            instancia = new ControlDoctor();
        }return instancia;
    }//public static ControlDoctor
    
    public int cantidadDeDoctores(){
        return doctores.size();
    }//public int cantidadDwDoctores()
    public void agregarDoctor(Doctor doctor){
        doctores.add(doctor);
    }//public void agregarDoctor()
    
    public ArrayList<Doctor> listaDeDoctores(){
        return doctores;
    }//public ArrayList
    public void eliminarDoctor(Doctor doctor){
        doctores.remove(doctor);
    }//public void eliminarDoctor
    public void eliminarDoctor(int indiceDoctor){
        doctores.remove(indiceDoctor-1);
    }//punlic void eliminarDoctor()
    
    public Doctor buscarDoctor(int idDoctor){
        Doctor doctor = new Doctor();
        for(Doctor elemento : doctores){
            if(doctor.getId()==idDoctor)
                doctor = elemento;
            break;
        }return doctor;
    }//buscarDoctor
    
    public void actualizarDoctor(Doctor antiguo, Doctor actualizado){
        int indice = doctores.indexOf(antiguo);
        if(indice >= 0)
                doctores.set(indice, actualizado); 
    }//actualizarDoctor
}//public class ControlDoctor
