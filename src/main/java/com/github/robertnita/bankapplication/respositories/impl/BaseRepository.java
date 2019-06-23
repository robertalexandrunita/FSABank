package com.github.robertnita.bankapplication.respositories.impl;

import com.github.robertnita.bankapplication.database.ConnectionManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Robert Nita
 * Date: Oct 2, 2017
 */
public class BaseRepository {
    protected ConnectionManager connectionManager;
    protected Statement statement;
    protected PreparedStatement pstmt;
    protected ResultSet rs;
    
    public BaseRepository() {
        this.connectionManager = ConnectionManager.getInstance();
    }
}
