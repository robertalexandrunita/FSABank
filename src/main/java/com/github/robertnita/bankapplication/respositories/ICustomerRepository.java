package com.github.robertnita.bankapplication.respositories;

import com.github.robertnita.bankapplication.models.Customer;
import java.util.ArrayList;


/**
 * @author Robert Nita
 * Date: Oct 2, 2017
 */
public interface ICustomerRepository {

    /**
     * Gets all the customers of the database
     * 
     * @return - A List of Customers
     */
    ArrayList<Customer> all();

    /**
     * Gets a customer in the database by specifying the account number
     *
     * @param accountNumber the account number of the customer
     * @return - A Customer
     */
    Customer find(int accountNumber);

    /**
     * Updates a specific customer in the database
     *
     * @param customer the Customer to update
     */
    void update(Customer customer);

    /**
     * Stores a new customer in the database
     *
     * @param customer the Customer to be stored
     */
    void store(Customer customer);

    /**
     * Destroy a customer of the database
     *
     * @param customer the Customer to be destroyed
     */
    void destroy(Customer customer);

}
