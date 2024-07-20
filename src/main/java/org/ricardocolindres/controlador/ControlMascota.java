package org.ricardocolindres.controlador;
import org.ricardocolindres.modelo.Mascota;
import java.util.ArrayList;
/**
 * ControlMascota va a hacer acciones distintas para el menu, a traves de métodod y usando Arraylist
 * @author Ricardo Colindres
 * @version 1.0
 * @see Mascota
 */
public class ControlMascota {
    /**
	 * instancia y mascotas crean instancias
	 */
    private static ControlMascota instancia;
    private ArrayList<Mascota> mascotas;
    //declarar y definir métodos
	/**
	 * Metodos que nos sirven para crear el Arraylist e instanciar
	 */
    
    public ControlMascota(){
        mascotas = new ArrayList<Mascota>();
    }
    public ControlMascota(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }//public ControlMascota
    public static ControlMascota getInstancia(){
        if (instancia == null) {
            instancia = new ControlMascota();
        }return instancia;
    }//public static ControlMascota
    
    public int cantidadDeMascotas(){
        return  mascotas.size();
    }//public int cantidadDeMascotas
    public void agregarMascotas(Mascota mascota){
        mascotas.add(mascota);
    }//public void agregarMascotas
    
    public ArrayList<Mascota>listaDeMascotas(){
        return mascotas;
    }//public Arraylist
    
    public void eliminarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }//public void eliminarMascota
    
    public void eliminarMascota(int indiceMascota){
        mascotas.remove(indiceMascota);
    }//public void eliminarMascota
    
    public Mascota buscarMascota(int idMascota){
        Mascota mascota = new Mascota();
        for(Mascota elemento : mascotas){
            if (mascota.getId()==idMascota)           
                mascota = elemento;
            break;
        }return mascota;
    }//public Mascota buscarMscota   
    
    public void actualizarMascota(Mascota antiguo, Mascota actualizado){
        int indice = mascotas.indexOf(antiguo);
        if(indice >= 0)
            mascotas.set(indice, actualizado);
    }//public void actualizarMascota
    
}//public class ControlMascota
