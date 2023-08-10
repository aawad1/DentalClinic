package ba.unsa.etf.rpr.domain;

/**
 * Passwordable is an interface that has to be implemented
 * by every class that represents an entity in the Data Base
 * and has the property password
 */
public interface Passwordabel {

    void setPassword(String password);

    String getPassword();

}
