package model;

public class Tasks {
    
    private int task_id;
    private String task_name;
    private String task_state;
    private int employee_id;
    private int tl_id;
    private int project_id;

    public Tasks() {
        
    }

    public void setTaskID(int task_id) {
        this.task_id = task_id;
    }

    public int getTaskID() {
        return this.task_id;
    }

    public void setTaskName(String task_name) {
        this.task_name = task_name;
    }

    public String getTaskName() {
        return this.task_name;
    }

    public void setTaskState(String task_state) {
        this.task_state = task_state;
    }

    public String getTaskState() {
        return this.task_state;
    }

    public void setEmployeeID(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEmployeeID() {
        return this.employee_id;
    }

    public void setTLID(int tl_id) {
        this.tl_id = tl_id;
    }

    public int getTLID() {
        return this.tl_id;
    }

    public void setProjectID(int project_id) {
        this.project_id = project_id;
    }

    public int getProjectID() {
        return this.project_id;
    }
    
}
