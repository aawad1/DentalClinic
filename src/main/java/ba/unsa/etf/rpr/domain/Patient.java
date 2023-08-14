package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Patient implements Idable {
    private int id;
    private String Name;
    private int age;
    private String phoneNumber;

    // Constructors

    public Patient(int id, String Name, int age, String phoneNumber) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && Objects.equals(Name, patient.Name) && age == patient.age && Objects.equals(phoneNumber, patient.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, age, phoneNumber);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}

