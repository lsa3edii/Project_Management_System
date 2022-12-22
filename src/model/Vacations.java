package model;

public class Vacations {
    
    private String dayFrom;
    private String dayTo;
    private String reson;
    private String state;
    private int employee_id;

    public Vacations() {
        
    }

    public void setEmployeeID(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEmployeeID() {
        return this.employee_id;
    }

    public void setDayFrom(String dayFrom) {
        this.dayFrom = dayFrom;
    }

    public String getDayFrom() {
        return this.dayFrom;
    }

    public void setDayTo(String dayTo) {
        this.dayTo = dayTo;
    }

    public String getDayTo() {
        return this.dayTo;
    }

    public void setReson(String reson) {
        this.reson = reson;
    }

    public String getReson() {
        return this.reson;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
    
}
