package ba.unsa.etf.rpr.domain;

import javafx.scene.control.DatePicker;

import java.util.Objects;

public class Appointment implements Idable {
    private int id;
    private Patient patient;
    private DatePicker dateTime;
    private String notes;

    //Constructors

    //Appointment with notes
    public Appointment(int id, Patient patient, DatePicker dateTime, String notes) {
        this.id = id;
        this.patient = patient;
        this.dateTime = dateTime;
        this.notes = notes;
    }

    //Appointment without notes
    public Appointment(int id, Patient patient, DatePicker dateTime) {
        this.id = id;
        this.patient = patient;
        this.dateTime = dateTime;
    }

    public Appointment() {}

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public DatePicker getDateTime() {
        return dateTime;
    }

    public void setDateTime(DatePicker dateTime) {
        this.dateTime = dateTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return id == that.id && patient == that.patient && Objects.equals(dateTime, that.dateTime) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patient, dateTime, notes);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patient=" + patient +
                ", dateTime=" + dateTime +
                ", notes='" + notes + '\'' +
                '}';
    }
}

