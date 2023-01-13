package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
    
    private static Connection connection = null;
    private static String url;
    
    public Database() {
        
    }

    public static Connection connect() {
        url = "jdbc:sqlserver://LSA3EDII\\SQLEXPRESS;databaseName=ProjectManagement;"
                + "integratedSecurity=true;encrypt=false";

        //url = "jdbc:sqlite:PMS.db";

        try {
            connection = DriverManager.getConnection(url);
            return connection;
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
}
