package controller;

import model.*;
import javax.swing.JTable;

public interface AttendanceRepo {

    Attendance attendance = new Attendance();
  
    public void insert();
    public void update();
    public void delete(JTable table);
    public int selectAttendanceNo();
    public String selectTime(int sqlNum);
}
