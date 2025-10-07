package models;

public class Appointment {
    private String id;
    private String dateTime;
    private String reason;
    private String doctorId;
    private String patientId;

    public Appointment(String id, String dateTime, String reason, String doctorId, String patientId){
        this.id = id;
        this.dateTime = dateTime;
        this.reason = reason;
        this.doctorId = doctorId;
        this.patientId = patientId;
    }

    public String getId() { return id; }

    @Override
    public String toString() {
        return id + "," + dateTime + "," + reason + "," + doctorId + "," + patientId;
    }
}
