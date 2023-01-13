package controller;

import java.sql.*;
import javax.swing.*;

public class VacationsMethods implements VacationsRepo {
    
    private Connection connection = Database.connect();
    private String sql;

    public VacationsMethods() {
        
    }

    @Override
    public void insert() {
        sql = "insert into vacation values(?,?,?,?,?)";
        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            
            insert.setString(1, vacation.getDayFrom());
            insert.setString(2, vacation.getDayTo());
            insert.setString(3, vacation.getReson());
            insert.setString(4, "");
            insert.setInt(5, vacation.getEmployeeID());
            insert.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(JTable table) {
        sql = "update vacation set state = '" + vacation.getState() + "' where id = "
                + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement update = connection.prepareStatement(sql);
            update.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(JTable table) {
        sql = "delete from vacation where id = " + table.getValueAt(table.getSelectedRow(), 0);

        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
