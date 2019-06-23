package com.bankapplication.database;

import com.github.robertnita.bankapplication.database.ConnectionManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Robert Nita
 */
public class ConnectionManagerTest {

    private ConnectionManager instance;

    public ConnectionManagerTest()
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
     * Test of createConnection method, of class ConnectionManager.
     */
    @Test
    public void testCreateConnection()
    {
        instance = ConnectionManager.getInstance();
        Connection conn = instance.createConnection();
        Statement stmt;
        ResultSet rs;
        try {
            stmt = (Statement) conn.createStatement();
            rs = stmt.executeQuery("select * from staffs");
            rs.next();
            // Name used for test
            assertNotEquals(null, rs.getString("name"));

        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex);
        }

    }

}
