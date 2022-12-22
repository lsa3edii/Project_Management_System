package model;

public class Attendance {
    
    private int attendance_no;
    private String enterTime;
    private String exitTime;
    private String date;
    private int employee_id;

    public Attendance() {
        
    }

    public void setAttendanceNo(int attendance_no) {
        this.attendance_no = attendance_no;
    }

    public int getAttendanceNo() {
        return this.attendance_no;
    }

    public void setEmployeeID(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEmployeeID() {
        return this.employee_id;
    }

    public void setEnterTime(String enterTime) {
        this.enterTime = enterTime;
    }

    public String getEnterTime() {
        return this.enterTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    public String getExitTime() {
        return this.exitTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
    
}
