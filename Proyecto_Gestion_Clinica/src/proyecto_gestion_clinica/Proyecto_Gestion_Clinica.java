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
        
     //Variables
     int opcionMenu = 0;
     int opcionSubmenu = 0;
     boolean isValido = true;
     
     //Menu Inicial, se modificara conforme se agregue codigo. 
     do{
         System.out.println("=== CLINICA SONRISAS ===");
         System.out.println("= Menu Principal =");
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
                System.out.println("= Gestion de Medicos =");
                System.out.println(" 1. Registro de Medico");
                break;
            case 2:
                System.out.println("= Gestion de Pacientes =");
                System.out.println(" 1. Registro de Pacientes");
                break;    
            case 3:
                System.out.println("= Gestion de Citas =");
                System.out.println(" 1. Registro de nueva cita");
                System.out.println(" 2. Visualización de cita agendada");
                break;     
            case 4:
                System.out.println("= Gestion de Historial Medico =");
                System.out.println(" 1. Registro de Historial Medico");
                break;
            case 5:
                System.out.println("= Gestion de Internaciones =");
                System.out.println(" 1. Registro de enfermedades");
                System.out.println(" 2. Pacientes Internos");
                break;
            case 6:
                System.out.println("= Gestion de Pagos =");
                System.out.println(" 1. Costo de consulta");
                System.out.println(" 2. Costos de internaciones");
                break;            
                              
            default:
                System.out.println("Cierre..");
            break;   
        }//fin Switch  
         
         
         
      
     }while(isValido);
    
        
        
    }//Fin Main
    
}//Fin Proyecto 
