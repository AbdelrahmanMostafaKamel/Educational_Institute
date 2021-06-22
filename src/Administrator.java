public class Administrator extends  Person{
    private String contact;
    private String role;
    public Administrator(String name,String contact,String role){
        super(name);
        this.contact=contact;
        this.role=role;
    }
    public Administrator(){
        name=null;
        contact=null;
        role=null;
    }
    public void setContact(String contact){
        this.contact=contact;
    }
    public String getContact(){
        return contact;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
}
