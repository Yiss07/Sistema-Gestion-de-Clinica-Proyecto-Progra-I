/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_gestion_clinica;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
     int centinelaMenu = 7;
     //paciente
     int posicionArregloPacientes = -1;
     int cantidadRegistro = 0;
     String nombrePaciente ="John Doe";
     String apellidoPaciente = "John Doe";
     char generoPaciente = 'a';
     int edadPaciente = 0;
     int idPaciente = 0;
     Personas pacienteSeleccionado;
     //Medicos
     String nombreMedico ="John Doe";
     String apellidoMedico= "John Doe";
     String especialidadMedico = "John Doe";
     int idMedico = 0;
     Personas medicoAsignado;
     //Citas 
     int idCita = 0;
     String textoFechaCita = "John Doe";
     DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
     LocalDateTime fechaHoraCita = null;
     String textoFechaBuscar = "John Doe";
     LocalDate fechaBuscarCita;
      DateTimeFormatter formatoFechaBuscar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     boolean fechaEncontrada = false;
     //HM HistorialMedico
     int posicionArregloHistorial =-1;
     String sintomasHM = "John Doe";
     String diagnosticoHM = "John Doe";
     String observacionesHM = "John Doe";
     boolean PacienteEncontrado = false;
     
  //==== ARREGLOS
       Paciente [] listaPacientes  = new Paciente[50];
       Medicos [] listaMedicos = new Medicos [50];
       Citas [] listaCitas = new Citas[50];
       HistorialMedico [] listaHistorialMedico = new HistorialMedico [50];
   
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
         opcionMenu = ValidacionNumeroPositivo(sc);
