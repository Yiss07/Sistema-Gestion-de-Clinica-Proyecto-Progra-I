/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_gestion_clinica;

/**
 *
 * @author Yiss
 */
public class Internaciones {
    //Atributos 
    private Personas paciente;
    private Personas medico;
    private  int diasInternos;
    
    //constructor 
    public Internaciones(Personas paciente,Personas medico,int diasInternos){
    this.paciente = paciente;
    this.medico = medico;
    this.diasInternos= diasInternos;
    
    }// fin constructor 
    
      public void MostrarInformacion() {
        System.out.println("\n=== Internaciones ===");
        System.out.println("Paciente: " + paciente.GetNombre() + " " + paciente.GetApellido() +" ID: " + paciente.GetId());
        System.out.println("Medico: " +medico.GetNombre() + " " +medico.GetApellido() +" ID: " + medico.GetId());
        System.out.println("Dias de internacion del paciente : " +diasInternos);
        System.out.println("--------------");
    }// fin funcion MostrarInformacion
    
    
}// fin CLASS
