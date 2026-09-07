/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_gestion_clinica;

import java.util.Scanner;

/**
 *
 * @author Yiss
 */
public class Proyecto_Gestion_Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Scanners 
      Scanner sc = new Scanner(System.in);
     
//==== VARIABLES
     int opcionMenu = 0;
     int opcionSubmenu = 0;
     //paciente
     int cantidadPaciente = 0;
     String nombrePaciente ="John Doe";
     String apellidoPaciente = "John Doe";
     char generoPaciente = 'a';
     int edadPaciente = 0;
     int idPaciente = 0;
     
     
  //==== ARREGLOS
       Paciente [] listaPacientes  = new Paciente[50]; 
     
     
     
     
     
     
//=============    MENU PRINCIPAL  =============
     do{
         Encabezados("CLINICA SONRISAS");
         Encabezados("Menu Principal");
         System.out.println(" 1. Gestion de Medicos");
         System.out.println(" 2. Gestion de Pacientes");
         System.out.println(" 3. Gestion de Citas");
         System.out.println(" 4. Gestion Historial Medico");
         System.out.println(" 5. Gestion de Internaciones");
         System.out.println(" 6. Gestion de Pagos");
         System.out.println(" 7. Salir");
         System.out.print("Seleccione una opcion:");
         opcionMenu = sc.nextInt();
         System.out.println("");
         
        switch(opcionMenu){
            case 1: 
                Encabezados("Gestion de Medicos");
                System.out.println(" 1. Registro de Medico");
                System.out.println(" 2. Buscar Medico");
                System.out.println("Seleccione una opcion:");
                opcionSubmenu = sc.nextInt();
                switch(opcionSubmenu){
        //====== REGISTRO DE MEDICOS =======
                    case 1: 
                }//fin switch medicos
                break;
                
            case 2:
                Encabezados("Gestion de Pacientes");
                System.out.println(" 1. Registro de Pacientes");
                System.out.println(" 2. Buscar Paciente");
                System.out.print("Seleccione una opcion:");
                opcionSubmenu = sc.nextInt();
                switch(opcionSubmenu){
        //====== REGISTRO DE PACIENTES =======
                    case 1: SubEnzabezados("Registro de Paciente");
                            System.out.print("Cantidad de pacientes a registrar: ");
                            cantidadPaciente = sc.nextInt();
                            sc.nextLine(); //buffer
                            
                            for (int i = 0; i < cantidadPaciente; i++) {
                                System.out.printf("%d Ingrese el nombre el paciente:", i+1);
                                nombrePaciente = sc.nextLine();
                                
                                System.out.printf("Paciente %S: Ingrese el apellido:",nombrePaciente);
                                apellidoPaciente = sc.nextLine();
                                
                                System.out.printf("Paciente %S: Ingrese el genero M/F:",nombrePaciente);
                                generoPaciente = sc.nextLine().toUpperCase().charAt(0);
                                
                                System.out.printf("Paciente %S: Ingrese la edad:",nombrePaciente);
                                edadPaciente = sc.nextInt();
                                
                                System.out.printf("Paciente %S: Ingrese ID:",nombrePaciente);
                                idPaciente = sc.nextInt();
                                sc.nextLine(); //buffer
                                
                                listaPacientes[i] = new Paciente(nombrePaciente, apellidoPaciente,generoPaciente,edadPaciente,idPaciente);
                                System.out.println(" ");
                                
                               
                                
                                
                            }//fin for
   ///////////////                         
                           for (int i = 0; i < listaPacientes.length; i++) {
                           
                            if (listaPacientes[i] != null) {
                            listaPacientes[i].MostrarInformacionPaciente();
                            }//fin 
                              }//fin For
                    
                        
                }//fin switch pacientes
                
                break;   
                
            case 3:
                Encabezados("Gestion de Citas");
                System.out.println(" 1. Registro de nueva cita");
                System.out.println(" 2. Visualización de cita agendada");
                break;     
            case 4:
                Encabezados("Gestion de Historial Medico");
                System.out.println(" 1. Registro de Historial Medico");
                break;
            case 5:
                Encabezados("Gestion de Internaciones =");
                System.out.println(" 1. Registro de enfermedades");
                System.out.println(" 2. Pacientes Internos");
                break;
            case 6:
                Encabezados("= Gestion de Pagos =");
                System.out.println(" 1. Costo de consulta");
                System.out.println(" 2. Costos de internaciones");
                break;            
                              
            default:
                System.out.println("Cierre..");
            break;   
        }//fin Switch  
         
         
         
      
     }while(opcionMenu != 7);
    
        
    }//Fin Main
    
    // =============    FUNCIONES   =============
    
    public static void Encabezados( String mensajeEncabezado){
        String colorAzul = "\u001B[34m";
        String colorReset = "\u001B[0m";
        
        System.out.println("===================================");
        System.out.printf(colorAzul +"\t %S\n" +colorReset,mensajeEncabezado);
        System.out.println("===================================");
    }//fin funcion 1
    
    public static void SubEnzabezados(String mensajeSubencabezado){
        String colorVerde = "\u001B[32m";
        String colorReset = "\u001B[0m";
        
        System.out.printf(colorVerde +"--- %s ---\n"+ colorReset,mensajeSubencabezado);
    }//fin suncion 2
    
    
    
    
}//Fin Proyecto 
