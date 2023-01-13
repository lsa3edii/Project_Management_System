package controller;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.JOptionPane;

public class TasksMethods implements ProjectsTasksRepo {
    
    private Connection connection = Database.connect();
    private String sql;

    public TasksMethods() {
        
    }

    @Override
    public void insert() {
        sql = "insert into tasks values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            
            insert.setInt(1, task.getTaskID());
            insert.setString(2, task.getTaskName());
            insert.setString(3, " ");
            insert.setInt(4, task.getEmployeeID());
            insert.setInt(5, task.getTLID());
            insert.setInt(6, task.getProjectID());
            insert.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(JTable table, int sqlNum) {
        if(sqlNum == 0)
            sql = "update tasks set id = " + task.getTaskID() + " ,task_name = '" + task.getTaskName() 
                    + "' ,employee_id = " + task.getEmployeeID() + " ,tl_id = " + task.getTLID() + ", project_id = " + task.getProjectID() + " where id = " 
                    + table.getValueAt(table.getSelectedRow(), 0);
       
        else if(sqlNum == 1)
            sql = "update tasks set task_state = '" + task.getTaskState() + "' where id = " 
                    + table.getValueAt(table.getSelectedRow(), 0);
        
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
        sql = "delete from tasks where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

}
