package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.domain.Idable;
import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.util.List;

/**
 * Interface that defines main attributes for every manager class
 * @param <Type>
 */
public interface Manager<Type extends Idable> {
    /**
     * Method that return an item from the database that has the
     * same id
     * @param id we search
     * @return item with provided id
     * @throws DentalClinicException if something goes wrong
     */
    Type getById(int id) throws DentalClinicException;

    /**
     * Method that return every element from a table in a databse
     * @return list of elements
     * @throws DentalClinicException
     */
    List<Type> getAll() throws DentalClinicException;

    /**
     * Method which deletes an element from the database
     * @param id of the element we want to delete
     * @throws DentalClinicException
     */
    void delete(int id) throws DentalClinicException;

    /**
     * Method which updates an item in the database
     * @param item we want to update
     * @throws DentalClinicException
     */
    void update(Type item) throws DentalClinicException;

    /**
     * Method that adds an item to the database
     * @param item we want to add
     * @throws DentalClinicException
     */
    void add(Type item) throws DentalClinicException;

}
