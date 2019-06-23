package com.github.robertnita.bankapplication.models;

import java.util.Date;

/**
 * @author Robert Nita 
 */
public class Deposit {

    private String accountNumber;
    private double amount;
    private Date date;

    public Deposit(String accountNumber, double amount, Date date)
    {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.date = date;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

}
