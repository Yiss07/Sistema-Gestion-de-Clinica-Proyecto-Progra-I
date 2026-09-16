/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_gestion_clinica;

import java.time.LocalDateTime;


/**
 *
 * @author Yiss
 */
public class Citas {
    //Atributos 

    private Personas paciente;
    private Personas medico;
    private int idCita;
    private LocalDateTime fechaHoraCita;
    
//Constructor
    public Citas(Personas paciente,Personas medico,int idCita, LocalDateTime fechaHoraCita) {
        this.paciente = paciente;
        this.medico = medico;
        this.idCita = idCita;
        this.fechaHoraCita = fechaHoraCita;
    }//fin constructor

    
      public void MostrarInformacion() {
        System.out.println("\n=== CITA ===");
        System.out.println("ID Cita: " + idCita);
        System.out.println("Paciente: " + paciente.GetNombre() + " " + paciente.GetApellido() +" ID: " + paciente.GetId());
        System.out.println("Medico: " +medico.GetNombre() + " " +medico.GetApellido() +" ID: " + medico.GetId());
        System.out.println("Fecha y hora: " + fechaHoraCita);
        System.out.println("--------------");
    }// fin funcion MostrarInformacion
      
    public LocalDateTime GetFechaHoraCita() {
        return fechaHoraCita;
}//fin return fechaHoraCita

}//fin CLASS Citas
     