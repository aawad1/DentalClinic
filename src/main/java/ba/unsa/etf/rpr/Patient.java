package ba.unsa.etf.rpr;

import java.util.Date;

public class Patient implements Idable, Passwordabel{
    private int id;
    private String Name;
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;
    private String address;

    // Constructors

    public Patient(int id, String Name, Date dateOfBirth, String phoneNumber, String email, String address) {
        this.id = id;
        this.Name = Name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

