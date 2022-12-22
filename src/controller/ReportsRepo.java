package controller;

import model.*;

public interface ReportsRepo {
    
    Reports report = new Reports();

    public void insert();
    public String selectReport();
}
