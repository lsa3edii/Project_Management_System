package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class AdminMethods implements AdminRepo {
    
    private Connection connection = Database.connect();
    private ResultSet result = null;
    private String sql;

    public AdminMethods() {
        
    }

    @Override
    public boolean insert() {
        sql = "insert into Admin values(?,?,?)";
        
        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            
            insert.setInt(1, admin.getID());
            insert.setString(2, admin.getName());
            insert.setString(3, admin.getPassword());
            insert.executeUpdate();
            return true;
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    @Override
    public void update() {
        sql = "update Admin set name = '" + admin.getName() + "' ,password = '" + admin.getPassword() 
                + "' where id = " + admin.getID();
        
        try {
            PreparedStatement update = connection.prepareStatement(sql);
            update.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public void delete() {
        sql = "delete from Admin where id = " + admin.getID();
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public boolean login() {
        sql = "select * from Admin where id = ? and password = ?";
        try {
            PreparedStatement check = connection.prepareStatement(sql);
            
            check.setInt(1, admin.getID());
            check.setString(2, admin.getPassword());
            result = check.executeQuery();
            
            if(result.next())
                return true;
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
        
    @Override
    public boolean checkPassword(String password) {
        sql = "select password from Admin where id = " + admin.getID();

        try {
            PreparedStatement check = connection.prepareStatement(sql);
            result = check.executeQuery();
            
            if(result.next() && result.getString("password").equals(password)) 
                return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    @Override
    public String selectName() {
        sql = "select name from Admin where id = " + admin.getID();

        try {
            PreparedStatement select = connection.prepareStatement(sql);
            result = select.executeQuery();
            
            if(result.next())
                return result.getString("name");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);//        
        }
        return null;
    }
    
}
