package storage;

import java.io.*;
import java.nio.file.*;

public class CsvStorage {
    private final Path dbFolder = Paths.get("db");
    private final Path doctorsFile = dbFolder.resolve("doctors.csv");
    private final Path patientsFile = dbFolder.resolve("patients.csv");
    private final Path appointmentsFile = dbFolder.resolve("appointments.csv");

    public CsvStorage(){
        try{
            if(!Files.exists(dbFolder)) Files.createDirectories(dbFolder);
            if(!Files.exists(doctorsFile)) Files.createFile(doctorsFile);
            if(!Files.exists(patientsFile)) Files.createFile(patientsFile);
            if(!Files.exists(appointmentsFile)) Files.createFile(appointmentsFile);
        } catch(IOException e){
            System.out.println("Error creando archivos: " + e.getMessage());
        }
    }

    public void save(String fileName, String line){
        Path file;
        switch(fileName){
            case "doctors.csv": file = doctorsFile; break;
            case "patients.csv": file = patientsFile; break;
            case "appointments.csv": file = appointmentsFile; break;
            default:
                System.out.println("Archivo inválido");
                return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.toFile(), true))) {
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}
