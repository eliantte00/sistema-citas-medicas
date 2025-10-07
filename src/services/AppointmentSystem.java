package services;

import models.Doctor;
import models.Patient;
import models.Appointment;
import storage.CsvStorage;
import java.util.Scanner;

public class AppointmentSystem {
    private final Scanner scanner = new Scanner(System.in);
    private final CsvStorage storage = new CsvStorage();
    private final String adminUser = "admin";
    private final String adminPass = "root";

    public void start(){
        System.out.println("=== SISTEMA DE CITAS MÉDICAS ===");
        if(!login()){
            System.out.println("Acceso denegado. Saliendo.");
            return;
        }
        int option;
        do{
            System.out.println("\n1) Dar de alta doctor");
            System.out.println("2) Dar de alta paciente");
            System.out.println("3) Crear cita");
            System.out.println("4) Salir");
            System.out.print("Opción: ");
            option = Integer.parseInt(scanner.nextLine());
            switch(option){
                case 1: addDoctor(); break;
                case 2: addPatient(); break;
                case 3: createAppointment(); break;
                case 4: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida");
            }
        } while(option != 4);
    }

    private boolean login(){
        System.out.print("Usuario: ");
        String u = scanner.nextLine();
        System.out.print("Contraseña: ");
        String p = scanner.nextLine();
        return u.equals(adminUser) && p.equals(adminPass);
    }

    private void addDoctor(){
        System.out.print("ID doctor: "); String id = scanner.nextLine();
        System.out.print("Nombre completo: "); String name = scanner.nextLine();
        System.out.print("Especialidad: "); String specialty = scanner.nextLine();
        Doctor d = new Doctor(id, name, specialty);
        storage.save("doctors.csv", d.toString());
        System.out.println("Doctor registrado correctamente.");
    }

    private void addPatient(){
        System.out.print("ID paciente: "); String id = scanner.nextLine();
        System.out.print("Nombre completo: "); String name = scanner.nextLine();
        Patient p = new Patient(id, name);
        storage.save("patients.csv", p.toString());
        System.out.println("Paciente registrado correctamente.");
    }

    private void createAppointment(){
        System.out.print("ID cita: "); String id = scanner.nextLine();
        System.out.print("Fecha y hora (YYYY-MM-DD HH:MM): "); String dt = scanner.nextLine();
        System.out.print("Motivo de la cita: "); String reason = scanner.nextLine();
        System.out.print("ID doctor: "); String docId = scanner.nextLine();
        System.out.print("ID paciente: "); String patId = scanner.nextLine();
        Appointment a = new Appointment(id, dt, reason, docId, patId);
        storage.save("appointments.csv", a.toString());
        System.out.println("Cita creada correctamente.");
    }
}
