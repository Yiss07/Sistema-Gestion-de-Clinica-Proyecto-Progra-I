package proyecto_gestion_clinica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yiss
 */
public class Paciente {
    //== ATRIBUTOS
    private String nombrePaciente;
    private String apellidoPaciente;
    private char generoPaciente;
    private int edadPaciente;
    private int idPaciente;
    private String estadoPaciente; //Consulta, Internado, Dado de Alta
    
    
    
   public Paciente (String nombrePaciente,String apellidoPaciente,char generoPaciente, int edadPaciente, int idPaciente){
    this.nombrePaciente = nombrePaciente;
    this.apellidoPaciente = apellidoPaciente;
    this.generoPaciente = generoPaciente;
    this.edadPaciente = edadPaciente;
    this.idPaciente = idPaciente;   
    }//fin 
   
    public String getNombre(){ 
    return nombrePaciente; 
    }//fin Get

    public void setNombre(String nombrePaciente){
    this.nombrePaciente = nombrePaciente;
    }//fin set
    
     public String getApellido(){ 
    return apellidoPaciente; 
    }//fin Get
     
     public void MostrarInformacionPaciente() {
        System.out.println("ID: "+idPaciente);
        System.out.println("Nombre: " + nombrePaciente+" " + apellidoPaciente);
        System.out.println("Genero: " + generoPaciente);
        System.out.println("Edad: "+edadPaciente);
        System.out.println("");
       
    }//fin Funcion


}// Fin CLASS
