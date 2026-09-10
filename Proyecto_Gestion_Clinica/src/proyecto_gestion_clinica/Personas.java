/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_gestion_clinica;

/**
 *
 * @author Yiss
 */
public class Personas {
    //Atributos 
    protected String nombre;
    protected String apellido;
    protected int id;
    
    public Personas( String nombre,String apellido, int id ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
}
    
    public void MostrarInformacion() {
        System.out.println("ID: "+id);
        System.out.println("Nombre: " + nombre+" " + apellido);
        
    }//fin Funcion MontrarInformacionPaciente
}//fin Class
