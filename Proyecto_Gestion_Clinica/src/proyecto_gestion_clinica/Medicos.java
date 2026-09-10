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
    // private String nombreMedico;
    //private String apellidoMedico;
    private String  especialidadMedico;
    //private int idMedico;
    
    public Medicos( String nombre, String apellido,int id,String especialidadMedico){
    //this.nombrePaciente = nombrePaciente;
    //this.apellidoPaciente = apellidoPaciente;
    super (nombre, apellido,id);
    this.especialidadMedico = especialidadMedico;
    //this.idPaciente = idPaciente;   
    }//fin 
    
    @Override
     public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Escpecialidad: " + especialidadMedico);
        System.out.println("");
    }//fin Funcion MontrarInformacion

    
    
}//FIN CLASS
