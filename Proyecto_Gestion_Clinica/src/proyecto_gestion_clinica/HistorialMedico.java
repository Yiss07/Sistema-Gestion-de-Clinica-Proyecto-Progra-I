/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_gestion_clinica;


/**
 * observacionesHM
 * @author Yiss
 */
public class HistorialMedico {
    //Atributos
    private Personas paciente;
    private Personas medico;
    private String sintomasHM; // sintomas HistorialMedico
    private String diagnosticoHM;
    private String observacionesHM;

    //Constructor
public HistorialMedico(Personas paciente, Personas medico,String sintomasHM,String diagnosticoHM,String observacionesHM ){
this.paciente = paciente;
this.medico = medico;
this.sintomasHM = sintomasHM;
this.diagnosticoHM = diagnosticoHM;
this.observacionesHM = observacionesHM;
}//fin constructor 

public void MostrarInformacion(){
  System.out.println("\n=== Historial Medico ===");
        System.out.println("Paciente: " + paciente.GetNombre() + " " + paciente.GetApellido() +" ID: " + paciente.GetId());
        System.out.println("Medico: " +medico.GetNombre() + " " +medico.GetApellido() +" ID: " + medico.GetId());
        System.out.println("Sintomas: "+sintomasHM);
        System.out.println("Diagnostico: "+ diagnosticoHM);
        System.out.println("Observaciones: "+ observacionesHM);
        System.out.println("--------------");
}//fin funcion MostrarInformacion
  
public Personas GetPaciente() {
    return paciente;
}

}// Fin Class
