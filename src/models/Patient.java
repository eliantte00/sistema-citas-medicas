package models;

public class Patient {
    private String id;
    private String name;

    public Patient(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + "," + name;
    }
}
