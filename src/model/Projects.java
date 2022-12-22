package model;

public class Projects {
    
    private int project_id;
    private String project_name;
    private String progress;
    private int pm_id;
    private int tl_id;

    public Projects() {
        
    }

    public void setProjectID(int project_id) {
        this.project_id = project_id;
    }

    public int getProjectID() {
        return this.project_id;
    }

    public void setProjectName(String project_name) {
        this.project_name = project_name;
    }

    public String getProjectName() {
        return this.project_name;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getProgress() {
        return this.progress;
    }

    public void setPMID(int pm_id) {
        this.pm_id = pm_id;
    }

    public int getPMID() {
        return this.pm_id;
    }

    public void setTLID(int tl_id) {
        this.tl_id = tl_id;
    }

    public int getTLID() {
        return this.tl_id;
    }
    
}
