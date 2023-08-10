package ba.unsa.etf.rpr;

import java.util.Date;
import java.util.Objects;

public class Patient implements Idable, Passwordabel{
    private int id;
    private String Name;
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;

    // Constructors

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && Objects.equals(Name, patient.Name) && Objects.equals(dateOfBirth, patient.dateOfBirth) && Objects.equals(phoneNumber, patient.phoneNumber) && Objects.equals(email, patient.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, dateOfBirth, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Patient(int id, String Name, Date dateOfBirth, String phoneNumber, String email, String address) {
        this.id = id;
        this.Name = Name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

