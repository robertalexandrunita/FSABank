package com.github.robertnita.bankapplication.controllers;

import com.github.robertnita.bankapplication.models.Customer;
import com.github.robertnita.bankapplication.respositories.impl.CustomerRepository;
import java.util.ArrayList;

/**
 * @author Robert Nita
 */
public class CustomerController {

    private static CustomerController customerCtrl;
    private final CustomerRepository customerRepository;

    private CustomerController()
    {
        this.customerRepository = new CustomerRepository();
    }

    public void store(Customer customer)
    {
        customerRepository.store(customer);
    }

    public ArrayList<Customer> getCustomers()
    {
        return customerRepository.all();
    }

    public Customer searchCustomer(int accountNumber)
    {
        return customerRepository.find(accountNumber);
    }

    public void update(Customer customer)
    {
        customerRepository.update(customer);
    }

    public void destroy(Customer customer)
    {
        customerRepository.destroy(customer);
    }

    public static CustomerController getInstance()
    {
        if (customerCtrl == null) {
            customerCtrl = new CustomerController();
        }
        return customerCtrl;
    }
}
