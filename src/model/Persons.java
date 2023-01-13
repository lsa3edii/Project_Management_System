package model;

public abstract class Persons {
    
//    protected int id;
//    protected String name;
//    protected String password;
    
    protected Persons() {
        
    }
    
    public abstract void setID(int id);
    public abstract int getID();
    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setPassword(String password);
    public abstract String getPassword();
}
