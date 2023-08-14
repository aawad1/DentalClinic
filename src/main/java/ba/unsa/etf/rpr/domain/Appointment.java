package ba.unsa.etf.rpr.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment {
    private int id;
    private int patientId;
    private LocalDateTime dateTime;
    private String notes;

    //Constructors

    //Appointment with notes
    public Appointment(int id, int patientId, LocalDateTime dateTime, String notes) {
        this.id = id;
        this.patientId = patientId;
        this.dateTime = dateTime;
        this.notes = notes;
    }

    //Appointment without notes
    public Appointment(int id, int patientId, LocalDateTime dateTime) {
        this.id = id;
        this.patientId = patientId;
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

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
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
        return id == that.id && patientId == that.patientId && Objects.equals(dateTime, that.dateTime) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, dateTime, notes);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", dateTime=" + dateTime +
                ", notes='" + notes + '\'' +
                '}';
    }
}

