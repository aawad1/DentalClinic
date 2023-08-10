package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.exceptions.DentalClinicException;

import java.util.List;

/**
 * Gave interface represents the main interface for working with the database
 */

public interface Dao<Type> {
    /**
     * Get from database by Id
     * @param id primary key for entity
     * @return entity from database
     */
    Type getById(int id) throws DentalClinicException;

    /**
     * Saves to database
     * @param item - bean to be updated to database
     * @return saved item to database
     */
    Type add(Type item) throws DentalClinicException;

    /**
     * Updates entity in database based on primary key
     * @param item - bean to be updated
     * @return updated version to bean
     */
    Type update(Type item) throws DentalClinicException;

    /**
     * Hard delete item from database
     * @param id - primary key of entity
     */
    void delete(int id) throws DentalClinicException;

    /**
     * Lists all entities in database
     * @return List of entities
     */
    List<Type> getAll() throws DentalClinicException;
}
