package controller;

import model.*;
import javax.swing.JTable;

public interface ProjectsTasksRepo {

    Projects project = new Projects();
    Tasks task = new Tasks();
    
    public void insert();
    public void update(JTable table, int sqlNum);
    public void delete(JTable table);
}
