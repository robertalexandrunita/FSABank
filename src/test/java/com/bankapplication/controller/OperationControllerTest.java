package com.bankapplication.controller;

import com.github.robertnita.bankapplication.controllers.OperationController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Robert Nita
 */
public class OperationControllerTest {

    private OperationController instance;

    public OperationControllerTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of makeDeposit method, of class OperationController.
     */
    @Test
    public void testMakeDeposit()
    {
        System.out.println("makeDeposit");
        //instance = OperationController.getInstance();
        //instance.makeDeposit(1, 1000);
    }

    /**
     * Test of makeWithdraw method, of class OperationController.
     */
    @Test
    public void testMakeWithdraw()
    {
        System.out.println("makeWithdraw");
        instance = OperationController.getInstance();
        instance.makeDeposit(1, 1000);
        instance.makeWithdraw(1, 600);
        instance.makeWithdraw(1, 600);
        instance.makeWithdraw(1, 400);
        System.out.println(instance.getBalance(1));
    }

    /**
     * Test of getBalance method, of class OperationController.
     */
    @Test
    public void testGetBalance()
    {
        System.out.println("getBalance");
        //instance = OperationController.getInstance();
        //System.out.println(instance.getBalance(1));
    }

}
