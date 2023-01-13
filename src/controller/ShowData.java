package controller;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;

public class ShowData {
    
    private String sql;
    private Connection connection = Database.connect();
    private Statement statement = null;
    private ResultSet result = null;
    UsersRepo user;

    public ShowData() {
        
    }

    public void DataInTable(String tableName, JTable table, int sqlNum) {
        //sql = "select * from " + tableName;
        sql = choseSql(tableName, sqlNum);
        
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(result));
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public String choseSql(String tableName, int num) {
        switch(num) {
            case 1: sql = "select * from " + tableName;
                break;
            case 2: sql = "select id as 'project_id', project_name, tl_id, pm_id from " + tableName + " where pm_id = " + user.users.getID();
                break;
            case 3: sql = "select id as 'project_id', project_name, progress from " + tableName + " where pm_id = " + user.users.getID();
                break;
            case 4: sql = "select id as 'project_id', project_name, progress from " + tableName + " where tl_id = " + user.users.getID();
                break;
            case 5: sql = "select id as 'task_id', task_name, employee_id, project_id from " + tableName + " where tl_id = " + user.users.getID();
                break;
            case 6: sql = "select id as 'task_id', task_name, employee_id, project_id, task_state from " + tableName + " where tl_id = " + user.users.getID();
                break;
            case 7: sql = "select id as 'task_id', task_name, project_id from " + tableName + " where employee_id = " + user.users.getID();
                break;
            case 8: sql = "select id as 'task_id', task_name, task_state, project_id from " + tableName + " where employee_id = " + user.users.getID();
                break;
            case 9: sql = "select a.id as 'attendance_No', enter_time, exit_time, date, employee_id from " + tableName + " a, employee e where a.employee_id = e.id and pm_id = " + user.users.getID();
                break;
            case 10: sql = "select v.id as 'vacation_No', day_from, day_to, reson, state, employee_id, name from " + tableName + " v, employee e where v.employee_id = e.id and tl_id = " + user.users.getID();
                break;
            case 11: sql = "select day_from, day_to, state from " + tableName + " where employee_id = " + user.users.getID();
                break;
            case 12: sql = "select id as 'employee_id', name as 'employee_name', penalty from " + tableName + " where tl_id = " + user.users.getID();;
                break;
            case 13: sql = "select e.id as 'employee_id', e.name as 'employee_name', tl_id, l.name as 'tl_name' from " + tableName + " e, team_leader l where l.id = e.tl_id and e.pm_id = " + user.users.getID();
                break;
            case 14: sql = "select id, name, password, position, tl_id, pm_id, admin_id from " + tableName;
                break;
            case 15: sql = "select r.id as 'report_no', r.employee_id , e.name as 'employee_name' from " + tableName + " r, employee e, team_leader l where r.employee_id = e.id and r.tl_id = l.id and l.id = " + user.users.getID();
                break;
            default:
                //
        }
        return sql;
    }
    
    public void DataInTableAfterSearch1(String tableName, String search, JTable table) {
        sql = "select * from " + tableName + " where id like '%" + search + "%'";
        
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(result));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    public void DataInTableAfterSearch2(String search, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter <DefaultTableModel> filter = new TableRowSorter <DefaultTableModel>(model);
        table.setRowSorter(filter);
        filter.setRowFilter(RowFilter.regexFilter(search.trim()));
    }    
    
}
