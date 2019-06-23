package com.github.robertnita.bankapplication.respositories;

import com.github.robertnita.bankapplication.models.Deposit;
import com.github.robertnita.bankapplication.models.Withdraw;
import java.util.ArrayList;

/**
 *
 * @author Robert Nita
 */
public interface IOperationRepository {

    /**
     * Stores a new deposit in the database
     *
     * @param customerId the customer id
     * @param amount the amount to be deposited
     */
    void deposit(int customerId, double amount);

    /**
     * Stores a new withdraw in the database
     *
     * @param customerId the customer id
     * @param amount the amount to be withdrawn
     */
    void withdraw(int customerId, double amount);

    /**
     * Gets all the deposits
     *
     * @return a list with all the deposits made
     */
    ArrayList<Deposit> deposits();

    /**
     * Gets all the withdraws
     *
     * @return a list with all the withdraws made
     */
    ArrayList<Withdraw> withdraws();

    /**
     * Gets all the deposits of a customer
     *
     * @param customerId the customer id
     * @return a list with all the deposits made by a specific customer
     */
    ArrayList<Deposit> deposits(int customerId);

    /**
     * Gets all the withdraws of a customer
     *
     * @param customerId the customer id
     * @return a list with all the withdraws made by a specific customer
     */
    ArrayList<Withdraw> withdraws(int customerId);

}
