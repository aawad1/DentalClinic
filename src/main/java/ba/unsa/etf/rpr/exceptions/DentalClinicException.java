package ba.unsa.etf.rpr.exceptions;

/**
 * Custom exception made for this Application
 * @author Abdullah Awad
 */
public class DentalClinicException extends Exception{

    public DentalClinicException(String msg){
        super(msg);
    }

    public DentalClinicException(String msg, Exception reason){
        super(msg, reason);
    }
}
