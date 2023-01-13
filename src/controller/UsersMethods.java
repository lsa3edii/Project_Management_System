package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import net.proteanit.sql.DbUtils;

public class UsersMethods implements UsersRepo {

    private Connection connection = Database.connect();
    private Statement statement = null;
    private ResultSet result = null;
    private String sql;
    
    public UsersMethods() {
        
    }

    @Override
    public void insert(String tableName, int columnsNumber) {
        sql = "insert into " + tableName + " values(?,?,?,?,?)";
        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            
            if(columnsNumber == 5)
                insert.setInt(5, users.getAdminID());
                
            else if(columnsNumber == 6) {
                sql = "insert into " + tableName + " values(?,?,?,?,?,?)";
                insert = connection.prepareStatement(sql);
                insert.setInt(5, users.getPMID());
                insert.setInt(6, users.getAdminID());

            } else if(columnsNumber == 8) {
                sql = "insert into " + tableName + " values(?,?,?,?,?,?,?,?)";
                insert = connection.prepareStatement(sql);
                insert.setInt(5, 0);
                insert.setInt(6, users.getTLID());
                insert.setInt(7, users.getPMID());
                insert.setInt(8, users.getAdminID());
            }
            
            insert.setInt(1, users.getID());
            insert.setString(2, users.getName());
            insert.setString(3, users.getPassword());
            insert.setString(4, users.getPosition());
            insert.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(String tableName, int columnsNumber, JTable table) {
        sql = "update " + tableName + " set id = " + users.getID() + " ,name = '" + users.getName() 
                + "' ,password = '" + users.getPassword() + "' ,admin_id = " + users.getAdminID() + " where id = " 
                + table.getValueAt(table.getSelectedRow(), 0);
        
        if(columnsNumber == 6)
            sql = "update " + tableName + " set id = " + users.getID() + " ,name = '" + users.getName() 
                + "' ,password = '" + users.getPassword() + "' ,pm_id = " + users.getPMID() + " ,admin_id = " + users.getAdminID() + " where id = " 
                + table.getValueAt(table.getSelectedRow(), 0);
        
        else if(columnsNumber == 8)
            sql = "update " + tableName + " set id = " + users.getID() + " ,name = '" + users.getName() 
                + "' ,password = '" + users.getPassword() + "' ,pm_id = " + users.getPMID() + " ,tl_id = " 
                + users.getTLID() + " ,admin_id = " + users.getAdminID() + " where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        else if(columnsNumber == 3)
            sql = "update " + tableName + " set penalty = " + users.getPenalty() + " where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement update = connection.prepareStatement(sql);
            update.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public void delete(String tableName, JTable table) {
        sql = "delete from " + tableName + " where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public boolean login(String tableName) {
        sql = "select * from " +  tableName  + " where id = ? and password = ?";
        try {
            PreparedStatement check = connection.prepareStatement(sql);
            
            check.setInt(1, users.getID());
            check.setString(2, users.getPassword());
            result = check.executeQuery();
            
            if(result.next())
                return true;
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

//    @Override
//    public void search(String tableName, JTable table) {
//        sql = "select * from " + tableName + " where name like '%" + users.getSearch() + "%'";
//        
//        try {
//            statement = connection.createStatement();
//            result = statement.executeQuery(sql);
//            table.setModel(DbUtils.resultSetToTableModel(result));
//            
//        } catch(Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
//        }
//    }    

    @Override
    public int selectPenalty() {
        sql = "select penalty from employee where id = " + users.getID();

        try {
            PreparedStatement select = connection.prepareStatement(sql);
            result = select.executeQuery();
            
            if(result.next())
                return result.getInt("penalty");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);//        
        }
        return 0;
    }
    
}
