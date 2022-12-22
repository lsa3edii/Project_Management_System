package controller;

import model.*;
import javax.swing.JTable;

public interface UsersRepo {

    Users users = new Users();

    public void insert(String tableName, int columnsNumber);
    public void update(String tableName, int columnsNumber, JTable table);
    public void delete(String tableName, JTable table);
    public boolean login(String tableName);
    public int selectPenalty();
    //public void search(String tableName, JTable table);
}
