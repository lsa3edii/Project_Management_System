package model;

public class Users extends Person {
        
//    private int id;
//    private String name;
//    private String password;
    private String position;
    private int penalty;
    private int tl_id;
    private int pm_id;
    private int admin_id;

    public Users() {
        //super();
    }

//    @Override
//    public void setID(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public int getID() {
//        return this.id;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String getName() {
//        return this.name;
//    }
//
//    @Override
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String getPassword() {
//        return this.password;
//    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setAdminID(int admin_id) {
        this.admin_id = admin_id;
    }

    public int getAdminID() {
        return this.admin_id;
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

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getPenalty() {
        return this.penalty;
    }
    
}
