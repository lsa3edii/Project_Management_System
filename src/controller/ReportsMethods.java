package controller;

import java.sql.*;
import javax.swing.*;

public class ReportsMethods implements ReportsRepo {
    
    private Connection connection = Database.connect();
    private ResultSet result = null;
    private String sql;

    public ReportsMethods() {
        
    }

    @Override
    public void insert() {
        sql = "insert into reports values(?,?,?)";

        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            
            insert.setString(1, report.getReport());
            insert.setInt(2, report.getEmployeeID());
            insert.setInt(3, report.getTLID());
            insert.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String selectReport() {
        sql = "select report from reports where id = " + report.getReportID();

        try {
            PreparedStatement select = connection.prepareStatement(sql);
            result = select.executeQuery();
            
            if(result.next())
                return result.getString("report");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);//        
        }
        return null;
    }
    
}
