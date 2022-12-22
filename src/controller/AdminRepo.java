package controller;

import model.*;

public interface AdminRepo {
    
    Admin admin = new Admin();

    public boolean insert();
    public void update();
    public void delete();
    public boolean login();
    public boolean checkPassword(String password);
    public String selectName();
}
