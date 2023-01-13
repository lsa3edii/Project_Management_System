package controller;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.JOptionPane;

public class AttendanceMethods implements AttendanceRepo {
    
    private Connection connection = Database.connect();
    private ResultSet result = null;
    private String sql;
    UsersRepo user;
    
    public AttendanceMethods() {
        
    }

    @Override
    public void insert() {
        sql = "insert into attendance values(?,?,?,?)";
        
        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            
            insert.setString(1, attendance.getEnterTime());
            insert.setString(2, attendance.getExitTime());
            insert.setString(3, attendance.getDate());
            insert.setInt(4, attendance.getEmployeeID());
            insert.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update() {
        sql = "update attendance set exit_time = '" + attendance.getExitTime() + "' where id = " 
                + attendance.getAttendanceNo();
       
        try {
            PreparedStatement update = connection.prepareStatement(sql);
            update.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(JTable table) {
        sql = "delete from attendance where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public int selectAttendanceNo() {
        sql = "select id from attendance where employee_id = " + user.users.getID() + " and date = '" + attendance.getDate() + "' ";

        try {
            PreparedStatement select = connection.prepareStatement(sql);
            result = select.executeQuery();
            
            if(result.next())
                return result.getInt("id");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);//        
        }
        return 0;
    }
    
    @Override
    public String selectTime(int sqlNum) {
        if(sqlNum == 1)
            sql = "select enter_time from attendance where id = " + attendance.getAttendanceNo();
        else
            sql = "select exit_time from attendance where id = " + attendance.getAttendanceNo();

            try {
            PreparedStatement select = connection.prepareStatement(sql);
            result = select.executeQuery();
            
            if(sqlNum == 1 && result.next())
                return result.getString("enter_time");
            
            else if(sqlNum == 2 && result.next())
                return result.getString("exit_time");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);//        
        }
        return null;
    }
    
}
