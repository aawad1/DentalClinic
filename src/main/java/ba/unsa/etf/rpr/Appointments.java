package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Appointments {
    private List<Appointment> appointmentList;

    public Appointments() {
        appointmentList = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
}

