package proyecto_gestion_clinica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yiss
 */
public class Paciente extends Personas{
    //== ATRIBUTOS
    //private String nombrePaciente;
    //private String apellidoPaciente; 
//private int idPaciente;
    private char generoPaciente;
    private int edadPaciente;
    private String estadoPaciente; //Consulta, Internado, Dado de Alta
    
    
    
   public Paciente( String nombre, String apellido,int id, char generoPaciente, int edadPaciente){
    //this.nombrePaciente = nombrePaciente;
    //this.apellidoPaciente = apellidoPaciente;
    super (nombre, apellido,id);
    this.generoPaciente = generoPaciente;
    this.edadPaciente = edadPaciente;
    //this.idPaciente = idPaciente;   
    }//fin 
   
     
     @Override
     public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Genero: " + generoPaciente);
        System.out.println("Edad: "+edadPaciente);
        System.out.println("");
    }//fin Funcion MontrarInformacion


}// Fin CLASS
