package com.github.robertnita.bankapplication.respositories;

import com.github.robertnita.bankapplication.models.User;
import java.util.ArrayList;

/**
 * @author Robert Nita
 * Date: Oct 2, 2017
 */
public interface IUserRepository {

    /**
     * Gets all the users of the database
     * 
     * @return - A List of User
     */
    public ArrayList<User> all();

    /**
     * Gets a user in the database by specifying the id
     *
     * @param id the id of the User
     * @return - A User
     */
    public User find(int id);
    
        /**
     * Gets a user in the database by specifying the username
     *
     * @param accountNumber the id of the User
     * @return - A User
     */
    public User findByAccountNumber(int accountNumber);

    /**
     * Updates a specific user in the database
     *
     * @param user the User to update
     */
    public void update(User user);

    /**
     * Stores a new user in the database
     *
     * @param user the User to be stored
     */
    public void store(User user);

    /**
     * Destroy a user of the database
     *
     * @param user the User to be destroyed
     */
    public void destroy(User user);

}
