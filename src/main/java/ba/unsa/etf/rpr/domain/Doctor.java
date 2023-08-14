package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Doctor implements Idable, Passwordabel {
        private int id;
        private String Name;
        private String password;

        // Constructors

        public Doctor(int id, String name) {
            this.id = id;
            this.Name = name;
        }

        public Doctor() {

        }

    //Getters and Setters

        public int getId() {
            return id;
        }

        public String getName() {
            return Name;
        }

        public String getPassword() {
            return password;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && Objects.equals(Name, doctor.Name) && Objects.equals(password, doctor.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, password);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Name='" + Name +
                '}';
    }
}


