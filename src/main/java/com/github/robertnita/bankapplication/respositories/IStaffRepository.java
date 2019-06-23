package com.github.robertnita.bankapplication.respositories;

import com.github.robertnita.bankapplication.models.Staff;
import java.util.ArrayList;

/**
 * @author Robert Nita
 * Date: Oct 4, 2017
 */
public interface IStaffRepository {

    /**
     * Gets all the staffs of the database
     *
     * @return - A List of Staffs
     */
    ArrayList<Staff> all();

    /**
     * Gets a staff in the database by specifying the id
     *
     * @param id the id of the staff
     * @return - A Staff
     */
    Staff find(int id);

    /**
     * Updates a specific staff in the database
     *
     * @param staff the Staff to update
     */
    void update(Staff staff);

    /**
     * Stores a new staff in the database
     *
     * @param staff the Staff to be stored
     */
    void store(Staff staff);

    /**
     * Destroy a staff of the database
     *
     * @param staff the Staff to be destroyed
     */
    void destroy(Staff staff);

}