//====== GESTION MEDICOS =======     
        switch(opcionMenu){
            case 1: 
                Encabezados("Gestion de Medicos");
                System.out.println(" 1. Registro de Medico");
                System.out.println(" 2. Buscar Medico");
                System.out.print("Seleccione una opcion:");
                opcionSubmenu = ValidacionNumeroPositivo(sc);
                switch(opcionSubmenu){
                    case 1: 
                    SubEncabezados("Registro de Medico");
                        System.out.println("Cantidad de medicos a registrar: ");
                        cantidadRegistro = ValidacionNumeroPositivo(sc);
                        sc.nextLine();// Limpieza de Buffer
                        
                        for (int i=0; i<cantidadRegistro;i++){                         
                            System.out.printf("%d Ingrese el nombre del Doctor/ra:",i+1);
                            nombreMedico = sc.nextLine();
                            System.out.print("Ingrese el apellido: " );
                            apellidoMedico = sc.nextLine();
                            System.out.printf("Doctor/ra %S,Ingrese su especializacion: ",apellidoMedico);
                            especialidadMedico= sc.nextLine();
                            System.out.printf("Doctor/ra %S,Ingrese su ID:",apellidoMedico);
                            idMedico=ValidacionNumeroPositivo(sc);
                            sc.nextLine(); //Limpieza de Buffer
                            //guardar arreglo posicion nueva
                            
                            listaMedicos [i]= new Medicos(nombreMedico,apellidoMedico,idMedico,especialidadMedico);
                            System.out.println("");   
                        }//fin ciclo for registro Medicos 
                        ValidacionArregloNull(listaMedicos);
                    break;
                    
                    case 2: SubEncabezados("Buscar Medico");
                        BuscadorNombre(listaMedicos,sc); 
                      break;

                    default:
                        System.out.println("ERROR: Ingrese una opcion Valida.");
                        break;
                 }//fin switch medicos
                break;
//====== GESTION PACIENTES =======                  
            case 2:
                Encabezados("Gestion de Pacientes");
                System.out.println(" 1. Registro de Pacientes");
                System.out.println(" 2. Buscar Paciente");
                System.out.print("Seleccione una opcion:");
                opcionSubmenu = ValidacionNumeroPositivo(sc);
                switch(opcionSubmenu){
   
                    case 1: SubEncabezados("Registro de Paciente");
                            System.out.print("Cantidad de pacientes a registrar: ");
                            cantidadRegistro = ValidacionNumeroPositivo(sc);
                            sc.nextLine(); //Limpieza de Buffer
                            
                            for (int i = 0; i < cantidadRegistro; i++) {
                                System.out.printf("%d Ingrese el nombre del paciente:", i+1);
                                nombrePaciente = sc.nextLine();
                                System.out.printf("Paciente %S: Ingrese el apellido:",nombrePaciente);
                                apellidoPaciente = sc.nextLine();
                                System.out.printf("Paciente %S: Ingrese el genero M/F:",nombrePaciente);
                                generoPaciente = sc.nextLine().toUpperCase().charAt(0);
                                System.out.printf("Paciente %S: Ingrese la edad:",nombrePaciente);
                                edadPaciente = ValidacionNumeroPositivo(sc);
                                System.out.printf("Paciente %S: Ingrese ID:",nombrePaciente);
                                idPaciente = ValidacionNumeroPositivo(sc);
                                sc.nextLine(); //buffer
       
                                listaPacientes[i] = new Paciente(nombrePaciente, apellidoPaciente,idPaciente, generoPaciente,edadPaciente);
                                System.out.println(" ");
                            }//fin for registro Pacientes    
                            ValidacionArregloNull(listaPacientes);
                    break;
                    
                    case 2: SubEncabezados("Buscar Paciente");
                    BuscadorNombre(listaPacientes,sc);
                    break;
                    
                    default:
                        System.out.println("ERROR: Ingrese una opcion Valida.");
                        break;
                }//fin switch pacientes
                break;
//====== GESTION DE CITAS =======   
            case 3:
                Encabezados("Gestion de Citas");
                System.out.println(" 1. Registro de nueva cita");
                System.out.println(" 2. Citas Agendadas");
                System.out.print("Seleccione una opcion:");
                opcionSubmenu = ValidacionNumeroPositivo(sc);
                switch(opcionSubmenu){
   
                    case 1: SubEncabezados("Registro de nueva cita");
                            System.out.print("Cantidad de citas a registrar: ");
                            cantidadRegistro = ValidacionNumeroPositivo(sc);
                            sc.nextLine();//limpieza de Buffer
                            for( int i = 0; i <cantidadRegistro; i++){
                                System.out.println("\n-- Registro de Cita "+(i+1)+" --");
                                fechaHoraCita = null;
                                    while (fechaHoraCita == null){
                                System.out.print("Ingrese fecha y hora de la cita(25/12/2026 14:30):");
                                textoFechaCita = sc.nextLine();
                                    try{
                                    fechaHoraCita = LocalDateTime.parse(textoFechaCita,formatoFechaHora);
                            //Verificar fecha y Hora repetida
                                    boolean fechaHoraRepetida = false;
                                    for (int j = 0; j < listaCitas.length; j++) {
                                    if (listaCitas[j] != null &&
                                    listaCitas[j].GetFechaHoraCita().equals(fechaHoraCita)) {
                                    fechaHoraRepetida = true;
                                    break;
                                    }//fin if
                                    }//fin for verficador de Fecha y Hora registrada
                                    
                                    if (fechaHoraRepetida) {
                                    System.out.println("ALERTA: Ya existe una cita en esa fecha y hora.");
                                     System.out.println("Ingrese una fecha y hora diferente.");
                                     fechaHoraCita = null;
                                    }//fin if Alerta
                                    
                                    } catch (DateTimeParseException e){
                                    System.out.println("ERROR: Ingrese un formato valido.");
                                    System.out.println("Intente de nuevo.");
                                }//fin catch
                                }//fin while    
                            //Buscar paciente registrado
                                    System.out.print("Ingrese el nombre del paciente registrado:");
                                    pacienteSeleccionado = BuscadorNombreCita(listaPacientes,sc);
                                    if (pacienteSeleccionado == null) {
                                    System.out.println("Paciente no registrado.");
                                    i--;
                                    continue;
                                    }// fin if pacienteregistrado
                            //Buscar medico registrado
                                    System.out.print("Ingrese el nombre del medico asignado:"); 
                                    medicoAsignado = BuscadorNombreCita(listaMedicos,sc);
                                    if(medicoAsignado == null){
                                    System.out.println("Medico no encontrado.");
                                    i--;
                                    continue;
                                    }//fin MedicoAsignado
                                System.out.print("Ingrese ID cita:");
                                idCita = sc.nextInt();
                                
                                sc.nextLine(); //Limpieza de buffer
                              
                                listaCitas[i] = new Citas(pacienteSeleccionado,medicoAsignado,idCita,fechaHoraCita);
                                listaCitas[i].MostrarInformacion();
                                }// Fin for registro Citas
                                System.out.println("");
                                break;
                                
                    case 2: SubEncabezados("Citas Agendadas");
                            sc.nextLine(); //Limpieza de Buffer
                            System.out.print("Ingrese la fecha a consultar (25/12/2026): ");
                            textoFechaBuscar = sc.nextLine();
                            try {  fechaBuscarCita = LocalDate.parse(textoFechaBuscar, formatoFechaBuscar);
                            } catch (DateTimeParseException e) {
                              System.out.println("ERROR: Formato de fecha inválido.");
                            System.out.println("Ejemplo: 25/12/2026.");
                            break;
                            }//fin Catch
                            System.out.println("\n===== CITAS DEL " + textoFechaBuscar + " =====");
                            for (int i = 0; i < listaCitas.length; i++) {
                                
                            if (listaCitas[i] != null &&
                            listaCitas[i].GetFechaHoraCita() != null) {
                            LocalDate fechaCita =
                            listaCitas[i].GetFechaHoraCita().toLocalDate();
                            
                            if (fechaCita.equals(fechaBuscarCita)) {
                            listaCitas[i].MostrarInformacion();
                            fechaEncontrada = true;
                            }// fin if
                            }//fin if
                            }// fin for 
                            if (!fechaEncontrada) {
                            System.out.println("No existen citas registradas para el día "+ textoFechaBuscar);
                            }// fin if validacion de cita         
                    break;
                    default:
                        System.out.println("ERROR: Ingrese una opcion Valida.");
                        break;        
                }//fin switch Gestion de Citas
                break; 
//====== GESTION HISTORIAL MEDICO =======                   
            case 4:
                Encabezados("Gestion de Historial Medico");
                System.out.println(" 1. Registro de Historial Medico");
                System.out.println(" 2. Buscar Historial Medico");
                System.out.print("Seleccione una opcion:");
                opcionSubmenu = ValidacionNumeroPositivo(sc);
                switch(opcionSubmenu){
               
                    case 1: SubEncabezados("Registro de Historial Medico");
                            System.out.print("Cantidad de historial a registrar: ");
                            cantidadRegistro = ValidacionNumeroPositivo(sc);
                            sc.nextLine();//limpieza de Buffer
                            for (int i = 0; i < cantidadRegistro; i++) {
                            System.out.print("Ingrese nombre Paciente registrado: ");
                            pacienteSeleccionado = BuscadorNombreCita(listaPacientes,sc);   
                                if (pacienteSeleccionado == null) {
                                System.out.println("Paciente no registrado.");
                                continue;
                                }//fin if null Paciente
                            System.out.print("Ingrese nombre del medico asignado: ");
                            medicoAsignado = BuscadorNombreCita(listaMedicos,sc);
                                if(medicoAsignado == null){
                                    System.out.println("Medico no registrado");
                                    continue;
                                }//fin if null medico
                            System.out.println("Ingrese los Sintomas presentados: ");
                            sintomasHM = sc.nextLine();
                            System.out.println("Ingrese enfermedad diagnostico: ");
                            diagnosticoHM = sc.nextLine();
                            System.out.println("Ingrese observaciones: ");
                            observacionesHM = sc.nextLine();
                            
                            listaHistorialMedico[i] = new HistorialMedico(pacienteSeleccionado,medicoAsignado,sintomasHM,diagnosticoHM,observacionesHM);
                            listaHistorialMedico[i].MostrarInformacion();
                            }//fin for registro    
                    break;
                    case 2:
                        SubEncabezados("Buscar Historial Medico");
                            System.out.print("Ingrese nombre del paciente: ");
                            sc.nextLine();//limpieza de buffer
                            pacienteSeleccionado = BuscadorNombreCita(listaPacientes,sc);
                            if (pacienteSeleccionado == null) {
                            System.out.println("Paciente no encontrado.");
                             break;
                            }//fin if
                            for (int i = 0; i < listaHistorialMedico.length; i++) {
                            if (listaHistorialMedico[i] != null && listaHistorialMedico[i].GetPaciente().GetId() == pacienteSeleccionado.GetId()) {
                            listaHistorialMedico[i].MostrarInformacion();
                            PacienteEncontrado = true;
                             }//fin if
                                }//fin for 
                            if (!PacienteEncontrado) {
                            System.out.println("No se encontró historial médico para ese paciente.");
                                }//fin if 
                        break;
                        
                    default:
                        System.out.println("ERROR: Ingrese una opcion Valida.");
                        break;    
            }//fin Switch
                        
                
                break;
//====== GESTION DE INTERNACIONES =======                 
            case 5:
                Encabezados("Gestion de Internaciones");
                System.out.println(" 1. Registro de enfermedades");
                System.out.println(" 2. Pacientes Internos");
                break;
//====== GESTION DE PAGOS =======                
            case 6:
                Encabezados("Gestion de Pagos");
                System.out.println(" 1. Costo de consulta");
                System.out.println(" 2. Costos de internaciones");
                break;            
                              
            default:
                if (opcionMenu>centinelaMenu){
                System.out.println("ERROR: Ingrese una opcion Validad");
                }
                
            break;   
        }//fin Switch  
         
         
      
     }while(opcionMenu != centinelaMenu);
      System.out.println("Sesion cerrada. Pase un feliz dia ('v')/ ");
        
    }//Fin Main
    
    // =============    FUNCIONES   =============
    
    public static void Encabezados( String mensajeEncabezado){
        String colorAzul = "\u001B[34m";
        String colorReset = "\u001B[0m";
        
        System.out.println("===================================");
        System.out.printf(colorAzul +"\t %S\n" +colorReset,mensajeEncabezado);
        System.out.println("===================================");
    }//fin funcion 1 Encabezados
    
    public static void SubEncabezados(String mensajeSubencabezado){
        String colorVerde = "\u001B[32m";
        String colorReset = "\u001B[0m";
        
        System.out.printf(colorVerde +"----- %s -----\n"+ colorReset,mensajeSubencabezado);
    }//fin funcion 2 SubEncabezado
    
    public static int ValidacionNumeroPositivo(Scanner scan){
     int numeroTemp = 0;
     do{
         numeroTemp = scan.nextInt();
         if (numeroTemp<=0){ 
         System.out.println("Error: El numero no puede ser negativo");
             System.out.println("Ingresarlo nuevamente");
         }else {   
         }
     }while (numeroTemp<0);
     return numeroTemp; 
    }//fin funcion 3 ValidacionNumerosPositivos
 
    public static void ValidacionArregloNull(Personas[] listaTemp){
    for(int i=0; i<listaTemp.length; i++){
    if (listaTemp[i] !=null){
    System.out.println("");
    System.out.println("=== Registro Exitoso ===");
    listaTemp [i].MostrarInformacion();
    }
    }
    }//fin funcion 4 ValidacionArregloNull 
   
    public static void BuscadorNombre(Personas[] listaTemp, Scanner scan) {
     scan.nextLine();//limpieza de buffer
        System.out.print("Ingrese el nombre a buscar: ");
    String nombreBuscar = scan.nextLine();
    boolean encontrado = false;

    for (int i = 0; i < listaTemp.length; i++) {
        if (listaTemp[i] != null && listaTemp[i].GetNombre().equalsIgnoreCase(nombreBuscar)) {
            System.out.println("Resultado: " + listaTemp[i].GetNombre());
            System.out.println("====");
            listaTemp[i].MostrarInformacion();
            System.out.println("====");
            encontrado = true;
            break; 
        }// fin if 
    }// fin for

    if (!encontrado) {
        System.out.println("No se encontro ningun registro con ese nombre.");
    }//fin if
}//fin funcion 5 BuscadorNombre
  
    
    public static Personas BuscadorNombreCita(Personas[] listaTemp, Scanner scan) {
    String nombreBuscar = scan.nextLine();
    for (int i = 0; i < listaTemp.length; i++) {

        if (listaTemp[i] != null &&
            listaTemp[i].GetNombre().equalsIgnoreCase(nombreBuscar)) {
            System.out.println("NOMBRE: " + listaTemp[i].GetNombre()+ " " + listaTemp[i].GetApellido() + " ID: " + listaTemp[i].GetId());
            return listaTemp[i];
        }// fin if 
    }// fin for 
    System.out.println("Paciente no encontrado.");
    return null;
}//Fin funcion 6 BuscadorNombreCita
    
    
}//Fin Proyecto 
