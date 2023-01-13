package controller;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.JOptionPane;

public class ProjectsMethods implements ProjectsTasksRepo {
    
    private Connection connection = Database.connect();
    private String sql;

    public ProjectsMethods() {
        
    }

    @Override
    public void insert() {
        sql = "insert into projects values(?,?,?,?,?)";
        
        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            
            insert.setInt(1, project.getProjectID());
            insert.setString(2, project.getProjectName());
            insert.setString(3, "");
            insert.setInt(4, project.getTLID());
            insert.setInt(5, project.getPMID());
            insert.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(JTable table, int sqlNum) {
        if(sqlNum == 0)
            sql = "update projects set id = " + project.getProjectID() + " ,project_name = '" + project.getProjectName() 
                    + "' ,tl_id = " + project.getTLID() + " ,pm_id = " + project.getPMID() + " where id = " 
                    + table.getValueAt(table.getSelectedRow(), 0);
       
        else if(sqlNum == 1)
            sql = "update projects set progress = '" + project.getProgress() + "' where id = " 
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
        sql = "delete from projects where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

}
