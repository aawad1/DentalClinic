package ba.unsa.etf.rpr.exceptions;

/**
 * Custom exception made for this Application
 * @author Harun Špago
 */
public class DentalClinicException extends Exception{

    public DentalClinicException(String msg)

    public DentalClinicException(String msg, Exception reason){
        super(msg, reason);
    }
}
