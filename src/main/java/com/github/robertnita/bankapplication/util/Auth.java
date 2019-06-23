package com.github.robertnita.bankapplication.util;

/**
 * @author Robert Nita
 */
public class Auth {

    private static String accountNumber;
    private static String name;
    private static String type;

    public static String name()
    {
        return name;
    }

    public static String accountNumber()
    {
        return accountNumber;
    }

    public static String type()
    {
        return type;
    }

    public static void setAccountNumber(String accountNumber)
    {
        Auth.accountNumber = accountNumber;
    }

    public static void setName(String name)
    {
        Auth.name = name;
    }

    public static void setType(String type)
    {
        Auth.type = type;
    }

}
