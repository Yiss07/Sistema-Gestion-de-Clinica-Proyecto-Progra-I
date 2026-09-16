/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_gestion_clinica;

/**
 *
 * @author Yiss
 */
public class Medicos extends Personas {
    //ATRIBUTOS
    private String  especialidadMedico;

    
    public Medicos( String nombre, String apellido,int id,String especialidadMedico){

    super (nombre, apellido,id);
    this.especialidadMedico = especialidadMedico;
    }//fin 
    
    @Override
     public void MostrarInformacion() {
        super.MostrarInformacion();//nombre, apellido, id
        System.out.println("Escpecialidad: " + especialidadMedico);
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
    
}//FIN CLASS
