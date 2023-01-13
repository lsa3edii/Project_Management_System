package model;

public class Person {
    
    private int id;
    private String name;
    private String password;
    
    public Person() {
        
    } 
    
    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
}
