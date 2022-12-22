package controller;

import model.*;
import javax.swing.JTable;

public interface VacationsRepo {
    
    Vacations vacation = new Vacations();

    public void insert();
    public void update(JTable table);
    public void delete(JTable table);    
}
