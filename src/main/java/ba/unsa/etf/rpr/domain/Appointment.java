package ba.unsa.etf.rpr.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Appointment implements Idable {
    private int id;
    //private int PatientId;
    private Patient patient;
    private LocalDate date;
    private String notes;

    //Constructors

    //Appointment with notes
    public Appointment(int id, Patient patient, LocalDate date, String notes) {
        this.id = id;
        this.patient = patient;
        this.date = date;
        this.notes = notes;
    }

    //Appointment without notes
    public Appointment(int id, Patient patient, LocalDate date) {
        this.id = id;
        this.patient = patient;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
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
        return id == that.id && patient == that.patient && Objects.equals(date, that.date) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patient, date, notes);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patient=" + patient +
                ", date=" + date +
                ", notes='" + notes + '\'' +
                '}';
    }


}

