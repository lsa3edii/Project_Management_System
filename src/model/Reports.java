package model;

public class Reports {
    
    private int report_id;
    private String report;
    private int employee_id;
    private int tl_id;

    public Reports() {
        
    }

    public void setReportID(int report_id) {
        this.report_id = report_id;
    }

    public int getReportID() {
        return report_id;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public void setEmployeeID(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEmployeeID() {
        return employee_id;
    }

    public void setTLID(int tl_id) {
        this.tl_id = tl_id;
    }

    public int getTLID() {
        return tl_id;
    }
    
}
