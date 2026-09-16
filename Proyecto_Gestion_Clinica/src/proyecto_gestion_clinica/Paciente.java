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
    private char generoPaciente;
    private int edadPaciente;
    private String estadoPaciente; //Consulta, Internado, Dado de Alta
    
    
    //constructor
   public Paciente( String nombre, String apellido,int id, char generoPaciente, int edadPaciente){
    super (nombre, apellido,id);
    this.generoPaciente = generoPaciente;
    this.edadPaciente = edadPaciente;
    }//fin 
   
   //====== FUNCIONES =========  
     @Override
     public void MostrarInformacion() {
        super.MostrarInformacion(); //nombre, apellido, id
        System.out.println("Genero: " + generoPaciente);
        System.out.println("Edad: "+edadPaciente);
    }//fin Funcion MontrarInformacion
     
     
  public String GetNombre(){
  return this.nombre;
   }//fin GetNombre

  public String GetApellido(){
  return this.apellido;
  }//fin GetApellido
  
  public int GetId(){
  return this.id;
  }//fin GetId
  
  public int GetGenero(){
  return this.generoPaciente;
  }//fin GetGenero
  
  public int GetEdad(){
  return this.edadPaciente;
  }//fin GetEdad
}// Fin CLASS
