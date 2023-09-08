package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Patient implements Idable {
    private int id;
    private String Name;
    private int age;
    private String phoneNumber;
    private String notes;


// Constructors

    public Patient(int id, String Name, int age, String phoneNumber, String notes) {
        this.id = id;
        this.Name = Name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.notes = notes;
    }
    public Patient(String Name,int age, String phoneNumber){
        this.Name = Name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Patient() {}

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && age == patient.age && Objects.equals(Name, patient.Name) && Objects.equals(phoneNumber, patient.phoneNumber) && Objects.equals(notes, patient.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, age, phoneNumber, notes);
    }
}

